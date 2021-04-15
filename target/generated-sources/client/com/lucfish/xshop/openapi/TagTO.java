package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class TagTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private TagGroupTO group;
    @javax.validation.constraints.NotNull
    private String value;
    private double weight;

    public TagTO() {
    }

    public TagTO(String id, TagGroupTO group, String value, double weight) {
        this.id = id;
        this.group = group;
        this.value = value;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public TagGroupTO getGroup() {
        return group;
    }
    public void setGroup(TagGroupTO group) {
        this.group = group;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (group != null) {
            joiner.add("group: " + GraphQLRequestSerializer.getEntry(group));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        joiner.add("weight: " + GraphQLRequestSerializer.getEntry(weight));
        return joiner.toString();
    }

    public static TagTO.Builder builder() {
        return new TagTO.Builder();
    }

    public static class Builder {

        private String id;
        private TagGroupTO group;
        private String value;
        private double weight;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setGroup(TagGroupTO group) {
            this.group = group;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }


        public TagTO build() {
            return new TagTO(id, group, value, weight);
        }

    }
}
