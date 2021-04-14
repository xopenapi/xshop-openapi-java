package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public enum OrderRiskLevelTO {

    HIGH("HIGH"),
    /**
     * There is a high level of risk that this order is fraudulent.
     */
    LOW("LOW"),
    /**
     * There is a low level of risk that this order is fraudulent.
     */
    MEDIUM("MEDIUM");

    private final String graphqlName;

    private OrderRiskLevelTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
