
#import <Foundation/Foundation.h>

/** The class to store revenue data.
 It enables revenue tracking from in-app purchases and other purchases in your application.

 The Revenue object should be passed to the AppMetrica server by using the
 `reportRevenue` method of the `YMMYandexMetrica` class.

 Revenue events are displayed in the AppMetrica Revenue report.
 @note This interface has the mutable version `YMMMutableRevenueInfo`.
 */
@interface YMMRevenueInfo : NSObject <NSCopying, NSMutableCopying>

/** Price of the products purchased.
 It can be negative, e.g. for refunds.

 EXAMPLE: 0.99
 */
@property (nonatomic, assign, readonly) double price;

/** Currency code of the purchase in the ISO 4217 format.
 The value should contain 3 Latin letters in uppercase.

 EXAMPLE: RUB

 @warning If the value is not in the ISO 4217 format, the purchase is ignored.
 */
@property (nonatomic, copy, readonly) NSString *currency;

/** Quantity of products purchased.

 @note Revenue = quantity * price.
 @warning The value should be larger than 0. If the value is 0, the purchase is ignored.
 */
@property (nonatomic, assign, readonly) NSUInteger quantity;

/** ID of the product purchased.

 @warning The value can contain up to 200 characters.
 */
@property (nonatomic, copy, readonly) NSString *productID;

/** Information about the in-app purchase order from App Store.
 It should contain the `transactionIdentifier` string value of the `SKPaymentTransaction` class.

 @note This value should be passed along with `receiptData` to verify the transaction.

 For more information, see
 https://developer.apple.com/documentation/storekit/skpaymenttransaction/1411288-transactionidentifier
 */
@property (nonatomic, copy, readonly) NSString *transactionID;

/** Details about the in-app purchase order from App Store.
 @code
 NSURL *receiptURL = [[NSBundle mainBundle] appStoreReceiptURL];
 revenueInfo.receiptData = [NSData dataWithContentsOfURL:receiptURL];
 @endcode
 @note You should get the receipt data before calling [[SKPaymentQueue defaultQueue] finishTransaction:transaction].
 @note This value should be passed along with `transactionID` to verify the transaction.

 For more information, see
 https://developer.apple.com/library/content/releasenotes/General/ValidateAppStoreReceipt/Chapters/ValidateRemotely.html
 */
@property (nonatomic, copy, readonly) NSData *receiptData;

/** Additional information to be passed about the purchase.
 It should contain the `NSDictionary` object that can be converted to valid JSON.
 For instance, it can be used for categorizing your products.

 @warning The maximum size of the value is 30 KB.
 */
@property (nonatomic, copy, readonly) NSDictionary *payload;

/** Use the `initWithPrice:currency:` method instead.
 */
- (instancetype)init NS_UNAVAILABLE;

/** Initializes the RevenueInfo object with the specified price value.

 @param price Price of the products purchased. It can be negative, e.g. for refunds. EXAMPLE: 0.99
 @param currency Currency code of the purchase in the ISO 4217 format.
 The value should contain 3 Latin letters in uppercase. EXAMPLE: RUB
 */
- (instancetype)initWithPrice:(double)price currency:(NSString *)currency;

/** Initializes the RevenueInfo object with the following values:
 
 - price;
 - currency;
 - quantity;
 - productID;
 - transactionID;
 - receiptData;
 - payload.
 
 @param price Price of the products purchased. It can be negative, e.g. for refunds. EXAMPLE: 0.99
 @param currency Currency code of the purchase in the ISO 4217 format. The value should contain 3 Latin letters in uppercase. EXAMPLE: RUB
 @param quantity Quantity of the products purchased.
 @param productID ID of the product purchased.
 @param transactionID Information about the in-app purchase order from App Store.
 @param receiptData Details about the in-app purchase order from App Store.
 @param payload Additional information to be passed about the purchase.
 */
- (instancetype)initWithPrice:(double)price
                     currency:(NSString *)currency
                     quantity:(NSUInteger)quantity
                    productID:(NSString *)productID
                transactionID:(NSString *)transactionID
                  receiptData:(NSData *)receiptData
                      payload:(NSDictionary *)payload;

@end

/** Mutable version of the `YMMRevenueInfo` class.*/
@interface YMMMutableRevenueInfo : YMMRevenueInfo

/** Quantity of products purchased.

 @note Revenue = quantity * price.
 @warning The value should be larger than 0. If the value is 0, the purchase is ignored.
 */
@property (nonatomic, assign) NSUInteger quantity;

/** ID of the product purchased.

 @warning The value can contain up to 200 characters.
 */
@property (nonatomic, copy) NSString *productID;

/** Information about the in-app purchase order from App Store.
 It should contain the `transactionIdentifier` string value of the `SKPaymentTransaction` class.

 @note This value should be passed along with `receiptData` to verify the transaction.

 For more information, see
 https://developer.apple.com/documentation/storekit/skpaymenttransaction/1411288-transactionidentifier
 */
@property (nonatomic, copy) NSString *transactionID;

/** Details about the in-app purchase order from App Store.
 @code
 NSURL *receiptURL = [[NSBundle mainBundle] appStoreReceiptURL];
 revenueInfo.receiptData = [NSData dataWithContentsOfURL:receiptURL];
 @endcode
 @note You should get the receipt data before calling [[SKPaymentQueue defaultQueue] finishTransaction:transaction].
 @note This value should be passed along with `transactionID` to verify the transaction.

 For more information, see
 https://developer.apple.com/library/content/releasenotes/General/ValidateAppStoreReceipt/Chapters/ValidateRemotely.html
 */
@property (nonatomic, copy) NSData *receiptData;

/** Additional information to be passed about the purchase.
 It should contain the `NSDictionary` object that can be converted to valid JSON.
 For instance, it can be used for categorizing your products.

 @warning The maximum size of the value is 30 KB.
 */
@property (nonatomic, copy) NSDictionary *payload;

@end
