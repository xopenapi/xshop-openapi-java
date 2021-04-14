package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductOptionValueInputTO implements java.io.Serializable {

    private ImageInputTO image;
    @javax.validation.constraints.NotNull
    private String value;

    public ProductOptionValueInputTO() {
    }

    public ProductOptionValueInputTO(ImageInputTO image, String value) {
        this.image = image;
        this.value = value;
    }

    public ImageInputTO getImage() {
        return image;
    }
    public void setImage(ImageInputTO image) {
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

    public static ProductOptionValueInputTO.Builder builder() {
        return new ProductOptionValueInputTO.Builder();
    }

    public static class Builder {

        private ImageInputTO image;
        private String value;

        public Builder() {
        }

        public Builder setImage(ImageInputTO image) {
            this.image = image;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public ProductOptionValueInputTO build() {
            return new ProductOptionValueInputTO(image, value);
        }

    }
}
