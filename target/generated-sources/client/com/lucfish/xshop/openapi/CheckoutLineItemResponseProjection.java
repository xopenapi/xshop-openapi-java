package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckoutLineItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CheckoutLineItemResponseProjection extends GraphQLResponseProjection {

    public CheckoutLineItemResponseProjection() {
    }

    @Override
    public CheckoutLineItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CheckoutLineItemResponseProjection all$(int maxDepth) {
        this.id();
        this.quantity();
        this.title();
        if (projectionDepthOnFields.getOrDefault("CheckoutLineItemResponseProjection.MoneyResponseProjection.unitPrice", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutLineItemResponseProjection.MoneyResponseProjection.unitPrice", projectionDepthOnFields.getOrDefault("CheckoutLineItemResponseProjection.MoneyResponseProjection.unitPrice", 0) + 1);
            this.unitPrice(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutLineItemResponseProjection.MoneyResponseProjection.unitPrice", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CheckoutLineItemResponseProjection.ProductVariantResponseProjection.variant", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutLineItemResponseProjection.ProductVariantResponseProjection.variant", projectionDepthOnFields.getOrDefault("CheckoutLineItemResponseProjection.ProductVariantResponseProjection.variant", 0) + 1);
            this.variant(new ProductVariantResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutLineItemResponseProjection.ProductVariantResponseProjection.variant", 0)));
        }
        this.typename();
        return this;
    }

    public CheckoutLineItemResponseProjection id() {
        return id(null);
    }

    public CheckoutLineItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckoutLineItemResponseProjection quantity() {
        return quantity(null);
    }

    public CheckoutLineItemResponseProjection quantity(String alias) {
        fields.add(new GraphQLResponseField("quantity").alias(alias));
        return this;
    }

    public CheckoutLineItemResponseProjection title() {
        return title(null);
    }

    public CheckoutLineItemResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckoutLineItemResponseProjection unitPrice(MoneyResponseProjection subProjection) {
        return unitPrice(null, subProjection);
    }

    public CheckoutLineItemResponseProjection unitPrice(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unitPrice").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutLineItemResponseProjection variant(ProductVariantResponseProjection subProjection) {
        return variant(null, subProjection);
    }

    public CheckoutLineItemResponseProjection variant(String alias, ProductVariantResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variant").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutLineItemResponseProjection typename() {
        return typename(null);
    }

    public CheckoutLineItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
