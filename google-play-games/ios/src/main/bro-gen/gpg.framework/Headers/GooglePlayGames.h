//
// Google Play Games Platform Services
// Copyright 2013 Google Inc. All rights reserved.
//
#import <Foundation/Foundation.h>

#if __IPHONE_OS_VERSION_MIN_REQUIRED < __IPHONE_7_0
#pragma message "Google Play Game Services SDK requires iOS 7.0 or later."
#endif

#import "GPGEnums.h"

#import "GPGAchievement.h"
#import "GPGAchievementMetadata.h"
#import "GPGEvent.h"
#import "GPGLauncherController.h"
#import "GPGLeaderboard.h"
#import "GPGLeaderboardMetadata.h"
#import "GPGLocalPlayerRank.h"
#import "GPGLocalPlayerScore.h"
#import "GPGManager.h"
#import "GPGMultiplayerConfig.h"
#import "GPGPlayer.h"
#import "GPGPlayerLevel.h"
#import "GPGQuest.h"
#import "GPGRealTimeRoom.h"
#import "GPGRealTimeRoomData.h"
#import "GPGRealTimeRoomMaker.h"
#import "GPGScore.h"
#import "GPGScoreReport.h"
#import "GPGSnapshotMetadata.h"
#import "GPGSnapshotMetadataChange.h"
#import "GPGTurnBasedMatch.h"
#import "GPGTurnBasedParticipant.h"
#import "GPGTurnBasedParticipantResult.h"
