package com.lucfish.xshop.openapi;

/**
 * Transaction status' describe the status of a transaction.
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum OrderTransactionStatusTO {

    AWAITING_RESPONSE("AWAITING_RESPONSE"),
    /**
     * Awaiting a response.
     */
    ERROR("ERROR"),
    /**
     * There was an error while processing the transaction.
     */
    FAILURE("FAILURE"),
    /**
     * The transaction failed.
     */
    PENDING("PENDING"),
    /**
     * The transaction is pending.
     */
    SUCCESS("SUCCESS"),
    /**
     * The transaction succeeded.
     */
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private OrderTransactionStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
