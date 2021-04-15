package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderTO implements java.io.Serializable, NodeTO, HasMetafieldsTO, HasEventsTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private DiscountApplicationConnectionTO discountApplications;
    @javax.validation.constraints.NotNull
    private EventConnectionTO events;
    private MailingAddressTO shippingAddress;
    private ShippingLineTO shippingLine;
    private int subtotalLineItemsQuantity;
    @javax.validation.constraints.NotNull
    private java.util.List<TagTO> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<RefundTO> refunds;
    private String totalWeight;
    private boolean refundable;
    @javax.validation.constraints.NotNull
    private java.util.Date processedAt;
    @javax.validation.constraints.NotNull
    private MetafieldConnectionTO metafields;
    private MetafieldTO metafield;
    @javax.validation.constraints.NotNull
    private MetafieldConnectionTO privateMetafields;
    private MetafieldTO privateMetafield;
    private boolean fullyPaid;
    @javax.validation.constraints.NotNull
    private LineItemConnectionTO lineItems;
    @javax.validation.constraints.NotNull
    private java.util.List<FulfillmentTO> fulfillments;
    @javax.validation.constraints.NotNull
    private java.util.List<OrderRiskTO> risks;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalCapturableSet;
    private MoneyBagTO totalDiscountsSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalOutstandingSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalPriceSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalReceivedSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalRefundedSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalRefundedShippingSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalShippingPriceSet;
    private MoneyBagTO totalTaxSet;
    @javax.validation.constraints.NotNull
    private MoneyBagTO totalTipReceivedSet;
    private MoneyBagTO subtotalPriceSet;
    @javax.validation.constraints.NotNull
    private java.util.List<OrderTransactionTO> transactions;
    private boolean unpaid;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    private boolean taxesIncluded;
    @javax.validation.constraints.NotNull
    private java.util.List<TaxLineTO> taxLines;

    public OrderTO() {
    }

    public OrderTO(String id, DiscountApplicationConnectionTO discountApplications, EventConnectionTO events, MailingAddressTO shippingAddress, ShippingLineTO shippingLine, int subtotalLineItemsQuantity, java.util.List<TagTO> tags, java.util.List<RefundTO> refunds, String totalWeight, boolean refundable, java.util.Date processedAt, MetafieldConnectionTO metafields, MetafieldTO metafield, MetafieldConnectionTO privateMetafields, MetafieldTO privateMetafield, boolean fullyPaid, LineItemConnectionTO lineItems, java.util.List<FulfillmentTO> fulfillments, java.util.List<OrderRiskTO> risks, MoneyBagTO totalCapturableSet, MoneyBagTO totalDiscountsSet, MoneyBagTO totalOutstandingSet, MoneyBagTO totalPriceSet, MoneyBagTO totalReceivedSet, MoneyBagTO totalRefundedSet, MoneyBagTO totalRefundedShippingSet, MoneyBagTO totalShippingPriceSet, MoneyBagTO totalTaxSet, MoneyBagTO totalTipReceivedSet, MoneyBagTO subtotalPriceSet, java.util.List<OrderTransactionTO> transactions, boolean unpaid, java.util.Date updatedAt, boolean taxesIncluded, java.util.List<TaxLineTO> taxLines) {
        this.id = id;
        this.discountApplications = discountApplications;
        this.events = events;
        this.shippingAddress = shippingAddress;
        this.shippingLine = shippingLine;
        this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
        this.tags = tags;
        this.refunds = refunds;
        this.totalWeight = totalWeight;
        this.refundable = refundable;
        this.processedAt = processedAt;
        this.metafields = metafields;
        this.metafield = metafield;
        this.privateMetafields = privateMetafields;
        this.privateMetafield = privateMetafield;
        this.fullyPaid = fullyPaid;
        this.lineItems = lineItems;
        this.fulfillments = fulfillments;
        this.risks = risks;
        this.totalCapturableSet = totalCapturableSet;
        this.totalDiscountsSet = totalDiscountsSet;
        this.totalOutstandingSet = totalOutstandingSet;
        this.totalPriceSet = totalPriceSet;
        this.totalReceivedSet = totalReceivedSet;
        this.totalRefundedSet = totalRefundedSet;
        this.totalRefundedShippingSet = totalRefundedShippingSet;
        this.totalShippingPriceSet = totalShippingPriceSet;
        this.totalTaxSet = totalTaxSet;
        this.totalTipReceivedSet = totalTipReceivedSet;
        this.subtotalPriceSet = subtotalPriceSet;
        this.transactions = transactions;
        this.unpaid = unpaid;
        this.updatedAt = updatedAt;
        this.taxesIncluded = taxesIncluded;
        this.taxLines = taxLines;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public DiscountApplicationConnectionTO getDiscountApplications() {
        return discountApplications;
    }
    public void setDiscountApplications(DiscountApplicationConnectionTO discountApplications) {
        this.discountApplications = discountApplications;
    }

    public EventConnectionTO getEvents() {
        return events;
    }
    public void setEvents(EventConnectionTO events) {
        this.events = events;
    }

    public MailingAddressTO getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(MailingAddressTO shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShippingLineTO getShippingLine() {
        return shippingLine;
    }
    public void setShippingLine(ShippingLineTO shippingLine) {
        this.shippingLine = shippingLine;
    }

    public int getSubtotalLineItemsQuantity() {
        return subtotalLineItemsQuantity;
    }
    public void setSubtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
        this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
    }

    public java.util.List<TagTO> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagTO> tags) {
        this.tags = tags;
    }

    public java.util.List<RefundTO> getRefunds() {
        return refunds;
    }
    public void setRefunds(java.util.List<RefundTO> refunds) {
        this.refunds = refunds;
    }

    public String getTotalWeight() {
        return totalWeight;
    }
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public boolean getRefundable() {
        return refundable;
    }
    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public java.util.Date getProcessedAt() {
        return processedAt;
    }
    public void setProcessedAt(java.util.Date processedAt) {
        this.processedAt = processedAt;
    }

    public MetafieldConnectionTO getMetafields() {
        return metafields;
    }
    public void setMetafields(MetafieldConnectionTO metafields) {
        this.metafields = metafields;
    }

    public MetafieldTO getMetafield() {
        return metafield;
    }
    public void setMetafield(MetafieldTO metafield) {
        this.metafield = metafield;
    }

    public MetafieldConnectionTO getPrivateMetafields() {
        return privateMetafields;
    }
    public void setPrivateMetafields(MetafieldConnectionTO privateMetafields) {
        this.privateMetafields = privateMetafields;
    }

    public MetafieldTO getPrivateMetafield() {
        return privateMetafield;
    }
    public void setPrivateMetafield(MetafieldTO privateMetafield) {
        this.privateMetafield = privateMetafield;
    }

    public boolean getFullyPaid() {
        return fullyPaid;
    }
    public void setFullyPaid(boolean fullyPaid) {
        this.fullyPaid = fullyPaid;
    }

    public LineItemConnectionTO getLineItems() {
        return lineItems;
    }
    public void setLineItems(LineItemConnectionTO lineItems) {
        this.lineItems = lineItems;
    }

    public java.util.List<FulfillmentTO> getFulfillments() {
        return fulfillments;
    }
    public void setFulfillments(java.util.List<FulfillmentTO> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public java.util.List<OrderRiskTO> getRisks() {
        return risks;
    }
    public void setRisks(java.util.List<OrderRiskTO> risks) {
        this.risks = risks;
    }

    public MoneyBagTO getTotalCapturableSet() {
        return totalCapturableSet;
    }
    public void setTotalCapturableSet(MoneyBagTO totalCapturableSet) {
        this.totalCapturableSet = totalCapturableSet;
    }

    /**
     * Amount authorized for the order, that is uncaptured or undercaptured in shop and presentment currencies.
     */
    public MoneyBagTO getTotalDiscountsSet() {
        return totalDiscountsSet;
    }
    /**
     * Amount authorized for the order, that is uncaptured or undercaptured in shop and presentment currencies.
     */
    public void setTotalDiscountsSet(MoneyBagTO totalDiscountsSet) {
        this.totalDiscountsSet = totalDiscountsSet;
    }

    /**
     * 订单总共折扣金额 (包含订单级别和 item级别折扣)
     */
    public MoneyBagTO getTotalOutstandingSet() {
        return totalOutstandingSet;
    }
    /**
     * 订单总共折扣金额 (包含订单级别和 item级别折扣)
     */
    public void setTotalOutstandingSet(MoneyBagTO totalOutstandingSet) {
        this.totalOutstandingSet = totalOutstandingSet;
    }

    /**
     * 尚未授权订单的总金额
     */
    public MoneyBagTO getTotalPriceSet() {
        return totalPriceSet;
    }
    /**
     * 尚未授权订单的总金额
     */
    public void setTotalPriceSet(MoneyBagTO totalPriceSet) {
        this.totalPriceSet = totalPriceSet;
    }

    /**
     * 订单总额（包括税金和折扣）以商店货币和现钞货币表示
     */
    public MoneyBagTO getTotalReceivedSet() {
        return totalReceivedSet;
    }
    /**
     * 订单总额（包括税金和折扣）以商店货币和现钞货币表示
     */
    public void setTotalReceivedSet(MoneyBagTO totalReceivedSet) {
        this.totalReceivedSet = totalReceivedSet;
    }

    /**
     * Total amount received by the customer for the order in shop and presentment currencies.
     */
    public MoneyBagTO getTotalRefundedSet() {
        return totalRefundedSet;
    }
    /**
     * Total amount received by the customer for the order in shop and presentment currencies.
     */
    public void setTotalRefundedSet(MoneyBagTO totalRefundedSet) {
        this.totalRefundedSet = totalRefundedSet;
    }

    /**
     * Total amount refunded for the order in shop and presentment currencies.
     */
    public MoneyBagTO getTotalRefundedShippingSet() {
        return totalRefundedShippingSet;
    }
    /**
     * Total amount refunded for the order in shop and presentment currencies.
     */
    public void setTotalRefundedShippingSet(MoneyBagTO totalRefundedShippingSet) {
        this.totalRefundedShippingSet = totalRefundedShippingSet;
    }

    /**
     * Total amount refunded for shipping in shop and presentment currencies.
     */
    public MoneyBagTO getTotalShippingPriceSet() {
        return totalShippingPriceSet;
    }
    /**
     * Total amount refunded for shipping in shop and presentment currencies.
     */
    public void setTotalShippingPriceSet(MoneyBagTO totalShippingPriceSet) {
        this.totalShippingPriceSet = totalShippingPriceSet;
    }

    /**
     * Total amount charged for shipping the order in shop and presentment currencies.
     */
    public MoneyBagTO getTotalTaxSet() {
        return totalTaxSet;
    }
    /**
     * Total amount charged for shipping the order in shop and presentment currencies.
     */
    public void setTotalTaxSet(MoneyBagTO totalTaxSet) {
        this.totalTaxSet = totalTaxSet;
    }

    /**
     * Total of all taxes applied to the order in shop and presentment currencies.
     */
    public MoneyBagTO getTotalTipReceivedSet() {
        return totalTipReceivedSet;
    }
    /**
     * Total of all taxes applied to the order in shop and presentment currencies.
     */
    public void setTotalTipReceivedSet(MoneyBagTO totalTipReceivedSet) {
        this.totalTipReceivedSet = totalTipReceivedSet;
    }

    /**
     * Total tip received for the order in shop and presentment currencies.
     */
    public MoneyBagTO getSubtotalPriceSet() {
        return subtotalPriceSet;
    }
    /**
     * Total tip received for the order in shop and presentment currencies.
     */
    public void setSubtotalPriceSet(MoneyBagTO subtotalPriceSet) {
        this.subtotalPriceSet = subtotalPriceSet;
    }

    /**
     * Subtotal of the line items and their discounts (does not contain shipping costs and shipping discounts) in shop and presentment currencies.
     */
    public java.util.List<OrderTransactionTO> getTransactions() {
        return transactions;
    }
    /**
     * Subtotal of the line items and their discounts (does not contain shipping costs and shipping discounts) in shop and presentment currencies.
     */
    public void setTransactions(java.util.List<OrderTransactionTO> transactions) {
        this.transactions = transactions;
    }

    public boolean getUnpaid() {
        return unpaid;
    }
    public void setUnpaid(boolean unpaid) {
        this.unpaid = unpaid;
    }

    /**
     * Whether no payments have been made for the order. If no payments have been made for the order, then this returns true.
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Whether no payments have been made for the order. If no payments have been made for the order, then this returns true.
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean getTaxesIncluded() {
        return taxesIncluded;
    }
    public void setTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    /**
     * Whether taxes are included in the subtotal price of the order.
     */
    public java.util.List<TaxLineTO> getTaxLines() {
        return taxLines;
    }
    /**
     * Whether taxes are included in the subtotal price of the order.
     */
    public void setTaxLines(java.util.List<TaxLineTO> taxLines) {
        this.taxLines = taxLines;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (discountApplications != null) {
            joiner.add("discountApplications: " + GraphQLRequestSerializer.getEntry(discountApplications));
        }
        if (events != null) {
            joiner.add("events: " + GraphQLRequestSerializer.getEntry(events));
        }
        if (shippingAddress != null) {
            joiner.add("shippingAddress: " + GraphQLRequestSerializer.getEntry(shippingAddress));
        }
        if (shippingLine != null) {
            joiner.add("shippingLine: " + GraphQLRequestSerializer.getEntry(shippingLine));
        }
        joiner.add("subtotalLineItemsQuantity: " + GraphQLRequestSerializer.getEntry(subtotalLineItemsQuantity));
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (refunds != null) {
            joiner.add("refunds: " + GraphQLRequestSerializer.getEntry(refunds));
        }
        if (totalWeight != null) {
            joiner.add("totalWeight: " + GraphQLRequestSerializer.getEntry(totalWeight));
        }
        joiner.add("refundable: " + GraphQLRequestSerializer.getEntry(refundable));
        if (processedAt != null) {
            joiner.add("processedAt: " + GraphQLRequestSerializer.getEntry(processedAt));
        }
        if (metafields != null) {
            joiner.add("metafields: " + GraphQLRequestSerializer.getEntry(metafields));
        }
        if (metafield != null) {
            joiner.add("metafield: " + GraphQLRequestSerializer.getEntry(metafield));
        }
        if (privateMetafields != null) {
            joiner.add("privateMetafields: " + GraphQLRequestSerializer.getEntry(privateMetafields));
        }
        if (privateMetafield != null) {
            joiner.add("privateMetafield: " + GraphQLRequestSerializer.getEntry(privateMetafield));
        }
        joiner.add("fullyPaid: " + GraphQLRequestSerializer.getEntry(fullyPaid));
        if (lineItems != null) {
            joiner.add("lineItems: " + GraphQLRequestSerializer.getEntry(lineItems));
        }
        if (fulfillments != null) {
            joiner.add("fulfillments: " + GraphQLRequestSerializer.getEntry(fulfillments));
        }
        if (risks != null) {
            joiner.add("risks: " + GraphQLRequestSerializer.getEntry(risks));
        }
        if (totalCapturableSet != null) {
            joiner.add("totalCapturableSet: " + GraphQLRequestSerializer.getEntry(totalCapturableSet));
        }
        if (totalDiscountsSet != null) {
            joiner.add("totalDiscountsSet: " + GraphQLRequestSerializer.getEntry(totalDiscountsSet));
        }
        if (totalOutstandingSet != null) {
            joiner.add("totalOutstandingSet: " + GraphQLRequestSerializer.getEntry(totalOutstandingSet));
        }
        if (totalPriceSet != null) {
            joiner.add("totalPriceSet: " + GraphQLRequestSerializer.getEntry(totalPriceSet));
        }
        if (totalReceivedSet != null) {
            joiner.add("totalReceivedSet: " + GraphQLRequestSerializer.getEntry(totalReceivedSet));
        }
        if (totalRefundedSet != null) {
            joiner.add("totalRefundedSet: " + GraphQLRequestSerializer.getEntry(totalRefundedSet));
        }
        if (totalRefundedShippingSet != null) {
            joiner.add("totalRefundedShippingSet: " + GraphQLRequestSerializer.getEntry(totalRefundedShippingSet));
        }
        if (totalShippingPriceSet != null) {
            joiner.add("totalShippingPriceSet: " + GraphQLRequestSerializer.getEntry(totalShippingPriceSet));
        }
        if (totalTaxSet != null) {
            joiner.add("totalTaxSet: " + GraphQLRequestSerializer.getEntry(totalTaxSet));
        }
        if (totalTipReceivedSet != null) {
            joiner.add("totalTipReceivedSet: " + GraphQLRequestSerializer.getEntry(totalTipReceivedSet));
        }
        if (subtotalPriceSet != null) {
            joiner.add("subtotalPriceSet: " + GraphQLRequestSerializer.getEntry(subtotalPriceSet));
        }
        if (transactions != null) {
            joiner.add("transactions: " + GraphQLRequestSerializer.getEntry(transactions));
        }
        joiner.add("unpaid: " + GraphQLRequestSerializer.getEntry(unpaid));
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        joiner.add("taxesIncluded: " + GraphQLRequestSerializer.getEntry(taxesIncluded));
        if (taxLines != null) {
            joiner.add("taxLines: " + GraphQLRequestSerializer.getEntry(taxLines));
        }
        return joiner.toString();
    }

    public static OrderTO.Builder builder() {
        return new OrderTO.Builder();
    }

    public static class Builder {

        private String id;
        private DiscountApplicationConnectionTO discountApplications;
        private EventConnectionTO events;
        private MailingAddressTO shippingAddress;
        private ShippingLineTO shippingLine;
        private int subtotalLineItemsQuantity;
        private java.util.List<TagTO> tags;
        private java.util.List<RefundTO> refunds;
        private String totalWeight;
        private boolean refundable;
        private java.util.Date processedAt;
        private MetafieldConnectionTO metafields;
        private MetafieldTO metafield;
        private MetafieldConnectionTO privateMetafields;
        private MetafieldTO privateMetafield;
        private boolean fullyPaid;
        private LineItemConnectionTO lineItems;
        private java.util.List<FulfillmentTO> fulfillments;
        private java.util.List<OrderRiskTO> risks;
        private MoneyBagTO totalCapturableSet;
        private MoneyBagTO totalDiscountsSet;
        private MoneyBagTO totalOutstandingSet;
        private MoneyBagTO totalPriceSet;
        private MoneyBagTO totalReceivedSet;
        private MoneyBagTO totalRefundedSet;
        private MoneyBagTO totalRefundedShippingSet;
        private MoneyBagTO totalShippingPriceSet;
        private MoneyBagTO totalTaxSet;
        private MoneyBagTO totalTipReceivedSet;
        private MoneyBagTO subtotalPriceSet;
        private java.util.List<OrderTransactionTO> transactions;
        private boolean unpaid;
        private java.util.Date updatedAt;
        private boolean taxesIncluded;
        private java.util.List<TaxLineTO> taxLines;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDiscountApplications(DiscountApplicationConnectionTO discountApplications) {
            this.discountApplications = discountApplications;
            return this;
        }

        public Builder setEvents(EventConnectionTO events) {
            this.events = events;
            return this;
        }

        public Builder setShippingAddress(MailingAddressTO shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setShippingLine(ShippingLineTO shippingLine) {
            this.shippingLine = shippingLine;
            return this;
        }

        public Builder setSubtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
            this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
            return this;
        }

        public Builder setTags(java.util.List<TagTO> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setRefunds(java.util.List<RefundTO> refunds) {
            this.refunds = refunds;
            return this;
        }

        public Builder setTotalWeight(String totalWeight) {
            this.totalWeight = totalWeight;
            return this;
        }

        public Builder setRefundable(boolean refundable) {
            this.refundable = refundable;
            return this;
        }

        public Builder setProcessedAt(java.util.Date processedAt) {
            this.processedAt = processedAt;
            return this;
        }

        public Builder setMetafields(MetafieldConnectionTO metafields) {
            this.metafields = metafields;
            return this;
        }

        public Builder setMetafield(MetafieldTO metafield) {
            this.metafield = metafield;
            return this;
        }

        public Builder setPrivateMetafields(MetafieldConnectionTO privateMetafields) {
            this.privateMetafields = privateMetafields;
            return this;
        }

        public Builder setPrivateMetafield(MetafieldTO privateMetafield) {
            this.privateMetafield = privateMetafield;
            return this;
        }

        public Builder setFullyPaid(boolean fullyPaid) {
            this.fullyPaid = fullyPaid;
            return this;
        }

        public Builder setLineItems(LineItemConnectionTO lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder setFulfillments(java.util.List<FulfillmentTO> fulfillments) {
            this.fulfillments = fulfillments;
            return this;
        }

        public Builder setRisks(java.util.List<OrderRiskTO> risks) {
            this.risks = risks;
            return this;
        }

        public Builder setTotalCapturableSet(MoneyBagTO totalCapturableSet) {
            this.totalCapturableSet = totalCapturableSet;
            return this;
        }

        /**
         * Amount authorized for the order, that is uncaptured or undercaptured in shop and presentment currencies.
         */
        public Builder setTotalDiscountsSet(MoneyBagTO totalDiscountsSet) {
            this.totalDiscountsSet = totalDiscountsSet;
            return this;
        }

        /**
         * 订单总共折扣金额 (包含订单级别和 item级别折扣)
         */
        public Builder setTotalOutstandingSet(MoneyBagTO totalOutstandingSet) {
            this.totalOutstandingSet = totalOutstandingSet;
            return this;
        }

        /**
         * 尚未授权订单的总金额
         */
        public Builder setTotalPriceSet(MoneyBagTO totalPriceSet) {
            this.totalPriceSet = totalPriceSet;
            return this;
        }

        /**
         * 订单总额（包括税金和折扣）以商店货币和现钞货币表示
         */
        public Builder setTotalReceivedSet(MoneyBagTO totalReceivedSet) {
            this.totalReceivedSet = totalReceivedSet;
            return this;
        }

        /**
         * Total amount received by the customer for the order in shop and presentment currencies.
         */
        public Builder setTotalRefundedSet(MoneyBagTO totalRefundedSet) {
            this.totalRefundedSet = totalRefundedSet;
            return this;
        }

        /**
         * Total amount refunded for the order in shop and presentment currencies.
         */
        public Builder setTotalRefundedShippingSet(MoneyBagTO totalRefundedShippingSet) {
            this.totalRefundedShippingSet = totalRefundedShippingSet;
            return this;
        }

        /**
         * Total amount refunded for shipping in shop and presentment currencies.
         */
        public Builder setTotalShippingPriceSet(MoneyBagTO totalShippingPriceSet) {
            this.totalShippingPriceSet = totalShippingPriceSet;
            return this;
        }

        /**
         * Total amount charged for shipping the order in shop and presentment currencies.
         */
        public Builder setTotalTaxSet(MoneyBagTO totalTaxSet) {
            this.totalTaxSet = totalTaxSet;
            return this;
        }

        /**
         * Total of all taxes applied to the order in shop and presentment currencies.
         */
        public Builder setTotalTipReceivedSet(MoneyBagTO totalTipReceivedSet) {
            this.totalTipReceivedSet = totalTipReceivedSet;
            return this;
        }

        /**
         * Total tip received for the order in shop and presentment currencies.
         */
        public Builder setSubtotalPriceSet(MoneyBagTO subtotalPriceSet) {
            this.subtotalPriceSet = subtotalPriceSet;
            return this;
        }

        /**
         * Subtotal of the line items and their discounts (does not contain shipping costs and shipping discounts) in shop and presentment currencies.
         */
        public Builder setTransactions(java.util.List<OrderTransactionTO> transactions) {
            this.transactions = transactions;
            return this;
        }

        public Builder setUnpaid(boolean unpaid) {
            this.unpaid = unpaid;
            return this;
        }

        /**
         * Whether no payments have been made for the order. If no payments have been made for the order, then this returns true.
         */
        public Builder setUpdatedAt(java.util.Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setTaxesIncluded(boolean taxesIncluded) {
            this.taxesIncluded = taxesIncluded;
            return this;
        }

        /**
         * Whether taxes are included in the subtotal price of the order.
         */
        public Builder setTaxLines(java.util.List<TaxLineTO> taxLines) {
            this.taxLines = taxLines;
            return this;
        }


        public OrderTO build() {
            return new OrderTO(id, discountApplications, events, shippingAddress, shippingLine, subtotalLineItemsQuantity, tags, refunds, totalWeight, refundable, processedAt, metafields, metafield, privateMetafields, privateMetafield, fullyPaid, lineItems, fulfillments, risks, totalCapturableSet, totalDiscountsSet, totalOutstandingSet, totalPriceSet, totalReceivedSet, totalRefundedSet, totalRefundedShippingSet, totalShippingPriceSet, totalTaxSet, totalTipReceivedSet, subtotalPriceSet, transactions, unpaid, updatedAt, taxesIncluded, taxLines);
        }

    }
}
