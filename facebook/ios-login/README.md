# Facebook iOS LoginKit framework

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios-login:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios-login</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### Login Button

Use the predefined Facebook login button to allow users to authenticate in your app.

#### Add button

To add a Facebook-branded login button to your app add the following code snippet to a view controller:

```Java
@Override
public void viewDidLoad() {
    super.viewDidLoad();

    FBSDKLoginButton loginButton = new FBSDKLoginButton();
    // Optional: Place the button in the center of your view.
    loginButton.setCenter(getView().getCenter());
    getView().addSubview(loginButton);
}
```


#### Listen for events

You can optionally listen for events like login and logout. Just set the delegate on the button:

```Java
loginButton.setDelegate(new FBSDKLoginButtonDelegateAdapter() {
    @Override
    public void didComplete(FBSDKLoginButton loginButton, FBSDKLoginManagerLoginResult result, NSError error) {
        if (error != null) {
            log("Failed to login: " + error);
        } else if (result.isCancelled()) {
            log("User cancelled login!");
        } else {
            if (!result.getGrantedPermissions().containsAll(readPermissions)) {
                log("Failed to login! Permissions declined: " + result.getDeclinedPermissions());
            } else {
                log("Successfully logged in!");
            }
        }
    }

    @Override
    public void didLogOut(FBSDKLoginButton loginButton) {
        // User did logout.
    }

    @Override
    public boolean willLogin(FBSDKLoginButton loginButton) {
        // User will logout. Return false if the login should be aborted.
        return true;
    }
});
```

#### Ask for permissions

Your app may requires special permissions. You can specify them directly on the button instance: 

```Java
loginButton.setReadPermissions(Arrays.asList("public_profile", "email", "user_friends"));
```


#### Try it out!

Add the login button and run your app. When you tap it you should see the login dialog. After logging in, the button
should change to _Logout_. Tap it again and you should be able to logout.

##### Having trouble?

- Make sure you have setup the Facebook SDK as described here: [Link](../ios-core)
- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Manage the authenticated user, read their profile information and check the login status: [Link](../user-management)
- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/facebook-login/ios)

### Custom Login

The `FBSDKLoginManager` handles everything you need for custom _login_ and _logout_. If you want to use a custom button to login or you are using libGDX, read on.

#### Login and Logout

Create a new instance of `FBSDKLoginManager` and store it as a member variable:

```Java
loginManager = new FBSDKLoginManager();
```

To login use either `logInWithReadPermissions` or `logInWithPublishPermissions`:

```Java
loginManager.logInWithReadPermissions(readPermissions,
    (result, error) -> {
        if (error != null) {
            log("Failed to login: " + error);
        } else if (result.isCancelled()) {
            log("User cancelled login!");
        } else {
            if (!result.getGrantedPermissions().containsAll(readPermissions)) {
                log("Failed to login! Permissions declined: " + result.getDeclinedPermissions());
            } else {
                log("Successfully logged in!");
            }
        }
    });
```

Logging out is very easy:

```Java
loginManager.logOut();
```

If you need to request additional permissions just call `logInWithReadPermissions` or `logInWithPublishPermissions` with the additional permissions again.

#### Try it out!

Add the login code to your app and trigger it. If you added log statements to the login callback you should see them.

##### Having trouble?

- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Manage the authenticated user, read their profile information and check the login status: [Link](../user-management)
- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/facebook-login/ios)

### User management

Get profile info and current access token.

#### Access Token

You can get the current access token with the following code snippet:

```Java
FBSDKAccessToken accessToken = FBSDKAccessToken.getCurrentAccessToken();
```

The returned access token will be `null` if no user is logged in.
This makes it very easy to check if the user is logged in:

```Java
public boolean isLoggedIn() {
   return FBSDKAccessToken.getCurrentAccessToken() != null;
}
```

The `FBSDKAccessToken` gives you lots of useful information, like `permissions`, `declined permissions`, `userID`, `tokenString`...

```Java
String userID = accessToken.getUserID();
Set<String> permissions = accessToken.getPermissions();
String tokenString = accessToken.getTokenString();
```

#### User Profile

If you need more information from the current user, you can use the `FBSDKProfile`:

```Java
FBSDKProfile profile = FBSDKProfile.getCurrentProfile();
```

It may be `null` if no authenticated user is available.

Use the `FBSDKProfile` to get information, like `name`, `linkURL`, `imageURL`...

```Java
String firstName = profile.getFirstName();
String lastName = profile.getLastName();
String name = profile.getName();
NSURL link = profile.getLinkURL();
```

##### Having trouble?

- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/facebook-login/ios)
