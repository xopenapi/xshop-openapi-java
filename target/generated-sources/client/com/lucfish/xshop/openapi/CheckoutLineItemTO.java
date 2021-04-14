package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CheckoutLineItemTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private int quantity;
    @javax.validation.constraints.NotNull
    private String title;
    private MoneyTO unitPrice;
    private ProductVariantTO variant;

    public CheckoutLineItemTO() {
    }

    public CheckoutLineItemTO(String id, int quantity, String title, MoneyTO unitPrice, ProductVariantTO variant) {
        this.id = id;
        this.quantity = quantity;
        this.title = title;
        this.unitPrice = unitPrice;
        this.variant = variant;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public MoneyTO getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(MoneyTO unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ProductVariantTO getVariant() {
        return variant;
    }
    public void setVariant(ProductVariantTO variant) {
        this.variant = variant;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("quantity: " + GraphQLRequestSerializer.getEntry(quantity));
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (unitPrice != null) {
            joiner.add("unitPrice: " + GraphQLRequestSerializer.getEntry(unitPrice));
        }
        if (variant != null) {
            joiner.add("variant: " + GraphQLRequestSerializer.getEntry(variant));
        }
        return joiner.toString();
    }

    public static CheckoutLineItemTO.Builder builder() {
        return new CheckoutLineItemTO.Builder();
    }

    public static class Builder {

        private String id;
        private int quantity;
        private String title;
        private MoneyTO unitPrice;
        private ProductVariantTO variant;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setUnitPrice(MoneyTO unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setVariant(ProductVariantTO variant) {
            this.variant = variant;
            return this;
        }


        public CheckoutLineItemTO build() {
            return new CheckoutLineItemTO(id, quantity, title, unitPrice, variant);
        }

    }
}
