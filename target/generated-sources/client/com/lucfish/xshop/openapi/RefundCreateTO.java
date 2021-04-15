package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class RefundCreateTO implements java.io.Serializable {

    private OrderTO order;
    private RefundTO refund;
    @javax.validation.constraints.NotNull
    private java.util.List<UserErrorTO> userErrors;

    public RefundCreateTO() {
    }

    public RefundCreateTO(OrderTO order, RefundTO refund, java.util.List<UserErrorTO> userErrors) {
        this.order = order;
        this.refund = refund;
        this.userErrors = userErrors;
    }

    public OrderTO getOrder() {
        return order;
    }
    public void setOrder(OrderTO order) {
        this.order = order;
    }

    public RefundTO getRefund() {
        return refund;
    }
    public void setRefund(RefundTO refund) {
        this.refund = refund;
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
        if (refund != null) {
            joiner.add("refund: " + GraphQLRequestSerializer.getEntry(refund));
        }
        if (userErrors != null) {
            joiner.add("userErrors: " + GraphQLRequestSerializer.getEntry(userErrors));
        }
        return joiner.toString();
    }

    public static RefundCreateTO.Builder builder() {
        return new RefundCreateTO.Builder();
    }

    public static class Builder {

        private OrderTO order;
        private RefundTO refund;
        private java.util.List<UserErrorTO> userErrors;

        public Builder() {
        }

        public Builder setOrder(OrderTO order) {
            this.order = order;
            return this;
        }

        public Builder setRefund(RefundTO refund) {
            this.refund = refund;
            return this;
        }

        public Builder setUserErrors(java.util.List<UserErrorTO> userErrors) {
            this.userErrors = userErrors;
            return this;
        }


        public RefundCreateTO build() {
            return new RefundCreateTO(order, refund, userErrors);
        }

    }
}
