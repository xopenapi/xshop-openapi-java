package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum OrderSortKeysTO {

    UPDATED_AT("UPDATED_AT"),
    CUSTOMER_NAME("CUSTOMER_NAME"),
    FINANCIAL_STATUS("FINANCIAL_STATUS"),
    FULFILLMENT_STATUS("FULFILLMENT_STATUS"),
    ID("ID"),
    ORDER_NUMBER("ORDER_NUMBER"),
    PROCESSED_AT("PROCESSED_AT"),
    RELEVANCE("RELEVANCE"),
    TOTAL_PRICE("TOTAL_PRICE"),
    CREATED_AT("CREATED_AT");

    private final String graphqlName;

    private OrderSortKeysTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
