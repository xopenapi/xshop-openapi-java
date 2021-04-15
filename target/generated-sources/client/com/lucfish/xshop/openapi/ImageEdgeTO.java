package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ImageEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private ImageTO node;

    public ImageEdgeTO() {
    }

    public ImageEdgeTO(String cursor, ImageTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ImageTO getNode() {
        return node;
    }
    public void setNode(ImageTO node) {
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

    public static ImageEdgeTO.Builder builder() {
        return new ImageEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private ImageTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(ImageTO node) {
            this.node = node;
            return this;
        }


        public ImageEdgeTO build() {
            return new ImageEdgeTO(cursor, node);
        }

    }
}
