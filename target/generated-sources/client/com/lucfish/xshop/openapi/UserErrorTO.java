package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class UserErrorTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public UserErrorTO() {
    }

    public UserErrorTO(java.util.List<String> field, String message) {
        this.field = field;
        this.message = message;
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
        if (field != null) {
            joiner.add("field: " + GraphQLRequestSerializer.getEntry(field));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static UserErrorTO.Builder builder() {
        return new UserErrorTO.Builder();
    }

    public static class Builder {

        private java.util.List<String> field;
        private String message;

        public Builder() {
        }

        public Builder setField(java.util.List<String> field) {
            this.field = field;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public UserErrorTO build() {
            return new UserErrorTO(field, message);
        }

    }
}
