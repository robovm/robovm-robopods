/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.parse;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
@Availability({ @PlatformVersion(platform = Platform.iOS) })
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFPush/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFPushPtr extends Ptr<PFPush, PFPushPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFPush.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFPush() {}
    protected PFPush(Handle h, long handle) { super(h, handle); }
    protected PFPush(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pushDate")
    public native NSDate getPushDate();
    @Property(selector = "setPushDate:")
    public native void setPushDate(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public static void getSubscribedChannelsInBackground(final PFGetChannelsCallback block) {
        getSubscribedChannelsInBackground0(new VoidBlock2<NSSet<?>, NSError>() {
            @Override
            public void invoke(NSSet<?> channels, NSError error) {
                if (block != null) {
                    Set<String> channelSet = null;
                    if (channels != null) {
                        channelSet = channels.asStringSet();
                    }
                    block.done(channelSet, error);
                }
            }
        });
    }
    /*<methods>*/
    @Method(selector = "setChannel:")
    public native void setChannel(String channel);
    @Method(selector = "setChannels:")
    public native void setChannels(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> channels);
    @Method(selector = "setQuery:")
    public native void setQuery(PFQuery<PFInstallation> query);
    @Method(selector = "setMessage:")
    public native void setMessage(String message);
    @Method(selector = "setData:")
    public native void setData(NSDictionary<?, ?> data);
    @Method(selector = "expireAtDate:")
    public native void setExpirationTime(NSDate date);
    @Method(selector = "expireAfterTimeInterval:")
    public native void setExpirationTimeInterval(double timeInterval);
    @Method(selector = "clearExpiration")
    public native void clearExpiration();
    @Method(selector = "sendPushInBackground")
    public native BFTask<Void> sendInBackground();
    @Method(selector = "sendPushInBackgroundWithBlock:")
    public native void sendInBackground(@Block PFSendCallback block);
    @Method(selector = "sendPushMessageToChannelInBackground:withMessage:")
    public static native BFTask<Void> sendMessageInBackground(String channel, String message);
    @Method(selector = "sendPushMessageToChannelInBackground:withMessage:block:")
    public static native void sendMessageInBackground(String channel, String message, @Block PFSendCallback block);
    @Method(selector = "sendPushMessageToQueryInBackground:withMessage:")
    public static native BFTask<Void> sendMessageInBackground(PFQuery query, String message);
    @Method(selector = "sendPushMessageToQueryInBackground:withMessage:block:")
    public static native void sendMessageInBackground(PFQuery<PFInstallation> query, String message, @Block PFSendCallback block);
    @Method(selector = "sendPushDataToChannelInBackground:withData:")
    public static native BFTask<Void> sendDataInBackground(String channel, NSDictionary<?, ?> data);
    @Method(selector = "sendPushDataToChannelInBackground:withData:block:")
    public static native void sendDataInBackground(String channel, NSDictionary<?, ?> data, @Block PFSendCallback block);
    @Method(selector = "sendPushDataToQueryInBackground:withData:")
    public static native BFTask<Void> sendDataInBackground(PFQuery query, NSDictionary<?, ?> data);
    @Method(selector = "sendPushDataToQueryInBackground:withData:block:")
    public static native void sendDataInBackground(PFQuery<PFInstallation> query, NSDictionary<?, ?> data, @Block PFSendCallback block);
    /**
     * @since Available since iOS 3.0.
     */
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "3.0") })
    @Method(selector = "handlePush:")
    public static native void handle(UIRemoteNotification userInfo);
    @Method(selector = "storeDeviceToken:")
    public static native void storeDeviceToken(NSObject deviceToken);
    @Method(selector = "getSubscribedChannelsInBackground")
    public static native BFTask<NSSet<NSString>> getSubscribedChannelsInBackground();
    @Method(selector = "getSubscribedChannelsInBackgroundWithBlock:")
    protected static native void getSubscribedChannelsInBackground0(@Block VoidBlock2<NSSet<?>, NSError> block);
    @Method(selector = "subscribeToChannelInBackground:")
    public static native BFTask<Void> subscribeInBackground(String channel);
    @Method(selector = "subscribeToChannelInBackground:block:")
    public static native void subscribeInBackground(String channel, @Block PFSaveCallback block);
    @Method(selector = "unsubscribeFromChannelInBackground:")
    public static native BFTask<Void> unsubscribeInBackground(String channel);
    @Method(selector = "unsubscribeFromChannelInBackground:block:")
    public static native void unsubscribeInBackground(String channel, @Block PFSaveCallback block);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public boolean send() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = send(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "sendPush:")
    private native boolean send(NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static boolean sendMessage(String channel, String message) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = sendMessage(channel, message, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "sendPushMessageToChannel:withMessage:error:")
    private static native boolean sendMessage(String channel, String message, NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static boolean sendMessage(PFQuery<PFInstallation> query, String message) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = sendMessage(query, message, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "sendPushMessageToQuery:withMessage:error:")
    private static native boolean sendMessage(PFQuery<PFInstallation> query, String message, NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static boolean sendData(String channel, NSDictionary<?, ?> data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = sendData(channel, data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "sendPushDataToChannel:withData:error:")
    private static native boolean sendData(String channel, NSDictionary<?, ?> data, NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static boolean sendData(PFQuery<PFInstallation> query, NSDictionary<?, ?> data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = sendData(query, data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "sendPushDataToQuery:withData:error:")
    private static native boolean sendData(PFQuery<PFInstallation> query, NSDictionary<?, ?> data, NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static Set<String> getSubscribedChannels() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       Set<String> result = getSubscribedChannels(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "getSubscribedChannels:")
    private static native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getSubscribedChannels(NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static boolean subscribe(String channel) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = subscribe(channel, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "subscribeToChannel:error:")
    private static native boolean subscribe(String channel, NSError.NSErrorPtr error);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    public static boolean unsubscribe(String channel) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unsubscribe(channel, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "unsubscribeFromChannel:error:")
    private static native boolean unsubscribe(String channel, NSError.NSErrorPtr error);
    /*</methods>*/
}
