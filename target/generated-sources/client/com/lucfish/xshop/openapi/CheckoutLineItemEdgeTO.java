package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CheckoutLineItemEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private CheckoutLineItemTO node;

    public CheckoutLineItemEdgeTO() {
    }

    public CheckoutLineItemEdgeTO(String cursor, CheckoutLineItemTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckoutLineItemTO getNode() {
        return node;
    }
    public void setNode(CheckoutLineItemTO node) {
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

    public static CheckoutLineItemEdgeTO.Builder builder() {
        return new CheckoutLineItemEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private CheckoutLineItemTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(CheckoutLineItemTO node) {
            this.node = node;
            return this;
        }


        public CheckoutLineItemEdgeTO build() {
            return new CheckoutLineItemEdgeTO(cursor, node);
        }

    }
}
