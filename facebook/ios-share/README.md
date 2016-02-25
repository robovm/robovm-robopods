# Facebook iOS ShareKit framework

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios-share:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios-share</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### Modeling Content

Before you can share anything, you have to model the content you want to share.

#### Links

To share links create an instance of `FBSDKShareLinkContent` and specify the url:

```Java
FBSDKShareLinkContent content = new FBSDKShareLinkContent();
content.setContentURL(new NSURL("https://robovm.com"));
content.setContentTitle("RoboVM");
content.setContentDescription("Cross platform mobile app development in Java");
```

#### Photos

To share photos create an instance of `FBSDKSharePhoto` with an `UIImage` and pass it to a `FBSDKSharePhotoContent` instance:

```Java
FBSDKSharePhoto photo = new FBSDKSharePhoto();
photo.setImage(UIImage.getImage("robovm-icon.png"));
photo.setUserGenerated(false);

FBSDKSharePhotoContent content = new FBSDKSharePhotoContent();
content.setPhotos(new NSArray<>(photo));
...
```

#### Videos

To share videos create an instance of `FBSDKShareVideo` with an `NSURL` video url and pass it to a `FBSDKSharePhotoCFBSDKShareVideoContentontent` instance:

```Java
FBSDKShareVideo video = new FBSDKShareVideo();
video.setVideoURL(new NSURL("https://www.youtube.com/watch?v=wwr3sMo-84s"));

FBSDKShareVideoContent content = new FBSDKShareVideoContent();
content.setVideo(video);
```

### Sharing Methods

After creating the share content, it's time to share them.

#### Share Button

The `FBSDKShareButton` will open the Facebook Share Dialog to share the specified content:

```Java
FBSDKShareButton button = new FBSDKShareButton();
button.setShareContent(content);
```

Alternatively you can use the `FBSDKSendButton` which will share the content with the Messenger app.

```Java
FBSDKSendButton button = new FBSDKSendButton();
button.setShareContent(content);
```

Add the button as a subview to your view hierarchy:

```Java
view.addSubview(button);
```

#### Share Dialog

If you want to directly show the share dialog use the following code:

```Java
FBSDKShareDialog.show(viewController, content, null);
```

You have to pass a `UIViewController` when showing the dialog. Ideally you should display 
the dialog in a view controller subclass action and specify `this`.  
If you're developing a __libGDX__ game you can just get the root view controller of the application:

```Java
UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
```

Alternatively you can use the `FBSDKMessageDialog` to share with the Messenger app.

```Java
FBSDKMessageDialog.show(content, null);
```

In the last parameter of both `show` methods you can specify a delegate to get notified on share success, cancel and error.


#### Share API

You can also use your own UI for sharing. When you are about to share the content use the `FBSDKShareAPI`:

```Java
FBSDKShareAPI.share(content, delegate);
```

#### Try it out!

Add code to share with Facebook and run your app. You should see the share dialog. If you implemented the share delegate
you should also get notified whether the share was successful.

__Note:__ You do not need to implement Facebook login to make sharing work!

##### Having trouble?

- Make sure you have setup the Facebook SDK as described here: [Link](../ios-core)
- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/sharing/ios)