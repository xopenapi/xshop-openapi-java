package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class TagInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String value;

    public TagInputTO() {
    }

    public TagInputTO(String value) {
        this.value = value;
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
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static TagInputTO.Builder builder() {
        return new TagInputTO.Builder();
    }

    public static class Builder {

        private String value;

        public Builder() {
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public TagInputTO build() {
            return new TagInputTO(value);
        }

    }
}
