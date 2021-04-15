package com.lucfish.xshop.openapi;

/**
 * The type of restock performed for a particular refund line item.
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum RefundLineItemRestockTypeTO {

    CANCEL("CANCEL"),
    /**
     * Refund line item was canceled.
     */
    LEGACY_RESTOCK("LEGACY_RESTOCK"),
    /**
     * Refund line item was restocked, without specifically being identified as a return or cancelation.
     */
    NO_RESTOCK("NO_RESTOCK"),
    /**
     * Refund line item was not restocked.
     */
    RETURN("RETURN");

    private final String graphqlName;

    private RefundLineItemRestockTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
