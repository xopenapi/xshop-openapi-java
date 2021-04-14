package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public enum FulfillmentServiceTypeTO {

    GIFT_CARD("GIFT_CARD"),
    MANUAL("MANUAL"),
    THIRD_PARTY("THIRD_PARTY");

    private final String graphqlName;

    private FulfillmentServiceTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
