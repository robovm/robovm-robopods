//
//  APDNativeAdView.h
//  Appodeal
//
//  Created by Stas Kochkin on 22/06/2018.
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <UIKit/UIKit.h>


@protocol APDNativeAdView <NSObject>

- (nonnull UILabel *)titleLabel;
- (nonnull UILabel *)callToActionLabel;

@optional

- (nonnull UILabel *)descriptionLabel;
- (nonnull UIImageView *)iconView;
- (nonnull UIView *)mediaContainerView;
- (nonnull UILabel *)contentRatingLabel;
- (nonnull UIView *)adChoicesView;

- (void)setRating:(nonnull NSNumber *)rating;

+ (nonnull UINib *)nib;

@end
