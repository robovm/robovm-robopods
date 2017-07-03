# Google Play Games Services iOS

## Sample Application

This [test application](https://github.com/julienvillegas/libgdx-GPGS) is a small self-contained integration of a LibGDX game with Google Play Game Services on iOS.
All it does is to start the application and log you into Google Play Game Services.
This should allow you to easily extend to include items such as Leaderboard...

To see an example of a game using Leaderboard, signin, AdMobs check out [Wordfiesta](http://wordfiesta.com/). It is available for [iOS](https://itunes.apple.com/bj/app/word-fiesta-free-version/id1050452690?mt=8) and [Android](https://play.google.com/store/apps/details?id=com.wordfiesta.free_version). 

*Note:* With Xcode 8.1 and Xcode 8.2 there is an error preventing you from running on a simulator.
You will get an error: `[GPGManager signIn:didSignInForUser:withError:]:[main] FAILED LOGGING INTO GOOGLE PLUS GAMES`
Until this is addressed by Apple you will need to run it on a device.


## Pre-requisites

It is assumed that you have:
* Setup your IDE according to generic instruction. For this sample application I am using Android Studio and have configured my system according to [these instructions](https://github.com/libgdx/libgdx/wiki/Setting-up-your-Development-Environment-%28Eclipse%2C-Intellij-IDEA%2C-NetBeans%29)
* Created a LibGDX application. I have created this sample using the standard [gdx-setup wizard](https://github.com/libgdx/libgdx/wiki/Project-Setup-Gradle)

## Installation

The following components are required:

#### Google Sign-In SDK for iOS

* Download the [Google Sign-In SDK for iOS](https://developers.google.com/identity/sign-in/ios/sdk/). The Version you must download is `Google Sign-In SDK 4.0.0` (Version 4.0.1 won't work).
* Open the downloaded zip file and copy these files to the `libs` folder under your `ios` project:
* `GoogleUtilities.framework` 
* `GoogleSymbolUtilities.framework` 
* `GoogleNetworkingUtilities.framework` 
* `GoogleAppUtilities.framework` 
* `GoogleAuthUtilities.framework` 
* `GoogleSignIn.framework` 
* Copy `GoogleSignIn.bundle` to folder `resources` under your `ios` folder.

#### Google+ SDK for iOS

* Download the [latest Google+ iOS SDK](https://developers.google.com/+/mobile/ios/getting-started)
* Open the downloaded zip file and copy these files to the `libs` folder under your `ios` project:
* `GoogleOpenSource.framework` 
* `GooglePlus.framework` 
* Extract `GooglePlus.bundle` file and copy to folder `resources` under your 'ios' folder.

#### Google Play Games Services SDK  

1. Download the `Play Games C++ SDK Version 2.1 SDK` from https://developers.google.com/games/services/downloads/sdks
2. Copy file `gpg.framework` in your iOS project's `libs/` folder
3. Copy file `gpg.bundle` in your iOS project's `resources/` folder


## Configuration

Once you have installed the components, make the following configuration changes:

### robovm.xml


Apply the following changes to your `robovm.xml` file:

```
<config>
    ...
    <resources>
        ...
        <resource>
            <directory>resources</directory>
        </resource>
    </resources>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
		...
    	<framework>GoogleSignIn</framework>
    	<framework>GoogleAuthUtilities</framework>
        <framework>gpg</framework>
    </frameworks>
</config>
```

### Gradle

Make the following changes to your `build.gradle` file.
Note that I had to use the 2.2.1-SNAPSHOT for robopods. The 2.2.0 version did not work for me.

```
allprojects {
    apply plugin: "eclipse"
    apply plugin: "idea"

    version = '1.0'
    ext {
        appName = "sample_ios_google_signin"
        gdxVersion = '1.9.4'
        roboVMVersion = '2.2.0'
        robopodsVersion = '2.2.1-SNAPSHOT'				
        box2DLightsVersion = '1.4'
        ashleyVersion = '1.7.0'
        aiVersion = '1.8.0'
    }

    repositories {
        mavenLocal()
        mavenCentral()
        maven { url "https://oss.sonatype.org/content/repositories/snapshots/" }
        maven { url "https://oss.sonatype.org/content/repositories/releases/" }
    }
}
...
project(":ios") {
    apply plugin: "java"
    apply plugin: "robovm"


    dependencies {
        compile project(":core")
        compile "com.mobidevelop.robovm:robovm-rt:$roboVMVersion"							
        compile "com.mobidevelop.robovm:robovm-cocoatouch:$roboVMVersion"					
        compile "com.mobidevelop.robovm:robopods-google-signin-ios:$robopodsVersion"		
        compile "com.mobidevelop.robovm:robopods-google-apis-ios:$robopodsVersion"			
        compile "com.mobidevelop.robovm:robopods-google-play-games-ios:$robopodsVersion"	

        compile "com.badlogicgames.gdx:gdx-backend-robovm:$gdxVersion"
        compile "com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-ios"
        compile "com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-ios"

    }
}
```

### Link your game in Google play developer console.

Create an entry for your game in the Google Play Developer Console. This enables Google Play games services for your application, and creates an OAuth 2.0 client ID, if you don't already have one.

* Add an entry for your iOS game by following the steps described in [Setting Up Google Play Games Services](https://developers.google.com/games/services/console/enabling).
* Take note of your game's OAuth 2.0 [client ID](https://developers.google.com/games/services/console/enabling#client_id); you will need this later.
* (Optional) Add achievements and leaderboards to your game by following the steps described in [Configuring Achievements and Leaderboards](https://developers.google.com/games/services/console/configuring#configuring_achievements_and_leaderboards).
* Add accounts for other members of your team to test your game by following the steps described in Publishing Your Game Changes.


### info.plist.xml

Add the following section to your `info.plist.xml` file under your `ios` Project

Important use the ID you get from the previous step IN REVERSE

e.g.:
if your ID on Google play is 123456789987-mbig7g1ngcmb4rt1giq8sjcqpq86nl26.apps.googleusercontent.com
use: com.googleusercontent.apps.123456789987-mbig7g1ngcmb4rt1giq8sjcqpq86nl26


```
	<key>CFBundleURLTypes</key>
    <array>
         <dict>
         <key>CFBundleTypeRole</key>
            <string>Editor</string>
            <key>CFBundleURLName</key>
            <string>com.googleusercontent.apps.1234567890-qweasdzxcqweasdzxc321456</string>
            <key>CFBundleURLSchemes</key>
            <array>
               <string>com.googleusercontent.apps.911237470974-qweasdzxcqweasdzxc321456</string>
             </array>
         </dict>
         <dict>
                <key>CFBundleTypeRole</key>
                <string>Editor</string>
                <key>${bundle.id}</key>
                <string>${bundle.id}</string>
                <key>CFBundleURLSchemes</key>
                <array>
                    <string>${bundle.id}</string>
                </array>
            </dict>
    </array>
```
## Coding

### Action Resolver

LibGDX is Crossplatform but to interact with native libraries you need to write system specific methods.
i.e: You don't call the Google Games Services the same way on Android than on iOS.

To do that, first we create an interface that list the platform specific method.
This class is in our core project
In our case we will only implement the `SignIn` method, although that can easily be extended.

#### interface 

Create `ActionResolver.java` in your `core` project

```
package com.mygdx.game;


public interface ActionResolver {

    public void signIn();
}
```

##### ActionResolver Desktop

No Google Games Services implementation for Dektop. Calling SignIn when running on Desktop won't do anythning.

Create `ActionResolverDesktop.java` in your `desktop` project

```
package com.mygdx.game.desktop;

import com.mygdx.game.ActionResolver;

public class ActionResolverDesktop implements ActionResolver {


    @Override
    public void signIn() {
		// nothing happens.
    }
}
```

Your desktop Launcher is modified as follow to call the dummy desktop Action Resolver

```
package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {


	public static void main (String[] arg) {
		ActionResolverDesktop actionResolverDesktop = new ActionResolverDesktop();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MyGdxGame(actionResolverDesktop), config);
	}
	
}
```

##### ActionResolver Android

No Google Games Services implementation for Android on this tutorial at this point. Calling SignIn when running on Android won't do anythning.

Create `ActionResolverAndroid.java` in your `android` project

```
package com.mygdx.game;

public class ActionResolverAndroid implements ActionResolver{

    @Override
    public void signIn() {

    }
}
```

Your Android Launcher is modified as follow to call the dummy Android Action Resolver

```
package com.mygdx.game;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {

	private ActionResolverAndroid actionResolverAndroid;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		actionResolverAndroid = new ActionResolverAndroid();
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new MyGdxGame(actionResolverAndroid), config);
	}

}

```


##### ActionResolverHTML

No Google Games Services implementation for HTML on this tutorial. Calling SignIn when running on Android won't do anythning.

Create `ActionResolverHTML.java` in your `HTML` project

```
package com.mygdx.game.client;

import com.mygdx.game.ActionResolver;

public class ActionResolverHTML implements ActionResolver {
    @Override
    public void signIn() {

    }
}
```

Your HTML Launcher is modified as follow to call the dummy HTML Action Resolver

```
package com.mygdx.game.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(480, 320);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                ActionResolverHTML actionResolverHTML = new ActionResolverHTML();
                return new MyGdxGame(actionResolverHTML);
        }
}
```

##### ActionResolverIOS 

This is one the iOS Action Resolver is implemented. The one which is of interest for this sample.
Set CLIENT_ID in the code below to  your Google Games Services ID as seen previously.

Create `ActionResolverIOS.java` in your `ios` project

```
package com.mygdx.game;

import com.badlogic.gdx.Gdx;

import org.robovm.apple.foundation.Foundation;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.pods.google.games.GPGManager;
import org.robovm.pods.google.signin.GIDSignIn;
import org.robovm.pods.google.signin.GIDSignInUIDelegateAdapter;


public class ActionResolverIOS implements ActionResolver {

    final public static String CLIENT_ID = "123456789987-mbig7g1ngcmb4rt1giq8sjcqpq86nl26.apps.googleusercontent.com";

    public ActionResolverIOS(IOSLauncher app){

        GPGManager.getSharedInstance().setStatusDelegate(app);

        GIDSignIn.getSharedInstance().setUiDelegate(new GIDSignInUIDelegateAdapter() {
            private UIViewController libgdxViewController;

            @Override
            public void willDispatch(GIDSignIn signIn, NSError error) {
                Foundation.log("willDispatch()");
            }

            @Override
            public void presentViewController(GIDSignIn signIn, UIViewController viewController) {
                Foundation.log("presentViewController()");
                libgdxViewController =  UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
                libgdxViewController.presentViewController(viewController, true, null);
                UIApplication.getSharedApplication().getKeyWindow().setRootViewController(viewController);

            }

            @Override
            public void dismissViewController(GIDSignIn signIn, UIViewController viewController) {
                Foundation.log("dismissViewController()");
                viewController.dismissViewController(true, null);
            }
        });

    }

    @Override
    public void signIn() {

        Gdx.app.log("ActionResolverIOS:signIn", "Starting SignIn");
        GPGManager.getSharedInstance().signIn(CLIENT_ID, true);
        Gdx.app.log("ActionResolverIOS:signIn", "Ending SignIn");
    }
    
}
```

Modify your IOS Launcher file as follow to use your Action Resolver.

```
package com.mygdx.game;

import com.badlogic.gdx.Gdx;

import org.robovm.apple.foundation.Foundation;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.pods.google.games.GPGManager;
import org.robovm.pods.google.signin.GIDSignIn;
import org.robovm.pods.google.signin.GIDSignInUIDelegateAdapter;


public class ActionResolverIOS implements ActionResolver {

    final public static String CLIENT_ID = "123456789987-mbig7g1ngcmb4rt1giq8sjcqpq86nl26.apps.googleusercontent.com";

    public ActionResolverIOS(IOSLauncher app){

        GPGManager.getSharedInstance().setStatusDelegate(app);

        GIDSignIn.getSharedInstance().setUiDelegate(new GIDSignInUIDelegateAdapter() {
            private UIViewController libgdxViewController;

            @Override
            public void willDispatch(GIDSignIn signIn, NSError error) {
                Foundation.log("willDispatch()");
            }

            @Override
            public void presentViewController(GIDSignIn signIn, UIViewController viewController) {
                Foundation.log("presentViewController()");
                libgdxViewController =  UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
                libgdxViewController.presentViewController(viewController, true, null);
                UIApplication.getSharedApplication().getKeyWindow().setRootViewController(viewController);

            }

            @Override
            public void dismissViewController(GIDSignIn signIn, UIViewController viewController) {
                Foundation.log("dismissViewController()");
                viewController.dismissViewController(true, null);
            }
        });

    }

    @Override
    public void signIn() {

        Gdx.app.log("ActionResolverIOS:signIn", "Starting SignIn");
        GPGManager.getSharedInstance().signIn(CLIENT_ID, true);
        Gdx.app.log("ActionResolverIOS:signIn", "Ending SignIn");
    }
    
}
```

#### main file

This standard libGDX output is modified so that on the first render iteration, it calls the singin method.
Using the Action Resolver it will call the platform specific implementation.

```
package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private boolean initiatedSignIn;

	private Stage stage;

	private ActionResolver localActionActionResolver;

	public MyGdxGame(ActionResolver anActionResolver){

		this.localActionActionResolver = anActionResolver;
		initiatedSignIn = false;
	}
	
	@Override
	public void create () {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);

		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {

		if(!initiatedSignIn){
			initiatedSignIn = true;
			localActionActionResolver.signIn();
		}

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
```




