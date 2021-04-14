package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class RefundLineItemEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private RefundLineItemTO node;

    public RefundLineItemEdgeTO() {
    }

    public RefundLineItemEdgeTO(String cursor, RefundLineItemTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RefundLineItemTO getNode() {
        return node;
    }
    public void setNode(RefundLineItemTO node) {
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

    public static RefundLineItemEdgeTO.Builder builder() {
        return new RefundLineItemEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private RefundLineItemTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(RefundLineItemTO node) {
            this.node = node;
            return this;
        }


        public RefundLineItemEdgeTO build() {
            return new RefundLineItemEdgeTO(cursor, node);
        }

    }
}
