package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public enum ProductImageSortKeysTO {

    CREATED_AT("CREATED_AT"),
    ID("ID"),
    POSITION("POSITION"),
    RELEVANCE("RELEVANCE");

    private final String graphqlName;

    private ProductImageSortKeysTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}