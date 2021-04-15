package com.lucfish.xshop.openapi;

/**
 * A standardized error code, independent of the payment provider
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum OrderTransactionErrorCodeTO {

    UNSUPPORTED_FEATURE("UNSUPPORTED_FEATURE"),
    /**
     * The gateway or merchant configuration doesn't support a feature, such as network tokenization.
     */
    AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED("AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED"),
    /**
     * The maximum amount has been captured.
     */
    AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED("AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED"),
    /**
     * The maximum amount has been refunded.
     */
    AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED("AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED"),
    /**
     * The maximum of 10 authorizations has been captured for an order.
     */
    AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED("AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED"),
    /**
     * The maximum of 10 refunds has been processed for an order.
     */
    AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED("AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED"),
    /**
     * The order was canceled, which canceled all open authorizations.
     */
    AMAZON_PAYMENTS_STALE("AMAZON_PAYMENTS_STALE"),
    /**
     * The order was not confirmed within three hours.
     */
    AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD("AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD"),
    /**
     * The payment method was invalid.
     */
    CALL_ISSUER("CALL_ISSUER"),
    /**
     * Call the card issuer.
     */
    CARD_DECLINED("CARD_DECLINED"),
    /**
     * The card was declined.
     */
    CONFIG_ERROR("CONFIG_ERROR"),
    /**
     * There is an error in the gateway or merchant configuration.
     */
    EXPIRED_CARD("EXPIRED_CARD"),
    /**
     * The card is expired.
     */
    GENERIC_ERROR("GENERIC_ERROR"),
    /**
     * There was an unknown error with processing the payment.
     */
    INCORRECT_ADDRESS("INCORRECT_ADDRESS"),
    /**
     * The address does not match the card number.
     */
    INCORRECT_CVC("INCORRECT_CVC"),
    /**
     * The CVC does not match the card number.
     */
    INCORRECT_NUMBER("INCORRECT_NUMBER"),
    /**
     * The card number is incorrect.
     */
    INCORRECT_PIN("INCORRECT_PIN"),
    /**
     * The entered PIN is incorrect.
     */
    INCORRECT_ZIP("INCORRECT_ZIP"),
    /**
     * The ZIP or postal code does not match the card number.
     */
    INVALID_AMOUNT("INVALID_AMOUNT"),
    /**
     * The amount is either too high or too low for the provider.
     */
    INVALID_COUNTRY("INVALID_COUNTRY"),
    /**
     * The payment method is not available in the customer's country.
     */
    INVALID_CVC("INVALID_CVC"),
    /**
     * The format of the CVC is incorrect.
     */
    INVALID_EXPIRY_DATE("INVALID_EXPIRY_DATE"),
    /**
     * The format of the expiry date is incorrect.
     */
    INVALID_NUMBER("INVALID_NUMBER"),
    /**
     * The format of the card number is incorrect.
     */
    PAYMENT_METHOD_UNAVAILABLE("PAYMENT_METHOD_UNAVAILABLE"),
    /**
     * The payment method is momentarily unavailable.
     */
    PICK_UP_CARD("PICK_UP_CARD"),
    /**
     * The card has been reported as lost or stolen, and the card issuer has requested that the merchant keep the card and call the number on the back.
     */
    PROCESSING_ERROR("PROCESSING_ERROR"),
    /**
     * There was an error while processing the payment.
     */
    TEST_MODE_LIVE_CARD("TEST_MODE_LIVE_CARD");

    private final String graphqlName;

    private OrderTransactionErrorCodeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
