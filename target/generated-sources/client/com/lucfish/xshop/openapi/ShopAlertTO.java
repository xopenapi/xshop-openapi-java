package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ShopAlertTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ShopAlertActionTO action;
    @javax.validation.constraints.NotNull
    private String description;

    public ShopAlertTO() {
    }

    public ShopAlertTO(ShopAlertActionTO action, String description) {
        this.action = action;
        this.description = description;
    }

    public ShopAlertActionTO getAction() {
        return action;
    }
    public void setAction(ShopAlertActionTO action) {
        this.action = action;
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
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        return joiner.toString();
    }

    public static ShopAlertTO.Builder builder() {
        return new ShopAlertTO.Builder();
    }

    public static class Builder {

        private ShopAlertActionTO action;
        private String description;

        public Builder() {
        }

        public Builder setAction(ShopAlertActionTO action) {
            this.action = action;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ShopAlertTO build() {
            return new ShopAlertTO(action, description);
        }

    }
}
