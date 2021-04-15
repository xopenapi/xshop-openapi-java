package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RefundLineItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class RefundLineItemResponseProjection extends GraphQLResponseProjection {

    public RefundLineItemResponseProjection() {
    }

    @Override
    public RefundLineItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefundLineItemResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.LineItemResponseProjection.lineItem", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemResponseProjection.LineItemResponseProjection.lineItem", projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.LineItemResponseProjection.lineItem", 0) + 1);
            this.lineItem(new LineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.LineItemResponseProjection.lineItem", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.LocationResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemResponseProjection.LocationResponseProjection.location", projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.LocationResponseProjection.location", 0) + 1);
            this.location(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.LocationResponseProjection.location", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.priceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemResponseProjection.MoneyBagResponseProjection.priceSet", projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.priceSet", 0) + 1);
            this.priceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.priceSet", 0)));
        }
        this.quantity();
        this.restockType();
        this.restocked();
        if (projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.subtotalSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemResponseProjection.MoneyBagResponseProjection.subtotalSet", projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.subtotalSet", 0) + 1);
            this.subtotalSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.subtotalSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.totalTaxSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemResponseProjection.MoneyBagResponseProjection.totalTaxSet", projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.totalTaxSet", 0) + 1);
            this.totalTaxSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemResponseProjection.MoneyBagResponseProjection.totalTaxSet", 0)));
        }
        this.typename();
        return this;
    }

    public RefundLineItemResponseProjection lineItem(LineItemResponseProjection subProjection) {
        return lineItem(null, subProjection);
    }

    public RefundLineItemResponseProjection lineItem(String alias, LineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lineItem").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public RefundLineItemResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemResponseProjection priceSet(MoneyBagResponseProjection subProjection) {
        return priceSet(null, subProjection);
    }

    public RefundLineItemResponseProjection priceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("priceSet").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemResponseProjection quantity() {
        return quantity(null);
    }

    public RefundLineItemResponseProjection quantity(String alias) {
        fields.add(new GraphQLResponseField("quantity").alias(alias));
        return this;
    }

    public RefundLineItemResponseProjection restockType() {
        return restockType(null);
    }

    public RefundLineItemResponseProjection restockType(String alias) {
        fields.add(new GraphQLResponseField("restockType").alias(alias));
        return this;
    }

    public RefundLineItemResponseProjection restocked() {
        return restocked(null);
    }

    public RefundLineItemResponseProjection restocked(String alias) {
        fields.add(new GraphQLResponseField("restocked").alias(alias));
        return this;
    }

    public RefundLineItemResponseProjection subtotalSet(MoneyBagResponseProjection subProjection) {
        return subtotalSet(null, subProjection);
    }

    public RefundLineItemResponseProjection subtotalSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subtotalSet").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemResponseProjection totalTaxSet(MoneyBagResponseProjection subProjection) {
        return totalTaxSet(null, subProjection);
    }

    public RefundLineItemResponseProjection totalTaxSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalTaxSet").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemResponseProjection typename() {
        return typename(null);
    }

    public RefundLineItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
