package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum FulfillmentStatusTO {

    CANCELLED("CANCELLED"),
    ERROR("ERROR"),
    FAILURE("FAILURE"),
    OPEN("OPEN"),
    PENDING("PENDING"),
    SUCCESS("SUCCESS");

    private final String graphqlName;

    private FulfillmentStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
