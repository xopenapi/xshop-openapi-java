package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductOptionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<ProductOptionValueTO> values;

    public ProductOptionTO() {
    }

    public ProductOptionTO(String id, String name, java.util.List<ProductOptionValueTO> values) {
        this.id = id;
        this.name = name;
        this.values = values;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<ProductOptionValueTO> getValues() {
        return values;
    }
    public void setValues(java.util.List<ProductOptionValueTO> values) {
        this.values = values;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        return joiner.toString();
    }

    public static ProductOptionTO.Builder builder() {
        return new ProductOptionTO.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<ProductOptionValueTO> values;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setValues(java.util.List<ProductOptionValueTO> values) {
            this.values = values;
            return this;
        }


        public ProductOptionTO build() {
            return new ProductOptionTO(id, name, values);
        }

    }
}
