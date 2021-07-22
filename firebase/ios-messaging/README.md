# Firebase iOS Messaging framework

Firebase Cloud Messaging for iOS is a service that allows you to send data from your server to your users' iOS device, and also to receive messages from devices on the same connection. The service handles all aspects of queueing of messages and delivery to the target iOS application running on the target device, and it is completely free.

## Install Instructions

1. Firebase is a large library (+500MB) divided in sub modules, each of them including several frameworks.
Download ZIP with frameworks from here: [Link](https://firebase.google.com/docs/ios/setup#frameworks)
2. Go into 'Messaging' subdirectory and copy all of the frameworks into the libs folder inside your RoboVM project.
4. Add the following to your `robovm.xml`
```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>FirebaseMessaging</framework>
        <framework>Protobuf</framework>
    </frameworks>
</config>
```
5. Do the same for 'Analytics' module. Follow Analytics Install Instructions [Link](https://github.com/MobiVM/robovm-robopods/tree/master/firebase/ios-analytics)



### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-firebase-ios-messaging:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-firebase-ios-messaging</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

#### Configure project

Download 'GoogleService-Info.plist' from Firebase Console and put it into data/ folder of your RoboVM project.

#### Disable method swizzling

It seems to be that method swizzling doesn't work with RoboVM (at least for Firebase), so you have to disable
it in the Info.plist.xml via adding this:
```
<plist>
<dict>
...
    <key>FirebaseAppDelegateProxyEnabled</key>
    <false/>
...
</dict>
</plist>
```

Disabling it requires to write additional code like wiring APN token and APN notifications to FCM.
So, you have to consider this while reading the official documentation.

##### Next steps

- Read the official Firebase documentation: [Link](https://firebase.google.com/docs/cloud-messaging/ios/client)

