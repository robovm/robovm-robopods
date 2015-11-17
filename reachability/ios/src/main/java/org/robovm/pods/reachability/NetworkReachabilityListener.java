package org.robovm.pods.reachability;

import org.robovm.apple.systemconfiguration.SCNetworkReachabilityFlags;

public interface NetworkReachabilityListener {
    void onReachable(NetworkReachability reachability);

    void onUnreachable(NetworkReachability reachability);

    void onChange(NetworkReachability reachability, SCNetworkReachabilityFlags flags);
}
