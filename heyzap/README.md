# RoboPods for Heyzap

Mobile Advertising done right.


## Available RoboPods

| Platform            | Version |
|---------------------|---------|
| [iOS](ios/)         | 9.3.5   |
|                     |         |

## Official website

https://www.heyzap.com/

## Usage
To use this RoboPod, you will need to manually add the HeyZap native framework to your
project.

1. Download the HeyZap native SDK for iOS from https://developers.heyzap.com
2. In your RoboVM iOS project, create a folder called `lib/` and put the `HeyzapAds.framework` into it
3. Open your `robovm.xml` file and add the following:

```
<config>
	...
	<frameworkPaths>
		<path>libs</path>
	</frameworkPaths>
	<frameworks>
		<framework>HeyzapAds</framework>
	</frameworks>
</config>
```