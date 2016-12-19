# Google Play Games Services iOS

## Sample Application

This [test application](https://github.com/julienvillegas/libgdx-GPGS) is a small self-contained integration of a LibGDX game with Google Play Game Services on iOS.
All it does is to start the application and log you into Google Play Game Services.
This should allow you to easily extend to include items such as Leaderboard...
To see an example of a game using Leaderboard, signin, AdMobs check out [Wordfiesta](wordfiesta.com). It is available for [iOS](https://itunes.apple.com/bj/app/word-fiesta-free-version/id1050452690?mt=8) and [Android](https://play.google.com/store/apps/details?id=com.wordfiesta.free_version). 

*Note:* With Xcode 8.1 and Xcode 8.2 there is an error preventing you from running on a simulator.
You will get an error: `[GPGManager signIn:didSignInForUser:withError:]:[main] FAILED LOGGING INTO GOOGLE PLUS GAMES`
Until this is addressed by Apple you will need to run it on a device.


## Pre-requisite

It is assumed that you have:
* Setup your IDE according to generic instruction. For this sample application I am using Android Studio and have configured my system according to [these instructions](https://github.com/libgdx/libgdx/wiki/Setting-up-your-Development-Environment-%28Eclipse%2C-Intellij-IDEA%2C-NetBeans%29)
* Created a LibGDX application. I have created this sample using the standard [gdx-setup wizard](https://github.com/libgdx/libgdx/wiki/Project-Setup-Gradle)

## Instructions

The following additional components are required:

#### Google Sign-In SDK for iOS

* Download the [Google Sign-In SDK for iOS](https://developers.google.com/identity/sign-in/ios/sdk/). The Version you must download is `Google Sign-In SDK 4.0.0` (Version 4.0.1 won't work).
* Open the downloaded zip file.
* Extract `GoogleSignIn.framework` file and copy it to folder `libs` under your 'ios' folder (create the folder if it does not already exists).
* Extract `GoogleSignIn.bundle` file and copy to folder `resources` under your 'ios' folder (create the folder if it does not already exists).

#### Google+ SDK for iOS

* Download the [latest Google+ iOS SDK](https://developers.google.com/+/mobile/ios/getting-started)
* Open the downloaded zip file.
* Extract `GoogleOpenSource.framework` file and copy it to folder `libs` under your 'ios' folder (create the folder if it does not already exists).
* Extract `GooglePlus.framework` file and copy it to folder `libs` under your 'ios' folder (create the folder if it does not already exists).
* Extract `GooglePlus.bundle` file and copy to folder `resources` under your 'ios' folder (create the folder if it does not already exists).

#### Google Play Games Services SDK  

1. Download the `Play Games C++ SDK Version 2.1 SDK` from https://developers.google.com/games/services/downloads/sdks
2. Put the `gpg.framework` folder in your iOS project's `libs/` folder
3. Put the `gpg.bundle` in your iOS project's `resources/` folder

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
        robopodsVersion = '2.2.1-SNAPSHOT'				// Add
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
        compile "com.mobidevelop.robovm:robovm-rt:$roboVMVersion"							// Update
        compile "com.mobidevelop.robovm:robovm-cocoatouch:$roboVMVersion"					// Update
        compile "com.mobidevelop.robovm:robopods-google-signin-ios:$robopodsVersion"		// Update
        compile "com.mobidevelop.robovm:robopods-google-apis-ios:$robopodsVersion"			// Update
        compile "com.mobidevelop.robovm:robopods-google-play-games-ios:$robopodsVersion"	// Update

        compile "com.badlogicgames.gdx:gdx-backend-robovm:$gdxVersion"
        compile "com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-ios"
        compile "com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-ios"

    }
}
```



