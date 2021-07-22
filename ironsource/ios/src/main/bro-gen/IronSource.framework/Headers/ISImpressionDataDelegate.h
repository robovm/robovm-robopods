//
//  ISImpressionDataDelegate.h
//  IronSource
//
//  Created by Guy Lis on 09/09/2020.
//  Copyright © 2020 IronSource. All rights reserved.
//


#ifndef ISImpressionDataDelegate_h
#define ISImpressionDataDelegate_h

#import "ISImpressionData.h"

@protocol ISImpressionDataDelegate <NSObject>

@required

- (void)impressionDataDidSucceed:(ISImpressionData *)impressionData;

@end

#endif /* ISImpressionDataDelegate_h */
