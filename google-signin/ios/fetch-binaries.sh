#/bin/sh

# This script fetches the Google SignIn SDK for development purposes
# You need to agree to Google's Terms of Services before
# being allowed to use the SDK
set -e
VERSION=2_4_0
rm -f google_signin_sdk_$VERSION.zip
rm -rf signin
mkdir signin
curl -O https://developers.google.com/identity/sign-in/ios/sdk/google_signin_sdk_$VERSION.zip
tar xzf google_signin_sdk_$VERSION.zip -C signin
rm -rf libs/
mkdir libs
cp -r signin/google_signin_sdk_$VERSION/GoogleSignIn.framework libs/
rm google_signin_sdk_$VERSION.zip
rm -r signin