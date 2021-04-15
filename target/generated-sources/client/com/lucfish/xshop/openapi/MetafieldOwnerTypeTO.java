package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum MetafieldOwnerTypeTO {

    COLLECTION("COLLECTION"),
    CUSTOMER("CUSTOMER"),
    ORDER("ORDER"),
    PAGE("PAGE"),
    PRODUCT("PRODUCT"),
    PRODUCTIMAGE("PRODUCTIMAGE"),
    PRODUCTVARIANT("PRODUCTVARIANT"),
    ARTICLE("ARTICLE");

    private final String graphqlName;

    private MetafieldOwnerTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
