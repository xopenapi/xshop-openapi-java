package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductOptionValueTO implements java.io.Serializable {

    private ImageTO image;
    @javax.validation.constraints.NotNull
    private String value;

    public ProductOptionValueTO() {
    }

    public ProductOptionValueTO(ImageTO image, String value) {
        this.image = image;
        this.value = value;
    }

    public ImageTO getImage() {
        return image;
    }
    public void setImage(ImageTO image) {
        this.image = image;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static ProductOptionValueTO.Builder builder() {
        return new ProductOptionValueTO.Builder();
    }

    public static class Builder {

        private ImageTO image;
        private String value;

        public Builder() {
        }

        public Builder setImage(ImageTO image) {
            this.image = image;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public ProductOptionValueTO build() {
            return new ProductOptionValueTO(image, value);
        }

    }
}
