package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ShippingRefundInputTO implements java.io.Serializable {

    private Double amount;
    private Boolean fullRefund;

    public ShippingRefundInputTO() {
    }

    public ShippingRefundInputTO(Double amount, Boolean fullRefund) {
        this.amount = amount;
        this.fullRefund = fullRefund;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getFullRefund() {
        return fullRefund;
    }
    public void setFullRefund(Boolean fullRefund) {
        this.fullRefund = fullRefund;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (amount != null) {
            joiner.add("amount: " + GraphQLRequestSerializer.getEntry(amount));
        }
        if (fullRefund != null) {
            joiner.add("fullRefund: " + GraphQLRequestSerializer.getEntry(fullRefund));
        }
        return joiner.toString();
    }

    public static ShippingRefundInputTO.Builder builder() {
        return new ShippingRefundInputTO.Builder();
    }

    public static class Builder {

        private Double amount;
        private Boolean fullRefund;

        public Builder() {
        }

        public Builder setAmount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setFullRefund(Boolean fullRefund) {
            this.fullRefund = fullRefund;
            return this;
        }


        public ShippingRefundInputTO build() {
            return new ShippingRefundInputTO(amount, fullRefund);
        }

    }
}
