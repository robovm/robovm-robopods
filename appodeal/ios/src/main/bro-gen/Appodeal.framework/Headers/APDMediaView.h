//
//  APDMediaView.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <UIKit/UIKit.h>

@class APDNativeAd;

/*!
 *  Media view types
 */
typedef NS_ENUM(NSInteger, APDMediaViewType) {
    /*!
     *  Placeholder is main image image. When video loaded on media view
     *  play button appear. Wnen play button will tapped, video start play on with media view size
     *  if media view tapped
     */
    APDMediaViewTypeMainImage = 0,
    /*!
     *  Placeholder is icon image. When video loaded autostart is ignoring on media view
     *  play button appear. Wnen play button will tapped, video start play on full screen.
     *  Tap on video in fullscreen mode return video to media view size
     */
    APDMediaViewTypeIcon
};

@class APDMediaView;

/*!
 *  Declaration of media view delegate
 */
@protocol APDMediaViewDelegate <NSObject>

@optional

/*!
 *  Method called when media view start playing
 *
 *  @param mediaView Current media view
 */
- (void)mediaViewStartPlaying:(APDMediaView *)mediaView;

/*!
 *  Method called when media view finish playing
 *
 *  @param mediaView  Current media view
 *  @param wasSkipped If user skipp video from media view return YES else return NO
 */
- (void)mediaViewFinishPlaying:(APDMediaView *)mediaView videoWasSkipped:(BOOL)wasSkipped;

/*!
 *  @brief Method called when media view present fullscreen
 *  If type APDMediaViewTypeIcon -mediaViewStartPlaying: call firstly!
 *  When this method called media view has fullscreen size
 *
 *  @param mediaView     Current media view
 *  @param presentedView At this view you can place custom controls element, for example mute button
 */
- (void)mediaView:(APDMediaView *)mediaView didPresentFullScreenView:(UIView *)presentedView;

/*!
 *  Method called when media view dismiss fullscreen
 *  When this method called media view has original size;
 *
 *  @param mediaView Current media view
 */
- (void)mediaViewDidDismissFullScreen:(APDMediaView *)mediaView;

@end

/*!
 *  Instance of this class provides video player for instances of APDNativeAd.
 *  Placeholder image depend of media view type and can be mainImage or iconImage from native ad.
 *  If native ad doesn't contain video only placeholder be displayed.
 *  If video played and visability of media view change and be less than 80% video will stop.
 *  Autoplay parameter tuned on Appodeal Dashboard.
 *  Example:
 * @code
 - (void)addMediaViewToView:(UIView *)view fromViewController:(UIViewController<APDMediaViewDelegate> *)controller nativeAd:(APDNativeAd:)nativeAd {
    _mediaView = [[APDMediaView alloc] initWithFrame:CGRectMake(0, 0, 300, 120)];
    _mediaView.type = APDMediaViewTypeMainImage;
    [_mediaView setNativeAd:self.nativeAd rootViewController:controller];
    _mediaView.delegate = controller;
    _mediaView.muted = YES;
    [view addSubview:_mediaView];
 }
 *
 */
@interface APDMediaView : UIView


/*!
 *  Set delegate to media view
 */
@property (nonatomic, weak) id<APDMediaViewDelegate> delegate;

/*!
 *  Current media view type. Default set to APDMediaViewTypeMainImage.
 *  @warning Set type before calling - setNativeAd:rootViewController:
 */
@property (nonatomic, assign) APDMediaViewType type;

/*!
 *  If set to YES, after 5 seconds after video start playing skipp button appear.
 * Tap on skipp button will close video
 * -mediaViewFinishPlaying:videoWasSkipped: return wasSkipped = YES.
 * By default set to YES.
 */
@property (nonatomic, assign) BOOL skippable;


/*!
 *  Video sound contorol
 *  Call this for example in - mediaViewStartPlaying:
 *  Default set to NO
 */
@property (nonatomic, assign) BOOL muted;

/*!
 *  Video sound contorol
 *  Call this for example in - mediaViewStartPlaying:
 *  Default set to YES
 */
@property (nonatomic, assign) BOOL useDefaultMuteButton;

/*!
 *  Set native ad to media view. If native ad contains video it start cache video and present this when become visible and video be ready
 *
 *  @param nativeAd  Nonnul native ad
 *  @param clearView Nonnul controller
 */
- (void)setNativeAd:(APDNativeAd *)nativeAd rootViewController:(UIViewController *)controller;

/*!
 *  If you use media view in custom table/collection view without helper and want to reuse 
 *  media view any times call with method before reuse
 */
- (void)clearView;

@end
