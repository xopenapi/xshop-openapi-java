package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class DiscountApplicationEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private DiscountApplicationTO node;

    public DiscountApplicationEdgeTO() {
    }

    public DiscountApplicationEdgeTO(String cursor, DiscountApplicationTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DiscountApplicationTO getNode() {
        return node;
    }
    public void setNode(DiscountApplicationTO node) {
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

    public static DiscountApplicationEdgeTO.Builder builder() {
        return new DiscountApplicationEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private DiscountApplicationTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(DiscountApplicationTO node) {
            this.node = node;
            return this;
        }


        public DiscountApplicationEdgeTO build() {
            return new DiscountApplicationEdgeTO(cursor, node);
        }

    }
}
