package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductPriceRangeEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private ProductPriceRangeTO node;

    public ProductPriceRangeEdgeTO() {
    }

    public ProductPriceRangeEdgeTO(String cursor, ProductPriceRangeTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ProductPriceRangeTO getNode() {
        return node;
    }
    public void setNode(ProductPriceRangeTO node) {
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

    public static ProductPriceRangeEdgeTO.Builder builder() {
        return new ProductPriceRangeEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private ProductPriceRangeTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(ProductPriceRangeTO node) {
            this.node = node;
            return this;
        }


        public ProductPriceRangeEdgeTO build() {
            return new ProductPriceRangeEdgeTO(cursor, node);
        }

    }
}
