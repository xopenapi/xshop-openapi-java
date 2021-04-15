package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum ProductVariantSortKeysTO {

    ID("ID"),
    POSITION("POSITION"),
    RELEVANCE("RELEVANCE"),
    SKU("SKU"),
    TITLE("TITLE");

    private final String graphqlName;

    private ProductVariantSortKeysTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
