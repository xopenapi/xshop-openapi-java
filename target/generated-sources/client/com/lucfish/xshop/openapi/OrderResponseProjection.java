package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderResponseProjection extends GraphQLResponseProjection {

    public OrderResponseProjection() {
    }

    @Override
    public OrderResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.DiscountApplicationConnectionResponseProjection.discountApplications", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.DiscountApplicationConnectionResponseProjection.discountApplications", projectionDepthOnFields.getOrDefault("OrderResponseProjection.DiscountApplicationConnectionResponseProjection.discountApplications", 0) + 1);
            this.discountApplications(new DiscountApplicationConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.DiscountApplicationConnectionResponseProjection.discountApplications", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.EventConnectionResponseProjection.events", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.EventConnectionResponseProjection.events", projectionDepthOnFields.getOrDefault("OrderResponseProjection.EventConnectionResponseProjection.events", 0) + 1);
            this.events(new EventConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.EventConnectionResponseProjection.events", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MailingAddressResponseProjection.shippingAddress", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MailingAddressResponseProjection.shippingAddress", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MailingAddressResponseProjection.shippingAddress", 0) + 1);
            this.shippingAddress(new MailingAddressResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MailingAddressResponseProjection.shippingAddress", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.ShippingLineResponseProjection.shippingLine", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.ShippingLineResponseProjection.shippingLine", projectionDepthOnFields.getOrDefault("OrderResponseProjection.ShippingLineResponseProjection.shippingLine", 0) + 1);
            this.shippingLine(new ShippingLineResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.ShippingLineResponseProjection.shippingLine", 0)));
        }
        this.subtotalLineItemsQuantity();
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.TagResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.TagResponseProjection.tags", projectionDepthOnFields.getOrDefault("OrderResponseProjection.TagResponseProjection.tags", 0) + 1);
            this.tags(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.TagResponseProjection.tags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.RefundResponseProjection.refunds", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.RefundResponseProjection.refunds", projectionDepthOnFields.getOrDefault("OrderResponseProjection.RefundResponseProjection.refunds", 0) + 1);
            this.refunds(new RefundResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.RefundResponseProjection.refunds", 0)));
        }
        this.totalWeight();
        this.refundable();
        this.processedAt();
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MetafieldConnectionResponseProjection.metafields", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) + 1);
            this.metafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldConnectionResponseProjection.metafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldResponseProjection.metafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MetafieldResponseProjection.metafield", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldResponseProjection.metafield", 0) + 1);
            this.metafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldResponseProjection.metafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) + 1);
            this.privateMetafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldResponseProjection.privateMetafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MetafieldResponseProjection.privateMetafield", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldResponseProjection.privateMetafield", 0) + 1);
            this.privateMetafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MetafieldResponseProjection.privateMetafield", 0)));
        }
        this.fullyPaid();
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.LineItemConnectionResponseProjection.lineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.LineItemConnectionResponseProjection.lineItems", projectionDepthOnFields.getOrDefault("OrderResponseProjection.LineItemConnectionResponseProjection.lineItems", 0) + 1);
            this.lineItems(new LineItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.LineItemConnectionResponseProjection.lineItems", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.FulfillmentResponseProjection.fulfillments", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.FulfillmentResponseProjection.fulfillments", projectionDepthOnFields.getOrDefault("OrderResponseProjection.FulfillmentResponseProjection.fulfillments", 0) + 1);
            this.fulfillments(new FulfillmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.FulfillmentResponseProjection.fulfillments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.OrderRiskResponseProjection.risks", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.OrderRiskResponseProjection.risks", projectionDepthOnFields.getOrDefault("OrderResponseProjection.OrderRiskResponseProjection.risks", 0) + 1);
            this.risks(new OrderRiskResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.OrderRiskResponseProjection.risks", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalCapturableSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalCapturableSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalCapturableSet", 0) + 1);
            this.totalCapturableSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalCapturableSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalDiscountsSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalDiscountsSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalDiscountsSet", 0) + 1);
            this.totalDiscountsSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalDiscountsSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalOutstandingSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalOutstandingSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalOutstandingSet", 0) + 1);
            this.totalOutstandingSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalOutstandingSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalPriceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalPriceSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalPriceSet", 0) + 1);
            this.totalPriceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalPriceSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalReceivedSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalReceivedSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalReceivedSet", 0) + 1);
            this.totalReceivedSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalReceivedSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedSet", 0) + 1);
            this.totalRefundedSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedShippingSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedShippingSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedShippingSet", 0) + 1);
            this.totalRefundedShippingSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalRefundedShippingSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalShippingPriceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalShippingPriceSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalShippingPriceSet", 0) + 1);
            this.totalShippingPriceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalShippingPriceSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalTaxSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalTaxSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalTaxSet", 0) + 1);
            this.totalTaxSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalTaxSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalTipReceivedSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.totalTipReceivedSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalTipReceivedSet", 0) + 1);
            this.totalTipReceivedSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.totalTipReceivedSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.subtotalPriceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.MoneyBagResponseProjection.subtotalPriceSet", projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.subtotalPriceSet", 0) + 1);
            this.subtotalPriceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.MoneyBagResponseProjection.subtotalPriceSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.OrderTransactionResponseProjection.transactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.OrderTransactionResponseProjection.transactions", projectionDepthOnFields.getOrDefault("OrderResponseProjection.OrderTransactionResponseProjection.transactions", 0) + 1);
            this.transactions(new OrderTransactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.OrderTransactionResponseProjection.transactions", 0)));
        }
        this.unpaid();
        this.updatedAt();
        this.taxesIncluded();
        if (projectionDepthOnFields.getOrDefault("OrderResponseProjection.TaxLineResponseProjection.taxLines", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderResponseProjection.TaxLineResponseProjection.taxLines", projectionDepthOnFields.getOrDefault("OrderResponseProjection.TaxLineResponseProjection.taxLines", 0) + 1);
            this.taxLines(new TaxLineResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderResponseProjection.TaxLineResponseProjection.taxLines", 0)));
        }
        this.typename();
        return this;
    }

    public OrderResponseProjection id() {
        return id(null);
    }

    public OrderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrderResponseProjection discountApplications(DiscountApplicationConnectionResponseProjection subProjection) {
        return discountApplications((String)null, subProjection);
    }

    public OrderResponseProjection discountApplications(String alias, DiscountApplicationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("discountApplications").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection discountApplications(OrderDiscountApplicationsParametrizedInput input, DiscountApplicationConnectionResponseProjection subProjection) {
        return discountApplications(null, input, subProjection);
    }

    public OrderResponseProjection discountApplications(String alias, OrderDiscountApplicationsParametrizedInput input, DiscountApplicationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("discountApplications").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection events(EventConnectionResponseProjection subProjection) {
        return events((String)null, subProjection);
    }

    public OrderResponseProjection events(String alias, EventConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("events").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection events(OrderEventsParametrizedInput input, EventConnectionResponseProjection subProjection) {
        return events(null, input, subProjection);
    }

    public OrderResponseProjection events(String alias, OrderEventsParametrizedInput input, EventConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("events").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection shippingAddress(MailingAddressResponseProjection subProjection) {
        return shippingAddress(null, subProjection);
    }

    public OrderResponseProjection shippingAddress(String alias, MailingAddressResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("shippingAddress").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection shippingLine(ShippingLineResponseProjection subProjection) {
        return shippingLine(null, subProjection);
    }

    public OrderResponseProjection shippingLine(String alias, ShippingLineResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("shippingLine").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection subtotalLineItemsQuantity() {
        return subtotalLineItemsQuantity(null);
    }

    public OrderResponseProjection subtotalLineItemsQuantity(String alias) {
        fields.add(new GraphQLResponseField("subtotalLineItemsQuantity").alias(alias));
        return this;
    }

    public OrderResponseProjection tags(TagResponseProjection subProjection) {
        return tags(null, subProjection);
    }

    public OrderResponseProjection tags(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection refunds(RefundResponseProjection subProjection) {
        return refunds((String)null, subProjection);
    }

    public OrderResponseProjection refunds(String alias, RefundResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refunds").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection refunds(OrderRefundsParametrizedInput input, RefundResponseProjection subProjection) {
        return refunds(null, input, subProjection);
    }

    public OrderResponseProjection refunds(String alias, OrderRefundsParametrizedInput input, RefundResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refunds").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalWeight() {
        return totalWeight(null);
    }

    public OrderResponseProjection totalWeight(String alias) {
        fields.add(new GraphQLResponseField("totalWeight").alias(alias));
        return this;
    }

    public OrderResponseProjection refundable() {
        return refundable(null);
    }

    public OrderResponseProjection refundable(String alias) {
        fields.add(new GraphQLResponseField("refundable").alias(alias));
        return this;
    }

    public OrderResponseProjection processedAt() {
        return processedAt(null);
    }

    public OrderResponseProjection processedAt(String alias) {
        fields.add(new GraphQLResponseField("processedAt").alias(alias));
        return this;
    }

    public OrderResponseProjection metafields(MetafieldConnectionResponseProjection subProjection) {
        return metafields((String)null, subProjection);
    }

    public OrderResponseProjection metafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection metafields(OrderMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return metafields(null, input, subProjection);
    }

    public OrderResponseProjection metafields(String alias, OrderMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection metafield(MetafieldResponseProjection subProjection) {
        return metafield((String)null, subProjection);
    }

    public OrderResponseProjection metafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection metafield(OrderMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return metafield(null, input, subProjection);
    }

    public OrderResponseProjection metafield(String alias, OrderMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection privateMetafields(MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields((String)null, subProjection);
    }

    public OrderResponseProjection privateMetafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection privateMetafields(OrderPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields(null, input, subProjection);
    }

    public OrderResponseProjection privateMetafields(String alias, OrderPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection privateMetafield(MetafieldResponseProjection subProjection) {
        return privateMetafield((String)null, subProjection);
    }

    public OrderResponseProjection privateMetafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection privateMetafield(OrderPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return privateMetafield(null, input, subProjection);
    }

    public OrderResponseProjection privateMetafield(String alias, OrderPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection fullyPaid() {
        return fullyPaid(null);
    }

    public OrderResponseProjection fullyPaid(String alias) {
        fields.add(new GraphQLResponseField("fullyPaid").alias(alias));
        return this;
    }

    public OrderResponseProjection lineItems(LineItemConnectionResponseProjection subProjection) {
        return lineItems((String)null, subProjection);
    }

    public OrderResponseProjection lineItems(String alias, LineItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lineItems").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection lineItems(OrderLineItemsParametrizedInput input, LineItemConnectionResponseProjection subProjection) {
        return lineItems(null, input, subProjection);
    }

    public OrderResponseProjection lineItems(String alias, OrderLineItemsParametrizedInput input, LineItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lineItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection fulfillments(FulfillmentResponseProjection subProjection) {
        return fulfillments((String)null, subProjection);
    }

    public OrderResponseProjection fulfillments(String alias, FulfillmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fulfillments").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection fulfillments(OrderFulfillmentsParametrizedInput input, FulfillmentResponseProjection subProjection) {
        return fulfillments(null, input, subProjection);
    }

    public OrderResponseProjection fulfillments(String alias, OrderFulfillmentsParametrizedInput input, FulfillmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fulfillments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection risks(OrderRiskResponseProjection subProjection) {
        return risks((String)null, subProjection);
    }

    public OrderResponseProjection risks(String alias, OrderRiskResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("risks").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection risks(OrderRisksParametrizedInput input, OrderRiskResponseProjection subProjection) {
        return risks(null, input, subProjection);
    }

    public OrderResponseProjection risks(String alias, OrderRisksParametrizedInput input, OrderRiskResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("risks").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalCapturableSet(MoneyBagResponseProjection subProjection) {
        return totalCapturableSet(null, subProjection);
    }

    public OrderResponseProjection totalCapturableSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalCapturableSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalDiscountsSet(MoneyBagResponseProjection subProjection) {
        return totalDiscountsSet(null, subProjection);
    }

    public OrderResponseProjection totalDiscountsSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalDiscountsSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalOutstandingSet(MoneyBagResponseProjection subProjection) {
        return totalOutstandingSet(null, subProjection);
    }

    public OrderResponseProjection totalOutstandingSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalOutstandingSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalPriceSet(MoneyBagResponseProjection subProjection) {
        return totalPriceSet(null, subProjection);
    }

    public OrderResponseProjection totalPriceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalPriceSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalReceivedSet(MoneyBagResponseProjection subProjection) {
        return totalReceivedSet(null, subProjection);
    }

    public OrderResponseProjection totalReceivedSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalReceivedSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalRefundedSet(MoneyBagResponseProjection subProjection) {
        return totalRefundedSet(null, subProjection);
    }

    public OrderResponseProjection totalRefundedSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalRefundedSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalRefundedShippingSet(MoneyBagResponseProjection subProjection) {
        return totalRefundedShippingSet(null, subProjection);
    }

    public OrderResponseProjection totalRefundedShippingSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalRefundedShippingSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalShippingPriceSet(MoneyBagResponseProjection subProjection) {
        return totalShippingPriceSet(null, subProjection);
    }

    public OrderResponseProjection totalShippingPriceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalShippingPriceSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalTaxSet(MoneyBagResponseProjection subProjection) {
        return totalTaxSet(null, subProjection);
    }

    public OrderResponseProjection totalTaxSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalTaxSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection totalTipReceivedSet(MoneyBagResponseProjection subProjection) {
        return totalTipReceivedSet(null, subProjection);
    }

    public OrderResponseProjection totalTipReceivedSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalTipReceivedSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection subtotalPriceSet(MoneyBagResponseProjection subProjection) {
        return subtotalPriceSet(null, subProjection);
    }

    public OrderResponseProjection subtotalPriceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subtotalPriceSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection transactions(OrderTransactionResponseProjection subProjection) {
        return transactions((String)null, subProjection);
    }

    public OrderResponseProjection transactions(String alias, OrderTransactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("transactions").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection transactions(OrderTransactionsParametrizedInput input, OrderTransactionResponseProjection subProjection) {
        return transactions(null, input, subProjection);
    }

    public OrderResponseProjection transactions(String alias, OrderTransactionsParametrizedInput input, OrderTransactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("transactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderResponseProjection unpaid() {
        return unpaid(null);
    }

    public OrderResponseProjection unpaid(String alias) {
        fields.add(new GraphQLResponseField("unpaid").alias(alias));
        return this;
    }

    public OrderResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public OrderResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public OrderResponseProjection taxesIncluded() {
        return taxesIncluded(null);
    }

    public OrderResponseProjection taxesIncluded(String alias) {
        fields.add(new GraphQLResponseField("taxesIncluded").alias(alias));
        return this;
    }

    public OrderResponseProjection taxLines(TaxLineResponseProjection subProjection) {
        return taxLines(null, subProjection);
    }

    public OrderResponseProjection taxLines(String alias, TaxLineResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("taxLines").alias(alias).projection(subProjection));
        return this;
    }

    public OrderResponseProjection typename() {
        return typename(null);
    }

    public OrderResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
