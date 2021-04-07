//
//  ISConsentViewDelegate.h
//  IronSource
//
//  Created by Hadar Pur on 08/10/2020.
//  Copyright © 2020 IronSource. All rights reserved.
//

#ifndef ISConsentViewDelegate_h
#define ISConsentViewDelegate_h

@protocol ISConsentViewDelegate <NSObject>

@required

- (void)consentViewDidLoadSuccess:(NSString *)consentViewType;

- (void)consentViewDidFailToLoadWithError:(NSError *)error consentViewType:(NSString *)consentViewType;

- (void)consentViewDidShowSuccess:(NSString *)consentViewType;

- (void)consentViewDidFailToShowWithError:(NSError *)error consentViewType:(NSString *)consentViewType;

- (void)consentViewDidAccept:(NSString *)consentViewType;

- (void)consentViewDidDismiss:(NSString *)consentViewType;

@end

#endif /* ISConsentViewDelegate_h */
