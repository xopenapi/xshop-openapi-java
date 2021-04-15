package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductDeleteInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;

    public ProductDeleteInputTO() {
    }

    public ProductDeleteInputTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

    public static ProductDeleteInputTO.Builder builder() {
        return new ProductDeleteInputTO.Builder();
    }

    public static class Builder {

        private String id;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public ProductDeleteInputTO build() {
            return new ProductDeleteInputTO(id);
        }

    }
}
