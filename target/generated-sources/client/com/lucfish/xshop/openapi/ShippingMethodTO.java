package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ShippingMethodTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String code;
    @javax.validation.constraints.NotNull
    private String label;

    public ShippingMethodTO() {
    }

    public ShippingMethodTO(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (code != null) {
            joiner.add("code: " + GraphQLRequestSerializer.getEntry(code));
        }
        if (label != null) {
            joiner.add("label: " + GraphQLRequestSerializer.getEntry(label));
        }
        return joiner.toString();
    }

    public static ShippingMethodTO.Builder builder() {
        return new ShippingMethodTO.Builder();
    }

    public static class Builder {

        private String code;
        private String label;

        public Builder() {
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }


        public ShippingMethodTO build() {
            return new ShippingMethodTO(code, label);
        }

    }
}
