package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class MetafieldTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String namespace;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String value;
    @javax.validation.constraints.NotNull
    private MetafieldValueTypeTO valueType;
    @javax.validation.constraints.NotNull
    private MetafieldOwnerTypeTO ownerType;
    private String description;

    public MetafieldTO() {
    }

    public MetafieldTO(String id, String key, String namespace, java.util.Date createdAt, java.util.Date updatedAt, String value, MetafieldValueTypeTO valueType, MetafieldOwnerTypeTO ownerType, String description) {
        this.id = id;
        this.key = key;
        this.namespace = namespace;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.value = value;
        this.valueType = valueType;
        this.ownerType = ownerType;
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public MetafieldValueTypeTO getValueType() {
        return valueType;
    }
    public void setValueType(MetafieldValueTypeTO valueType) {
        this.valueType = valueType;
    }

    public MetafieldOwnerTypeTO getOwnerType() {
        return ownerType;
    }
    public void setOwnerType(MetafieldOwnerTypeTO ownerType) {
        this.ownerType = ownerType;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (namespace != null) {
            joiner.add("namespace: " + GraphQLRequestSerializer.getEntry(namespace));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (ownerType != null) {
            joiner.add("ownerType: " + GraphQLRequestSerializer.getEntry(ownerType));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        return joiner.toString();
    }

    public static MetafieldTO.Builder builder() {
        return new MetafieldTO.Builder();
    }

    public static class Builder {

        private String id;
        private String key;
        private String namespace;
        private java.util.Date createdAt;
        private java.util.Date updatedAt;
        private String value;
        private MetafieldValueTypeTO valueType;
        private MetafieldOwnerTypeTO ownerType;
        private String description;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.util.Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setValueType(MetafieldValueTypeTO valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setOwnerType(MetafieldOwnerTypeTO ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public MetafieldTO build() {
            return new MetafieldTO(id, key, namespace, createdAt, updatedAt, value, valueType, ownerType, description);
        }

    }
}
