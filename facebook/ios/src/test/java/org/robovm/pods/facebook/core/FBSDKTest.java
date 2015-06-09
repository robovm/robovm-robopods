package org.robovm.pods.facebook.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSMutableArray;
import org.robovm.apple.foundation.NSNull;
import org.robovm.apple.foundation.NSSet;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.block.VoidBlock2;

public class FBSDKTest {
    public static final String APP_ID = "XXX";
    public static final String APP_SECRET = "XXX";

    protected FBSDKAccessToken accessToken;
    
    @Before
    public void setup() {
        NSArray<NSSet<NSString>> arraysOfPermissions = new NSMutableArray<NSSet<NSString>>();
        arraysOfPermissions.add(new NSSet<NSString>(new NSString("email"), new NSString("user_friends")));

        FBSDKTestUsersManager.getSharedInstance(APP_ID, APP_SECRET).
                requestTestAccountTokens(arraysOfPermissions, true,
                        new VoidBlock2<NSArray<FBSDKAccessToken>, NSError>() {
                            @Override
                            public void invoke(NSArray<FBSDKAccessToken> tokens, NSError error) {
                                if (error != null) {
                                    fail(error.getLocalizedDescription());
                                } else if (tokens.size() == 0 || tokens.first().equals(NSNull.getNull())) {
                                    fail("got empty token");
                                } else {
                                    accessToken = tokens.first();
                                    FBSDKProfile.enableUpdatesOnAccessTokenChange(true);
                                    FBSDKAccessToken.setCurrentAccessToken(accessToken);
                                }
                            }
                        });
    }
}
