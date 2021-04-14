package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents the information about the tax charged on the associated line item.
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class TaxLineTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private MoneyBagTO priceSet;
    private Double rate;
    private Double ratePercentage;
    @javax.validation.constraints.NotNull
    private String title;

    public TaxLineTO() {
    }

    public TaxLineTO(MoneyBagTO priceSet, Double rate, Double ratePercentage, String title) {
        this.priceSet = priceSet;
        this.rate = rate;
        this.ratePercentage = ratePercentage;
        this.title = title;
    }

    public MoneyBagTO getPriceSet() {
        return priceSet;
    }
    public void setPriceSet(MoneyBagTO priceSet) {
        this.priceSet = priceSet;
    }

    /**
     * The amount of tax to be charged in shop and presentment currencies.
     */
    public Double getRate() {
        return rate;
    }
    /**
     * The amount of tax to be charged in shop and presentment currencies.
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * The tax rate to be applied.
     */
    public Double getRatePercentage() {
        return ratePercentage;
    }
    /**
     * The tax rate to be applied.
     */
    public void setRatePercentage(Double ratePercentage) {
        this.ratePercentage = ratePercentage;
    }

    /**
     * The percentage of the price that the tax rate represents.
     */
    public String getTitle() {
        return title;
    }
    /**
     * The percentage of the price that the tax rate represents.
     */
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (priceSet != null) {
            joiner.add("priceSet: " + GraphQLRequestSerializer.getEntry(priceSet));
        }
        if (rate != null) {
            joiner.add("rate: " + GraphQLRequestSerializer.getEntry(rate));
        }
        if (ratePercentage != null) {
            joiner.add("ratePercentage: " + GraphQLRequestSerializer.getEntry(ratePercentage));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static TaxLineTO.Builder builder() {
        return new TaxLineTO.Builder();
    }

    public static class Builder {

        private MoneyBagTO priceSet;
        private Double rate;
        private Double ratePercentage;
        private String title;

        public Builder() {
        }

        public Builder setPriceSet(MoneyBagTO priceSet) {
            this.priceSet = priceSet;
            return this;
        }

        /**
         * The amount of tax to be charged in shop and presentment currencies.
         */
        public Builder setRate(Double rate) {
            this.rate = rate;
            return this;
        }

        /**
         * The tax rate to be applied.
         */
        public Builder setRatePercentage(Double ratePercentage) {
            this.ratePercentage = ratePercentage;
            return this;
        }

        /**
         * The percentage of the price that the tax rate represents.
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public TaxLineTO build() {
            return new TaxLineTO(priceSet, rate, ratePercentage, title);
        }

    }
}
