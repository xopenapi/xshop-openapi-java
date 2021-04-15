package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LineItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class LineItemResponseProjection extends GraphQLResponseProjection {

    public LineItemResponseProjection() {
    }

    @Override
    public LineItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LineItemResponseProjection all$(int maxDepth) {
        this.fulfillableQuantity();
        if (projectionDepthOnFields.getOrDefault("LineItemResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", projectionDepthOnFields.getOrDefault("LineItemResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", 0) + 1);
            this.fulfillmentService(new FulfillmentServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", 0)));
        }
        this.fulfillmentStatus();
        this.id();
        if (projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ImageResponseProjection.image", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemResponseProjection.ImageResponseProjection.image", projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ImageResponseProjection.image", 0) + 1);
            this.image(new ImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ImageResponseProjection.image", 0)));
        }
        this.merchantEditable();
        this.name();
        this.nonFulfillableQuantity();
        if (projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ProductResponseProjection.product", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemResponseProjection.ProductResponseProjection.product", projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ProductResponseProjection.product", 0) + 1);
            this.product(new ProductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ProductResponseProjection.product", 0)));
        }
        this.quantity();
        this.refundableQuantity();
        this.requiresShipping();
        this.restockable();
        this.sku();
        this.taxable();
        this.title();
        this.unfulfilledQuantity();
        if (projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ProductVariantResponseProjection.variant", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemResponseProjection.ProductVariantResponseProjection.variant", projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ProductVariantResponseProjection.variant", 0) + 1);
            this.variant(new ProductVariantResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemResponseProjection.ProductVariantResponseProjection.variant", 0)));
        }
        this.variantTitle();
        this.vendor();
        this.typename();
        return this;
    }

    public LineItemResponseProjection fulfillableQuantity() {
        return fulfillableQuantity(null);
    }

    public LineItemResponseProjection fulfillableQuantity(String alias) {
        fields.add(new GraphQLResponseField("fulfillableQuantity").alias(alias));
        return this;
    }

    public LineItemResponseProjection fulfillmentService(FulfillmentServiceResponseProjection subProjection) {
        return fulfillmentService(null, subProjection);
    }

    public LineItemResponseProjection fulfillmentService(String alias, FulfillmentServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fulfillmentService").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemResponseProjection fulfillmentStatus() {
        return fulfillmentStatus(null);
    }

    public LineItemResponseProjection fulfillmentStatus(String alias) {
        fields.add(new GraphQLResponseField("fulfillmentStatus").alias(alias));
        return this;
    }

    public LineItemResponseProjection id() {
        return id(null);
    }

    public LineItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LineItemResponseProjection image(ImageResponseProjection subProjection) {
        return image((String)null, subProjection);
    }

    public LineItemResponseProjection image(String alias, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("image").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemResponseProjection image(LineItemImageParametrizedInput input, ImageResponseProjection subProjection) {
        return image(null, input, subProjection);
    }

    public LineItemResponseProjection image(String alias, LineItemImageParametrizedInput input, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("image").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LineItemResponseProjection merchantEditable() {
        return merchantEditable(null);
    }

    public LineItemResponseProjection merchantEditable(String alias) {
        fields.add(new GraphQLResponseField("merchantEditable").alias(alias));
        return this;
    }

    public LineItemResponseProjection name() {
        return name(null);
    }

    public LineItemResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LineItemResponseProjection nonFulfillableQuantity() {
        return nonFulfillableQuantity(null);
    }

    public LineItemResponseProjection nonFulfillableQuantity(String alias) {
        fields.add(new GraphQLResponseField("nonFulfillableQuantity").alias(alias));
        return this;
    }

    public LineItemResponseProjection product(ProductResponseProjection subProjection) {
        return product(null, subProjection);
    }

    public LineItemResponseProjection product(String alias, ProductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("product").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemResponseProjection quantity() {
        return quantity(null);
    }

    public LineItemResponseProjection quantity(String alias) {
        fields.add(new GraphQLResponseField("quantity").alias(alias));
        return this;
    }

    public LineItemResponseProjection refundableQuantity() {
        return refundableQuantity(null);
    }

    public LineItemResponseProjection refundableQuantity(String alias) {
        fields.add(new GraphQLResponseField("refundableQuantity").alias(alias));
        return this;
    }

    public LineItemResponseProjection requiresShipping() {
        return requiresShipping(null);
    }

    public LineItemResponseProjection requiresShipping(String alias) {
        fields.add(new GraphQLResponseField("requiresShipping").alias(alias));
        return this;
    }

    public LineItemResponseProjection restockable() {
        return restockable(null);
    }

    public LineItemResponseProjection restockable(String alias) {
        fields.add(new GraphQLResponseField("restockable").alias(alias));
        return this;
    }

    public LineItemResponseProjection sku() {
        return sku(null);
    }

    public LineItemResponseProjection sku(String alias) {
        fields.add(new GraphQLResponseField("sku").alias(alias));
        return this;
    }

    public LineItemResponseProjection taxable() {
        return taxable(null);
    }

    public LineItemResponseProjection taxable(String alias) {
        fields.add(new GraphQLResponseField("taxable").alias(alias));
        return this;
    }

    public LineItemResponseProjection title() {
        return title(null);
    }

    public LineItemResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public LineItemResponseProjection unfulfilledQuantity() {
        return unfulfilledQuantity(null);
    }

    public LineItemResponseProjection unfulfilledQuantity(String alias) {
        fields.add(new GraphQLResponseField("unfulfilledQuantity").alias(alias));
        return this;
    }

    public LineItemResponseProjection variant(ProductVariantResponseProjection subProjection) {
        return variant(null, subProjection);
    }

    public LineItemResponseProjection variant(String alias, ProductVariantResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variant").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemResponseProjection variantTitle() {
        return variantTitle(null);
    }

    public LineItemResponseProjection variantTitle(String alias) {
        fields.add(new GraphQLResponseField("variantTitle").alias(alias));
        return this;
    }

    public LineItemResponseProjection vendor() {
        return vendor(null);
    }

    public LineItemResponseProjection vendor(String alias) {
        fields.add(new GraphQLResponseField("vendor").alias(alias));
        return this;
    }

    public LineItemResponseProjection typename() {
        return typename(null);
    }

    public LineItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
