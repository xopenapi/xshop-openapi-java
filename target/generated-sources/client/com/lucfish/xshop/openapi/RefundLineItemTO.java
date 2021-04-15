package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class RefundLineItemTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private LineItemTO lineItem;
    private LocationTO location;
    @javax.validation.constraints.NotNull
    private MoneyBagTO priceSet;
    private int quantity;
    @javax.validation.constraints.NotNull
    private RefundLineItemRestockTypeTO restockType;
    private boolean restocked;
    @javax.validation.constraints.NotNull
    private MoneyBagTO subtotalSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalTaxSet;

    public RefundLineItemTO() {
    }

    public RefundLineItemTO(LineItemTO lineItem, LocationTO location, MoneyBagTO priceSet, int quantity, RefundLineItemRestockTypeTO restockType, boolean restocked, MoneyBagTO subtotalSet, MoneyBagTO totalTaxSet) {
        this.lineItem = lineItem;
        this.location = location;
        this.priceSet = priceSet;
        this.quantity = quantity;
        this.restockType = restockType;
        this.restocked = restocked;
        this.subtotalSet = subtotalSet;
        this.totalTaxSet = totalTaxSet;
    }

    public LineItemTO getLineItem() {
        return lineItem;
    }
    public void setLineItem(LineItemTO lineItem) {
        this.lineItem = lineItem;
    }

    /**
     * Returns a LineItem resource. This represents the LineItem in the non-refund context.
     */
    public LocationTO getLocation() {
        return location;
    }
    /**
     * Returns a LineItem resource. This represents the LineItem in the non-refund context.
     */
    public void setLocation(LocationTO location) {
        this.location = location;
    }

    /**
     * The inventory restock location.
     */
    public MoneyBagTO getPriceSet() {
        return priceSet;
    }
    /**
     * The inventory restock location.
     */
    public void setPriceSet(MoneyBagTO priceSet) {
        this.priceSet = priceSet;
    }

    /**
     * Returns the price of a refunded line item in shop and presentment currencies.
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Returns the price of a refunded line item in shop and presentment currencies.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Returns the quantity of a refunded line item.
     */
    public RefundLineItemRestockTypeTO getRestockType() {
        return restockType;
    }
    /**
     * Returns the quantity of a refunded line item.
     */
    public void setRestockType(RefundLineItemRestockTypeTO restockType) {
        this.restockType = restockType;
    }

    /**
     * Represents the type of restock for the refunded line item.
     */
    public boolean getRestocked() {
        return restocked;
    }
    /**
     * Represents the type of restock for the refunded line item.
     */
    public void setRestocked(boolean restocked) {
        this.restocked = restocked;
    }

    /**
     * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
     */
    public MoneyBagTO getSubtotalSet() {
        return subtotalSet;
    }
    /**
     * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
     */
    public void setSubtotalSet(MoneyBagTO subtotalSet) {
        this.subtotalSet = subtotalSet;
    }

    /**
     * Returns the subtotal price of a refunded line item in shop and presentment currencies.
     */
    public MoneyBagTO getTotalTaxSet() {
        return totalTaxSet;
    }
    /**
     * Returns the subtotal price of a refunded line item in shop and presentment currencies.
     */
    public void setTotalTaxSet(MoneyBagTO totalTaxSet) {
        this.totalTaxSet = totalTaxSet;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (lineItem != null) {
            joiner.add("lineItem: " + GraphQLRequestSerializer.getEntry(lineItem));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (priceSet != null) {
            joiner.add("priceSet: " + GraphQLRequestSerializer.getEntry(priceSet));
        }
        joiner.add("quantity: " + GraphQLRequestSerializer.getEntry(quantity));
        if (restockType != null) {
            joiner.add("restockType: " + GraphQLRequestSerializer.getEntry(restockType));
        }
        joiner.add("restocked: " + GraphQLRequestSerializer.getEntry(restocked));
        if (subtotalSet != null) {
            joiner.add("subtotalSet: " + GraphQLRequestSerializer.getEntry(subtotalSet));
        }
        if (totalTaxSet != null) {
            joiner.add("totalTaxSet: " + GraphQLRequestSerializer.getEntry(totalTaxSet));
        }
        return joiner.toString();
    }

    public static RefundLineItemTO.Builder builder() {
        return new RefundLineItemTO.Builder();
    }

    public static class Builder {

        private LineItemTO lineItem;
        private LocationTO location;
        private MoneyBagTO priceSet;
        private int quantity;
        private RefundLineItemRestockTypeTO restockType;
        private boolean restocked;
        private MoneyBagTO subtotalSet;
        private MoneyBagTO totalTaxSet;

        public Builder() {
        }

        public Builder setLineItem(LineItemTO lineItem) {
            this.lineItem = lineItem;
            return this;
        }

        /**
         * Returns a LineItem resource. This represents the LineItem in the non-refund context.
         */
        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        /**
         * The inventory restock location.
         */
        public Builder setPriceSet(MoneyBagTO priceSet) {
            this.priceSet = priceSet;
            return this;
        }

        /**
         * Returns the price of a refunded line item in shop and presentment currencies.
         */
        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Returns the quantity of a refunded line item.
         */
        public Builder setRestockType(RefundLineItemRestockTypeTO restockType) {
            this.restockType = restockType;
            return this;
        }

        /**
         * Represents the type of restock for the refunded line item.
         */
        public Builder setRestocked(boolean restocked) {
            this.restocked = restocked;
            return this;
        }

        /**
         * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
         */
        public Builder setSubtotalSet(MoneyBagTO subtotalSet) {
            this.subtotalSet = subtotalSet;
            return this;
        }

        /**
         * Returns the subtotal price of a refunded line item in shop and presentment currencies.
         */
        public Builder setTotalTaxSet(MoneyBagTO totalTaxSet) {
            this.totalTaxSet = totalTaxSet;
            return this;
        }


        public RefundLineItemTO build() {
            return new RefundLineItemTO(lineItem, location, priceSet, quantity, restockType, restocked, subtotalSet, totalTaxSet);
        }

    }
}
