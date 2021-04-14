package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class OrderCloseTO implements java.io.Serializable {

    private OrderTO order;
    @javax.validation.constraints.NotNull
    private java.util.List<UserErrorTO> userErrors;

    public OrderCloseTO() {
    }

    public OrderCloseTO(OrderTO order, java.util.List<UserErrorTO> userErrors) {
        this.order = order;
        this.userErrors = userErrors;
    }

    public OrderTO getOrder() {
        return order;
    }
    public void setOrder(OrderTO order) {
        this.order = order;
    }

    public java.util.List<UserErrorTO> getUserErrors() {
        return userErrors;
    }
    public void setUserErrors(java.util.List<UserErrorTO> userErrors) {
        this.userErrors = userErrors;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (order != null) {
            joiner.add("order: " + GraphQLRequestSerializer.getEntry(order));
        }
        if (userErrors != null) {
            joiner.add("userErrors: " + GraphQLRequestSerializer.getEntry(userErrors));
        }
        return joiner.toString();
    }

    public static OrderCloseTO.Builder builder() {
        return new OrderCloseTO.Builder();
    }

    public static class Builder {

        private OrderTO order;
        private java.util.List<UserErrorTO> userErrors;

        public Builder() {
        }

        public Builder setOrder(OrderTO order) {
            this.order = order;
            return this;
        }

        public Builder setUserErrors(java.util.List<UserErrorTO> userErrors) {
            this.userErrors = userErrors;
            return this;
        }


        public OrderCloseTO build() {
            return new OrderCloseTO(order, userErrors);
        }

    }
}
