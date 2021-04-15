package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ShippingLine
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ShippingLineResponseProjection extends GraphQLResponseProjection {

    public ShippingLineResponseProjection() {
    }

    @Override
    public ShippingLineResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ShippingLineResponseProjection all$(int maxDepth) {
        this.carrierIdentifier();
        this.code();
        this.custom();
        this.deliveryCategory();
        if (projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.DiscountAllocationResponseProjection.discountAllocations", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShippingLineResponseProjection.DiscountAllocationResponseProjection.discountAllocations", projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.DiscountAllocationResponseProjection.discountAllocations", 0) + 1);
            this.discountAllocations(new DiscountAllocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.DiscountAllocationResponseProjection.discountAllocations", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.MoneyBagResponseProjection.discountedPriceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShippingLineResponseProjection.MoneyBagResponseProjection.discountedPriceSet", projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.MoneyBagResponseProjection.discountedPriceSet", 0) + 1);
            this.discountedPriceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.MoneyBagResponseProjection.discountedPriceSet", 0)));
        }
        this.id();
        if (projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.MoneyBagResponseProjection.originalPriceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShippingLineResponseProjection.MoneyBagResponseProjection.originalPriceSet", projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.MoneyBagResponseProjection.originalPriceSet", 0) + 1);
            this.originalPriceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.MoneyBagResponseProjection.originalPriceSet", 0)));
        }
        this.phone();
        if (projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.FulfillmentServiceResponseProjection.requestedFulfillmentService", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShippingLineResponseProjection.FulfillmentServiceResponseProjection.requestedFulfillmentService", projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.FulfillmentServiceResponseProjection.requestedFulfillmentService", 0) + 1);
            this.requestedFulfillmentService(new FulfillmentServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.FulfillmentServiceResponseProjection.requestedFulfillmentService", 0)));
        }
        this.shippingRateHandle();
        this.source();
        if (projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.TaxLineResponseProjection.taxLines", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShippingLineResponseProjection.TaxLineResponseProjection.taxLines", projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.TaxLineResponseProjection.taxLines", 0) + 1);
            this.taxLines(new TaxLineResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShippingLineResponseProjection.TaxLineResponseProjection.taxLines", 0)));
        }
        this.title();
        this.typename();
        return this;
    }

    public ShippingLineResponseProjection carrierIdentifier() {
        return carrierIdentifier(null);
    }

    public ShippingLineResponseProjection carrierIdentifier(String alias) {
        fields.add(new GraphQLResponseField("carrierIdentifier").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection code() {
        return code(null);
    }

    public ShippingLineResponseProjection code(String alias) {
        fields.add(new GraphQLResponseField("code").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection custom() {
        return custom(null);
    }

    public ShippingLineResponseProjection custom(String alias) {
        fields.add(new GraphQLResponseField("custom").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection deliveryCategory() {
        return deliveryCategory(null);
    }

    public ShippingLineResponseProjection deliveryCategory(String alias) {
        fields.add(new GraphQLResponseField("deliveryCategory").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection discountAllocations(DiscountAllocationResponseProjection subProjection) {
        return discountAllocations(null, subProjection);
    }

    public ShippingLineResponseProjection discountAllocations(String alias, DiscountAllocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("discountAllocations").alias(alias).projection(subProjection));
        return this;
    }

    public ShippingLineResponseProjection discountedPriceSet(MoneyBagResponseProjection subProjection) {
        return discountedPriceSet(null, subProjection);
    }

    public ShippingLineResponseProjection discountedPriceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("discountedPriceSet").alias(alias).projection(subProjection));
        return this;
    }

    public ShippingLineResponseProjection id() {
        return id(null);
    }

    public ShippingLineResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection originalPriceSet(MoneyBagResponseProjection subProjection) {
        return originalPriceSet(null, subProjection);
    }

    public ShippingLineResponseProjection originalPriceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("originalPriceSet").alias(alias).projection(subProjection));
        return this;
    }

    public ShippingLineResponseProjection phone() {
        return phone(null);
    }

    public ShippingLineResponseProjection phone(String alias) {
        fields.add(new GraphQLResponseField("phone").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection requestedFulfillmentService(FulfillmentServiceResponseProjection subProjection) {
        return requestedFulfillmentService(null, subProjection);
    }

    public ShippingLineResponseProjection requestedFulfillmentService(String alias, FulfillmentServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestedFulfillmentService").alias(alias).projection(subProjection));
        return this;
    }

    public ShippingLineResponseProjection shippingRateHandle() {
        return shippingRateHandle(null);
    }

    public ShippingLineResponseProjection shippingRateHandle(String alias) {
        fields.add(new GraphQLResponseField("shippingRateHandle").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection source() {
        return source(null);
    }

    public ShippingLineResponseProjection source(String alias) {
        fields.add(new GraphQLResponseField("source").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection taxLines(TaxLineResponseProjection subProjection) {
        return taxLines(null, subProjection);
    }

    public ShippingLineResponseProjection taxLines(String alias, TaxLineResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("taxLines").alias(alias).projection(subProjection));
        return this;
    }

    public ShippingLineResponseProjection title() {
        return title(null);
    }

    public ShippingLineResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public ShippingLineResponseProjection typename() {
        return typename(null);
    }

    public ShippingLineResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
