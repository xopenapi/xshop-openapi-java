package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum DiscountApplicationTargetSelectionTO {

    ALL("ALL"),
    /**
     * The discount is allocated onto all the lines.
     */
    ENTITLED("ENTITLED"),
    /**
     * The discount is allocated onto only the lines it is entitled for.
     */
    EXPLICIT("EXPLICIT");

    private final String graphqlName;

    private DiscountApplicationTargetSelectionTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
