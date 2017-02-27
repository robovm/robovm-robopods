# RoboPods for Facebook

Build, grow, and monetize your app with Facebook. The Facebook SDK allows you to natively integrate Facebook into your app.

## Available RoboPods

| Platform                          | Version  | Description                                         |
|-----------------------------------|----------|-----------------------------------------------------|
| [ios](ios/)                       | 4.15.1   | Facebook iOS (all frameworks but AudienceNetwork)   |
| [ios-audience](ios-audience/)     | 4.15.1   | Facebook iOS AudienceNetwork Framework              |
| [ios-core](ios-core/)             | 4.15.1   | Facebook iOS CoreKit Framework                      |
| [ios-login](ios-login/)           | 4.15.1   | Facebook iOS LoginKit Framework                     |
| [ios-messenger](ios-messenger/)   | 4.15.1   | Facebook iOS MessengerShareKit Framework            |
| [ios-notifications](ios-notifications/) | 4.15.1   | Facebook iOS Notifications Framework            |
| [ios-share](ios-share/)           | 4.15.1   | Facebook iOS ShareKit Framework                     |

## Official website

https://developers.facebook.com/

## Integration

You can include any or all of the above components of the Facebook SDK. To integrate the entire SDK into your project requires a few steps.

First, add the dependencies to either the root or the module `build.gradle` file.

```gradle
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-facebook-ios:$robopodsVersion"
   compile "com.mobidevelop.robovm:robopods-facebook-ios-audience:$robopodsVersion"
}
```

Next we need to add the SDK to the project. Download the Facebook SDK for iOS from [here](https://developers.facebook.com/docs/ios/downloads). Make sure you download the correct version, referenced above.

Extract the .zip and copy all the `.framework` folders into you project in `ios/libs`. Create the `libs` folder if it doesn't exist.

Now we need to update the `robovm.xml` file to tell it to include the Facebook SDK in the project. We need to include the libs folder in the `frameworkPaths` and include the framewrk within the `frameworks` as shown below.

```
<config>
  ... other sections ...
  <frameworkPaths>
    <path>libs</path>
  </frameworkPaths>
  <frameworks>
     ... other frameworks ...
    <framework>FBSDKCoreKit</framework>
  </frameworks>
</config>

```

You're ready to go.
