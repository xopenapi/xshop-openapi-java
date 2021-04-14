package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductPriceRangeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private MoneyTO minVariantPrice;
    @javax.validation.constraints.NotNull
    private MoneyTO maxVariantPrice;

    public ProductPriceRangeTO() {
    }

    public ProductPriceRangeTO(MoneyTO minVariantPrice, MoneyTO maxVariantPrice) {
        this.minVariantPrice = minVariantPrice;
        this.maxVariantPrice = maxVariantPrice;
    }

    public MoneyTO getMinVariantPrice() {
        return minVariantPrice;
    }
    public void setMinVariantPrice(MoneyTO minVariantPrice) {
        this.minVariantPrice = minVariantPrice;
    }

    public MoneyTO getMaxVariantPrice() {
        return maxVariantPrice;
    }
    public void setMaxVariantPrice(MoneyTO maxVariantPrice) {
        this.maxVariantPrice = maxVariantPrice;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (minVariantPrice != null) {
            joiner.add("minVariantPrice: " + GraphQLRequestSerializer.getEntry(minVariantPrice));
        }
        if (maxVariantPrice != null) {
            joiner.add("maxVariantPrice: " + GraphQLRequestSerializer.getEntry(maxVariantPrice));
        }
        return joiner.toString();
    }

    public static ProductPriceRangeTO.Builder builder() {
        return new ProductPriceRangeTO.Builder();
    }

    public static class Builder {

        private MoneyTO minVariantPrice;
        private MoneyTO maxVariantPrice;

        public Builder() {
        }

        public Builder setMinVariantPrice(MoneyTO minVariantPrice) {
            this.minVariantPrice = minVariantPrice;
            return this;
        }

        public Builder setMaxVariantPrice(MoneyTO maxVariantPrice) {
            this.maxVariantPrice = maxVariantPrice;
            return this;
        }


        public ProductPriceRangeTO build() {
            return new ProductPriceRangeTO(minVariantPrice, maxVariantPrice);
        }

    }
}
