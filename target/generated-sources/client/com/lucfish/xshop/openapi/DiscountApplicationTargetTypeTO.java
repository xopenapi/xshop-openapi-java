package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public enum DiscountApplicationTargetTypeTO {

    LINE_ITEM("LINE_ITEM"),
    /**
     * The discount applies onto line items.
     */
    SHIPPING_LINE("SHIPPING_LINE");

    private final String graphqlName;

    private DiscountApplicationTargetTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
