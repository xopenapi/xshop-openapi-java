package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class RefundTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private RefundLineItemConnectionTO refundLineItems;
    @javax.validation.constraints.NotNull
    private OrderTransactionConnectionTO transactions;

    public RefundTO() {
    }

    public RefundTO(String id, RefundLineItemConnectionTO refundLineItems, OrderTransactionConnectionTO transactions) {
        this.id = id;
        this.refundLineItems = refundLineItems;
        this.transactions = transactions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public RefundLineItemConnectionTO getRefundLineItems() {
        return refundLineItems;
    }
    public void setRefundLineItems(RefundLineItemConnectionTO refundLineItems) {
        this.refundLineItems = refundLineItems;
    }

    /**
     * The RefundLineItem resources attached to the refund.
     */
    public OrderTransactionConnectionTO getTransactions() {
        return transactions;
    }
    /**
     * The RefundLineItem resources attached to the refund.
     */
    public void setTransactions(OrderTransactionConnectionTO transactions) {
        this.transactions = transactions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (refundLineItems != null) {
            joiner.add("refundLineItems: " + GraphQLRequestSerializer.getEntry(refundLineItems));
        }
        if (transactions != null) {
            joiner.add("transactions: " + GraphQLRequestSerializer.getEntry(transactions));
        }
        return joiner.toString();
    }

    public static RefundTO.Builder builder() {
        return new RefundTO.Builder();
    }

    public static class Builder {

        private String id;
        private RefundLineItemConnectionTO refundLineItems;
        private OrderTransactionConnectionTO transactions;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setRefundLineItems(RefundLineItemConnectionTO refundLineItems) {
            this.refundLineItems = refundLineItems;
            return this;
        }

        /**
         * The RefundLineItem resources attached to the refund.
         */
        public Builder setTransactions(OrderTransactionConnectionTO transactions) {
            this.transactions = transactions;
            return this;
        }


        public RefundTO build() {
            return new RefundTO(id, refundLineItems, transactions);
        }

    }
}
