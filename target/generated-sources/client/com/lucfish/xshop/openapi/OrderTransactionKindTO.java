package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public enum OrderTransactionKindTO {

    VOID("VOID"),
    CAPTURE("CAPTURE"),
    CHANGE("CHANGE"),
    EMV_AUTHORIZATION("EMV_AUTHORIZATION"),
    REFUND("REFUND"),
    SALE("SALE"),
    SUGGESTED_REFUND("SUGGESTED_REFUND"),
    AUTHORIZATION("AUTHORIZATION");

    private final String graphqlName;

    private OrderTransactionKindTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
