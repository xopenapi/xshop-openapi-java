package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CustomerPaymentMethodEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private CustomerPaymentMethodTO node;

    public CustomerPaymentMethodEdgeTO() {
    }

    public CustomerPaymentMethodEdgeTO(String cursor, CustomerPaymentMethodTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CustomerPaymentMethodTO getNode() {
        return node;
    }
    public void setNode(CustomerPaymentMethodTO node) {
        this.node = node;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        return joiner.toString();
    }

    public static CustomerPaymentMethodEdgeTO.Builder builder() {
        return new CustomerPaymentMethodEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private CustomerPaymentMethodTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(CustomerPaymentMethodTO node) {
            this.node = node;
            return this;
        }


        public CustomerPaymentMethodEdgeTO build() {
            return new CustomerPaymentMethodEdgeTO(cursor, node);
        }

    }
}
