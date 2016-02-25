# Facebook iOS MessengerShareKit framework

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios-messenger:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios-messenger</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### Share Content

Use the `FBSDKMessengerSharer` to send images, animated gifs, videos and audio clips to Messenger.

#### Sharing an image

```Java
UIImage image  = UIImage.getImage("selfie_pic");
FBSDKMessengerSharer.shareImage(image, null);
```

```Java
String filepath = NSBundle.getMainBundle().findResourcePath("corgi", "webp");
NSData webpData = NSData.read(new File(filepath));
FBSDKMessengerSharer.shareAnimatedWebP(webpData, null);
```

#### Sharing an animated gif

```Java
String filepath = NSBundle.getMainBundle().findResourcePath("selfie_gif", "gif");
NSData gifData = NSData.read(new File(filepath));
FBSDKMessengerSharer.shareAnimatedGIF(gifData, null);
```

#### Sharing a video

```Java
String filepath = NSBundle.getMainBundle().findResourcePath("selfie_vid", "mp4");
NSData videoData = NSData.read(new File(filepath));
FBSDKMessengerSharer.shareVideo(videoData, null);
```

#### Sharing an audio clip

```Java
String filepath = NSBundle.getMainBundle().findResourcePath("selfie", "mp3");
NSData mp3Data = NSData.read(new File(filepath));
FBSDKMessengerSharer.shareAudio(mp3Data, null);
```


#### Try it out!

Add a resource to your app and share it with one of the above code snippets. If you have setup a test account on Facebook 
you should be able to see the shared resources in the Messenger app.

##### Having trouble?

- Make sure you have setup the Facebook SDK as described here: [Link](../ios-core)
- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/messenger/ios)