package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CheckoutUserErrorTO implements java.io.Serializable, DisplayableErrorTO {

    private CheckoutErrorCodeTO code;
    @javax.validation.constraints.NotNull
    private java.util.List<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public CheckoutUserErrorTO() {
    }

    public CheckoutUserErrorTO(CheckoutErrorCodeTO code, java.util.List<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public CheckoutErrorCodeTO getCode() {
        return code;
    }
    public void setCode(CheckoutErrorCodeTO code) {
        this.code = code;
    }

    public java.util.List<String> getField() {
        return field;
    }
    public void setField(java.util.List<String> field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (code != null) {
            joiner.add("code: " + GraphQLRequestSerializer.getEntry(code));
        }
        if (field != null) {
            joiner.add("field: " + GraphQLRequestSerializer.getEntry(field));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static CheckoutUserErrorTO.Builder builder() {
        return new CheckoutUserErrorTO.Builder();
    }

    public static class Builder {

        private CheckoutErrorCodeTO code;
        private java.util.List<String> field;
        private String message;

        public Builder() {
        }

        public Builder setCode(CheckoutErrorCodeTO code) {
            this.code = code;
            return this;
        }

        public Builder setField(java.util.List<String> field) {
            this.field = field;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public CheckoutUserErrorTO build() {
            return new CheckoutUserErrorTO(code, field, message);
        }

    }
}
