package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderTransactionEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private OrderTransactionTO node;

    public OrderTransactionEdgeTO() {
    }

    public OrderTransactionEdgeTO(String cursor, OrderTransactionTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public OrderTransactionTO getNode() {
        return node;
    }
    public void setNode(OrderTransactionTO node) {
        this.node = node;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        return joiner.toString();
    }

    public static OrderTransactionEdgeTO.Builder builder() {
        return new OrderTransactionEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private OrderTransactionTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(OrderTransactionTO node) {
            this.node = node;
            return this;
        }


        public OrderTransactionEdgeTO build() {
            return new OrderTransactionEdgeTO(cursor, node);
        }

    }
}
