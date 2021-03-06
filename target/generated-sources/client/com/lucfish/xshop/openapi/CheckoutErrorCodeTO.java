package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum CheckoutErrorCodeTO {

    UNABLE_TO_APPLY("UNABLE_TO_APPLY"),
    BAD_DOMAIN("BAD_DOMAIN"),
    BLANK("BLANK"),
    CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE("CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE"),
    CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE("CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE"),
    DISCOUNT_ALREADY_APPLIED("DISCOUNT_ALREADY_APPLIED"),
    DISCOUNT_DISABLED("DISCOUNT_DISABLED"),
    DISCOUNT_EXPIRED("DISCOUNT_EXPIRED"),
    DISCOUNT_LIMIT_REACHED("DISCOUNT_LIMIT_REACHED"),
    DISCOUNT_NOT_FOUND("DISCOUNT_NOT_FOUND"),
    EMPTY("EMPTY"),
    GIFT_CARD_ALREADY_APPLIED("GIFT_CARD_ALREADY_APPLIED"),
    GIFT_CARD_CODE_INVALID("GIFT_CARD_CODE_INVALID"),
    GIFT_CARD_CURRENCY_MISMATCH("GIFT_CARD_CURRENCY_MISMATCH"),
    GIFT_CARD_DEPLETED("GIFT_CARD_DEPLETED"),
    GIFT_CARD_DISABLED("GIFT_CARD_DISABLED"),
    GIFT_CARD_EXPIRED("GIFT_CARD_EXPIRED"),
    GIFT_CARD_NOT_FOUND("GIFT_CARD_NOT_FOUND"),
    GIFT_CARD_UNUSABLE("GIFT_CARD_UNUSABLE"),
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    INVALID("INVALID"),
    INVALID_FOR_COUNTRY("INVALID_FOR_COUNTRY"),
    INVALID_FOR_COUNTRY_AND_PROVINCE("INVALID_FOR_COUNTRY_AND_PROVINCE"),
    INVALID_PROVINCE_IN_COUNTRY("INVALID_PROVINCE_IN_COUNTRY"),
    INVALID_REGION_IN_COUNTRY("INVALID_REGION_IN_COUNTRY"),
    INVALID_STATE_IN_COUNTRY("INVALID_STATE_IN_COUNTRY"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    LINE_ITEM_NOT_FOUND("LINE_ITEM_NOT_FOUND"),
    LOCKED("LOCKED"),
    MISSING_PAYMENT_INPUT("MISSING_PAYMENT_INPUT"),
    NOT_ENOUGH_IN_STOCK("NOT_ENOUGH_IN_STOCK"),
    NOT_SUPPORTED("NOT_SUPPORTED"),
    PRESENT("PRESENT"),
    SHIPPING_RATE_EXPIRED("SHIPPING_RATE_EXPIRED"),
    TOO_LONG("TOO_LONG"),
    TOTAL_PRICE_MISMATCH("TOTAL_PRICE_MISMATCH"),
    ALREADY_COMPLETED("ALREADY_COMPLETED");

    private final String graphqlName;

    private CheckoutErrorCodeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
