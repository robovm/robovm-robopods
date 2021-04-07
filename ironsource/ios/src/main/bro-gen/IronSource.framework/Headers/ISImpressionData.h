//
//  ImpressionData.h
//  IronSource
//
//  Created by Guy Lis on 09/09/2020.
//  Copyright © 2020 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface ISImpressionData : NSObject

@property (readonly, copy) NSString*    _Nullable auction_id;
@property (readonly, copy) NSString*    _Nullable ad_unit;
@property (readonly, copy) NSString*    _Nullable ad_network;
@property (readonly, copy) NSString*    _Nullable instance_name;
@property (readonly, copy) NSString*    _Nullable instance_id;
@property (readonly, copy) NSString*    _Nullable country;
@property (readonly, copy) NSString*    _Nullable placement;
@property (readonly, copy) NSNumber*    _Nullable revenue;
@property (readonly, copy) NSString*    _Nullable precision;
@property (readonly, copy) NSString*    _Nullable ab;
@property (readonly, copy) NSString*    _Nullable segment_name;
@property (readonly, copy) NSNumber*    _Nullable lifetime_revenue;
@property (readonly, copy) NSString*    _Nullable encrypted_cpm;
@property (readonly, copy) NSNumber*    _Nullable conversion_value;

@property (readonly, copy) NSDictionary* _Nullable all_data;

- (instancetype)initWithDictionary:(NSDictionary *)dictionary;

- (void) replacePlacementMacro:(NSString *) macro
                         value:(NSString *) value;

@end



NS_ASSUME_NONNULL_END
