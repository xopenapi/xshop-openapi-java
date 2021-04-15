package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum DiscountApplicationAllocationMethodTO {

    ACROSS("ACROSS"),
    /**
     * The value is spread across all entitled lines.
     */
    EACH("EACH");

    private final String graphqlName;

    private DiscountApplicationAllocationMethodTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
