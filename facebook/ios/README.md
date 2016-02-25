# Facebook iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

This RoboPod includes all Facebook frameworks except for AudienceNetwork.

__CoreKit:__ [Link](../ios-core)
__LoginKit:__ [Link](../ios-login)
__MessengerShareKit:__ [Link](../ios-messenger)
__ShareKit:__ [Link](../ios-share)
__AudienceNetwork:__ [Link](../ios-audience)

## Official documentation

[Link](https://developers.facebook.com/docs/ios)