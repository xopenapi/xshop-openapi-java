package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MetafieldInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String Key;

    public MetafieldInputTO() {
    }

    public MetafieldInputTO(String Key) {
        this.Key = Key;
    }

    public String getKey() {
        return Key;
    }
    public void setKey(String Key) {
        this.Key = Key;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (Key != null) {
            joiner.add("Key: " + GraphQLRequestSerializer.getEntry(Key));
        }
        return joiner.toString();
    }

    public static MetafieldInputTO.Builder builder() {
        return new MetafieldInputTO.Builder();
    }

    public static class Builder {

        private String Key;

        public Builder() {
        }

        public Builder setKey(String Key) {
            this.Key = Key;
            return this;
        }


        public MetafieldInputTO build() {
            return new MetafieldInputTO(Key);
        }

    }
}
