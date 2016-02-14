# Reachability iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/reachability/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-reachability-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-reachability-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### Monitor network reachability

NetworkReachability makes it easy to know if the Internet or specific hosts are reachable and 
whether the device is connected via WWAN or WIFI.

#### Obtain NetworkReachability

First you have to get an instance of `NetworkReachability`. You do this with one of the static helper methods:

```Java
NetworkReachability.forHostname("www.google.com");

NetworkReachability.forAddress(new InetSocketAddress("74.125.224.115", 80))

NetworkReachability.forInternetConnection();

NetworkReachability.forLocalWiFi();
```

Use `NetworkReachability.forInternetConnection();` if you just want to know if the device can connect to the Internet.

#### Check reachability

To check if the address is reachable, just use `isReachable()`:

```Java
NetworkReachability reachability = NetworkReachability.forInternetConnection();
boolean isReachable = reachability.isReachable();
```

To get notified about changes to the reachability, you can register a listener:

```Java
NetworkReachability reachability = NetworkReachability.forInternetConnection();
reachability.setListener(new NetworkReachabilityListener() {
    @Override
    public void onReachable(NetworkReachability networkReachability) {
        Log.log("Network reachable!");
    }

    @Override
    public void onUnreachable(NetworkReachability networkReachability) {
        Log.log("Network unreachable!");
    }

    @Override
    public void onChange(NetworkReachability networkReachability, SCNetworkReachabilityFlags flags) {
        Log.log("Network reachability changed: " + flags);
    }
});
reachability.startNotifier();
```

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/reachability/ios)