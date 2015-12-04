package org.robovm.pods.reachability;

import java.net.InetSocketAddress;
import java.util.Objects;

import org.robovm.apple.dispatch.DispatchQueue;
import org.robovm.apple.foundation.NSNotificationCenter;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.systemconfiguration.SCNetworkReachability;
import org.robovm.apple.systemconfiguration.SCNetworkReachability.ClientCallback;
import org.robovm.apple.systemconfiguration.SCNetworkReachabilityFlags;
import org.robovm.apple.systemconfiguration.SCStatus;

public class NetworkReachability extends NSObject {
    public static NSString REACHABILITY_CHANGE_NOTIFICATION = new NSString("kReachabilityChangedNotification");

    private NetworkReachabilityListener reachabilityListener;

    private final SCNetworkReachability reachability;
    private final DispatchQueue reachabilitySerialQueue;
    private NSObject reachabilityObject;

    private final boolean reachableOnWWAN;

    public static NetworkReachability forHostname(String hostname) {
        return new NetworkReachability(new SCNetworkReachability(hostname));
    }

    public static NetworkReachability forAddress(InetSocketAddress hostAddress) {
        return new NetworkReachability(new SCNetworkReachability(hostAddress));
    }

    public static NetworkReachability forInternetConnection() {
        InetSocketAddress zeroAddress = new InetSocketAddress(0);
        return forAddress(zeroAddress);
    }

    public static NetworkReachability forLocalWiFi() {
        InetSocketAddress localWifiAddress = new InetSocketAddress("169.254.0.0", 0);
        return forAddress(localWifiAddress);
    }

    public NetworkReachability(SCNetworkReachability reachability) {
        Objects.requireNonNull(reachability, "reachability");
        this.reachability = reachability;
        reachableOnWWAN = true;

        // We need to create a serial queue.
        // We allocate this once for the lifetime of the notifier.
        reachabilitySerialQueue = DispatchQueue.create("org.robovm.pods.reachability", null);
    }

    public void setListener(NetworkReachabilityListener listener) {
        this.reachabilityListener = listener;
    }

    @Override
    protected void dispose(boolean finalizing) {
        stopNotifier();
        super.dispose(finalizing);
    }

    public boolean startNotifier() {
        // allow start notifier to be called multiple times
        if (reachabilityObject != null && reachabilityObject == this) {
            return true;
        }

        if (reachability.setCallback(new ClientCallback() {
            @Override
            public void invoke(SCNetworkReachability target, SCNetworkReachabilityFlags flags) {
                reachabilityChanged(flags);
            }
        })) {
            // Set it as our reachability queue, which will retain the queue
            if (reachability.setDispatchQueue(reachabilitySerialQueue)) {
                // this should do a retain on ourself, so as long as we're in
                // notifier mode we shouldn't disappear out from under ourselves
                reachabilityObject = this;
                return true;
            } else {
                System.err.println(SCStatus.getStatusDescription(SCStatus.getLastStatus()));
                // Failure - stop any callbacks!
                reachability.setCallback(null);
            }
        } else {
            System.err.println(SCStatus.getStatusDescription(SCStatus.getLastStatus()));
        }
        // if we get here we fail at the internet
        reachabilityObject = null;
        return false;
    }

    public void stopNotifier() {
        // First stop, any callbacks!
        reachability.setCallback(null);

        // Unregister target from the GCD serial dispatch queue.
        reachability.setDispatchQueue(null);

        reachabilityObject = null;
    }

    private boolean isReachableWithFlags(SCNetworkReachabilityFlags flags) {
        boolean connectionUP = true;

        if (!flags.contains(SCNetworkReachabilityFlags.Reachable)) {
            connectionUP = false;
        }

        if (flags.contains(SCNetworkReachabilityFlags.ConnectionRequired)
                && flags.contains(SCNetworkReachabilityFlags.TransientConnection)) {
            connectionUP = false;
        }

        if (flags.contains(SCNetworkReachabilityFlags.IsWWAN)) {
            // We're on 3G.
            if (!reachableOnWWAN) {
                // We don't want to connect when on 3G.
                connectionUP = false;
            }
        }

        return connectionUP;
    }

    public boolean isReachable() {
        return isReachableWithFlags(getReachabilityFlags());
    }

    public boolean isReachableViaWWAN() {
        SCNetworkReachabilityFlags flags = getReachabilityFlags();
        // Check we're REACHABLE
        if (flags.contains(SCNetworkReachabilityFlags.Reachable)) {
            // Now, check we're on WWAN
            if (flags.contains(SCNetworkReachabilityFlags.IsWWAN)) {
                return true;
            }
        }

        return false;
    }

    public boolean isReachableViaWiFi() {
        SCNetworkReachabilityFlags flags = getReachabilityFlags();
        // Check we're REACHABLE
        if (flags.contains(SCNetworkReachabilityFlags.Reachable)) {
            // Now, check we're NOT on WWAN
            if (flags.contains(SCNetworkReachabilityFlags.IsWWAN)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isConnectionRequired() {
        return getReachabilityFlags().contains(SCNetworkReachabilityFlags.ConnectionRequired);
    }

    public boolean isConnectionOnDemand() {
        SCNetworkReachabilityFlags flags = getReachabilityFlags();
        return flags.contains(SCNetworkReachabilityFlags.ConnectionRequired)
                && (flags.contains(SCNetworkReachabilityFlags.ConnectionOnTraffic) || flags
                        .contains(SCNetworkReachabilityFlags.ConnectionOnDemand));
    }

    public boolean isInterventionRequired() {
        SCNetworkReachabilityFlags flags = getReachabilityFlags();
        return flags.contains(SCNetworkReachabilityFlags.ConnectionRequired)
                && flags.contains(SCNetworkReachabilityFlags.InterventionRequired);
    }

    public NetworkStatus getCurrentReachabilityStatus() {
        if (isReachable()) {
            if (isReachableViaWiFi()) {
                return NetworkStatus.ReachableViaWiFi;
            }
            return NetworkStatus.ReachableViaWWAN;
        }
        return NetworkStatus.NotReachable;
    }

    public SCNetworkReachabilityFlags getReachabilityFlags() {
        return reachability.getFlags();
    }

    public String getCurrentReachabilityString() {
        NetworkStatus status = getCurrentReachabilityStatus();
        switch (status) {
        case ReachableViaWWAN:
            return "Cellular";
        case ReachableViaWiFi:
            return "WiFi";
        default:
            return "No Connection";
        }
    }

    public String getCurrentReachabilityFlagsAsString() {
        return getReachabilityFlagsAsString(getReachabilityFlags());
    }

    private static String getReachabilityFlagsAsString(SCNetworkReachabilityFlags flags) {
        return String.format("%s%s %s%s%s%s%s%s%s",
                flags.contains(SCNetworkReachabilityFlags.IsWWAN) ? 'W' : '-',
                flags.contains(SCNetworkReachabilityFlags.Reachable) ? 'R' : '-',
                flags.contains(SCNetworkReachabilityFlags.ConnectionRequired) ? 'c' : '-',
                flags.contains(SCNetworkReachabilityFlags.TransientConnection) ? 't' : '-',
                flags.contains(SCNetworkReachabilityFlags.InterventionRequired) ? 'i' : '-',
                flags.contains(SCNetworkReachabilityFlags.ConnectionOnTraffic) ? 'C' : '-',
                flags.contains(SCNetworkReachabilityFlags.ConnectionOnDemand) ? 'D' : '-',
                flags.contains(SCNetworkReachabilityFlags.IsLocalAddress) ? 'l' : '-',
                flags.contains(SCNetworkReachabilityFlags.IsDirect) ? 'd' : '-'
                );
    }

    private void reachabilityChanged(SCNetworkReachabilityFlags flags) {
        if (reachabilityListener != null) {
            if (isReachableWithFlags(flags)) {
                reachabilityListener.onReachable(this);
            } else {
                reachabilityListener.onUnreachable(this);
            }
            reachabilityListener.onChange(this, flags);
        }

        // this makes sure the change notification happens on the MAIN THREAD
        DispatchQueue.getMainQueue().async(
                () -> NSNotificationCenter.getDefaultCenter().postNotification(REACHABILITY_CHANGE_NOTIFICATION, this));
    }

    @Override
    public String toString() {
        return getCurrentReachabilityFlagsAsString();
    }
}
