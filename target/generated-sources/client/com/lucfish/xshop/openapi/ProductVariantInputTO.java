package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductVariantInputTO implements java.io.Serializable {

    private String title;

    public ProductVariantInputTO() {
    }

    public ProductVariantInputTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static ProductVariantInputTO.Builder builder() {
        return new ProductVariantInputTO.Builder();
    }

    public static class Builder {

        private String title;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public ProductVariantInputTO build() {
            return new ProductVariantInputTO(title);
        }

    }
}
