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
