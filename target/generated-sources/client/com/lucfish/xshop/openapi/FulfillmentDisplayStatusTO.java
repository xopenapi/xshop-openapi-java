package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum FulfillmentDisplayStatusTO {

    SUBMITTED("SUBMITTED"),
    CANCELED("CANCELED"),
    CONFIRMED("CONFIRMED"),
    DELIVERED("DELIVERED"),
    FAILURE("FAILURE"),
    FULFILLED("FULFILLED"),
    IN_TRANSIT("IN_TRANSIT"),
    LABEL_PRINTED("LABEL_PRINTED"),
    LABEL_PURCHASED("LABEL_PURCHASED"),
    LABEL_VOIDED("LABEL_VOIDED"),
    MARKED_AS_FULFILLED("MARKED_AS_FULFILLED"),
    NOT_DELIVERED("NOT_DELIVERED"),
    OUT_FOR_DELIVERY("OUT_FOR_DELIVERY"),
    PICKED_UP("PICKED_UP"),
    READY_FOR_PICKUP("READY_FOR_PICKUP"),
    ATTEMPTED_DELIVERY("ATTEMPTED_DELIVERY");

    private final String graphqlName;

    private FulfillmentDisplayStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
