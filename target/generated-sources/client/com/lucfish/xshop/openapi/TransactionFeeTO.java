package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class TransactionFeeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private MoneyTO amount;
    @javax.validation.constraints.NotNull
    private MoneyTO flatFee;
    private String flatFeeName;
    @javax.validation.constraints.NotNull
    private String id;
    private double rate;
    private String rateName;
    @javax.validation.constraints.NotNull
    private MoneyTO taxAmount;
    @javax.validation.constraints.NotNull
    private String type;

    public TransactionFeeTO() {
    }

    public TransactionFeeTO(MoneyTO amount, MoneyTO flatFee, String flatFeeName, String id, double rate, String rateName, MoneyTO taxAmount, String type) {
        this.amount = amount;
        this.flatFee = flatFee;
        this.flatFeeName = flatFeeName;
        this.id = id;
        this.rate = rate;
        this.rateName = rateName;
        this.taxAmount = taxAmount;
        this.type = type;
    }

    public MoneyTO getAmount() {
        return amount;
    }
    public void setAmount(MoneyTO amount) {
        this.amount = amount;
    }

    /**
     * Amount of the fee.
     */
    public MoneyTO getFlatFee() {
        return flatFee;
    }
    /**
     * Amount of the fee.
     */
    public void setFlatFee(MoneyTO flatFee) {
        this.flatFee = flatFee;
    }

    /**
     * Flat rate charge for a transaction.
     */
    public String getFlatFeeName() {
        return flatFeeName;
    }
    /**
     * Flat rate charge for a transaction.
     */
    public void setFlatFeeName(String flatFeeName) {
        this.flatFeeName = flatFeeName;
    }

    /**
     * Name of the credit card flat fee.
     */
    public String getId() {
        return id;
    }
    /**
     * Name of the credit card flat fee.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Globally unique identifier.
     */
    public double getRate() {
        return rate;
    }
    /**
     * Globally unique identifier.
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Percentage charge.
     */
    public String getRateName() {
        return rateName;
    }
    /**
     * Percentage charge.
     */
    public void setRateName(String rateName) {
        this.rateName = rateName;
    }

    /**
     * Name of the credit card rate.
     */
    public MoneyTO getTaxAmount() {
        return taxAmount;
    }
    /**
     * Name of the credit card rate.
     */
    public void setTaxAmount(MoneyTO taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Tax amount charged on the fee.
     */
    public String getType() {
        return type;
    }
    /**
     * Tax amount charged on the fee.
     */
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (amount != null) {
            joiner.add("amount: " + GraphQLRequestSerializer.getEntry(amount));
        }
        if (flatFee != null) {
            joiner.add("flatFee: " + GraphQLRequestSerializer.getEntry(flatFee));
        }
        if (flatFeeName != null) {
            joiner.add("flatFeeName: " + GraphQLRequestSerializer.getEntry(flatFeeName));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("rate: " + GraphQLRequestSerializer.getEntry(rate));
        if (rateName != null) {
            joiner.add("rateName: " + GraphQLRequestSerializer.getEntry(rateName));
        }
        if (taxAmount != null) {
            joiner.add("taxAmount: " + GraphQLRequestSerializer.getEntry(taxAmount));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

    public static TransactionFeeTO.Builder builder() {
        return new TransactionFeeTO.Builder();
    }

    public static class Builder {

        private MoneyTO amount;
        private MoneyTO flatFee;
        private String flatFeeName;
        private String id;
        private double rate;
        private String rateName;
        private MoneyTO taxAmount;
        private String type;

        public Builder() {
        }

        public Builder setAmount(MoneyTO amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Amount of the fee.
         */
        public Builder setFlatFee(MoneyTO flatFee) {
            this.flatFee = flatFee;
            return this;
        }

        /**
         * Flat rate charge for a transaction.
         */
        public Builder setFlatFeeName(String flatFeeName) {
            this.flatFeeName = flatFeeName;
            return this;
        }

        /**
         * Name of the credit card flat fee.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Globally unique identifier.
         */
        public Builder setRate(double rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Percentage charge.
         */
        public Builder setRateName(String rateName) {
            this.rateName = rateName;
            return this;
        }

        /**
         * Name of the credit card rate.
         */
        public Builder setTaxAmount(MoneyTO taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Tax amount charged on the fee.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }


        public TransactionFeeTO build() {
            return new TransactionFeeTO(amount, flatFee, flatFeeName, id, rate, rateName, taxAmount, type);
        }

    }
}
