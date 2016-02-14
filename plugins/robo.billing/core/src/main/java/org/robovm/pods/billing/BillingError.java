/*
 * Copyright (C) 2016 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.billing;

public class BillingError extends RuntimeException {
    private static final long serialVersionUID = 3681610304894871387L;
    private ErrorType errorType = ErrorType.UNKNOWN;

    public BillingError(String message) {
        super(message);
    }

    public BillingError(ErrorType errorType) {
        this.errorType = errorType;
    }

    public BillingError(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public BillingError(Throwable throwable) {
        super(throwable);
    }

    public BillingError(ErrorType errorType, Throwable throwable) {
        super(throwable);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public enum ErrorType {
        UNKNOWN,
        UNAVAILABLE,
        NETWORK,
        ALREADY_REQUESTING_PRODUCTS,
        PRODUCTS_NOT_REQUESTED,
        ALREADY_RESTORING,
        UNKNOWN_PRODUCT_IDENTIFIER,
        TRANSACTION_DEFERRED,
        TRANSACTION_VERIFICATION_FAILED,
        TRANSACTION_VERIFICATOR_MISSING
    }
}
