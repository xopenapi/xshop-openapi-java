package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class InventoryLevelEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private InventoryLevelTO node;

    public InventoryLevelEdgeTO() {
    }

    public InventoryLevelEdgeTO(String cursor, InventoryLevelTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public InventoryLevelTO getNode() {
        return node;
    }
    public void setNode(InventoryLevelTO node) {
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

    public static InventoryLevelEdgeTO.Builder builder() {
        return new InventoryLevelEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private InventoryLevelTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(InventoryLevelTO node) {
            this.node = node;
            return this;
        }


        public InventoryLevelEdgeTO build() {
            return new InventoryLevelEdgeTO(cursor, node);
        }

    }
}
