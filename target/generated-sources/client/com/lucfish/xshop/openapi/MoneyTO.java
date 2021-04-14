package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class MoneyTO implements java.io.Serializable, PricingValueTO {

    private double amount;
    @javax.validation.constraints.NotNull
    private CurrencyCodeTO currencyCode;

    public MoneyTO() {
    }

    public MoneyTO(double amount, CurrencyCodeTO currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CurrencyCodeTO getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(CurrencyCodeTO currencyCode) {
        this.currencyCode = currencyCode;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("amount: " + GraphQLRequestSerializer.getEntry(amount));
        if (currencyCode != null) {
            joiner.add("currencyCode: " + GraphQLRequestSerializer.getEntry(currencyCode));
        }
        return joiner.toString();
    }

    public static MoneyTO.Builder builder() {
        return new MoneyTO.Builder();
    }

    public static class Builder {

        private double amount;
        private CurrencyCodeTO currencyCode;

        public Builder() {
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setCurrencyCode(CurrencyCodeTO currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }


        public MoneyTO build() {
            return new MoneyTO(amount, currencyCode);
        }

    }
}
