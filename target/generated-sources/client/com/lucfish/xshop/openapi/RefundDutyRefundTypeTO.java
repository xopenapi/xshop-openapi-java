package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public enum RefundDutyRefundTypeTO {

    FULL("FULL"),
    PROPORTIONAL("PROPORTIONAL");

    private final String graphqlName;

    private RefundDutyRefundTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
