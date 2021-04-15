package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Product
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductResponseProjection extends GraphQLResponseProjection {

    public ProductResponseProjection() {
    }

    @Override
    public ProductResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ImageConnectionResponseProjection.images", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ImageConnectionResponseProjection.images", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ImageConnectionResponseProjection.images", 0) + 1);
            this.images(new ImageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ImageConnectionResponseProjection.images", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.MediaConnectionResponseProjection.media", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.MediaConnectionResponseProjection.media", projectionDepthOnFields.getOrDefault("ProductResponseProjection.MediaConnectionResponseProjection.media", 0) + 1);
            this.media(new MediaConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.MediaConnectionResponseProjection.media", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.MetafieldConnectionResponseProjection.metafields", projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) + 1);
            this.metafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldConnectionResponseProjection.metafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldResponseProjection.metafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.MetafieldResponseProjection.metafield", projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldResponseProjection.metafield", 0) + 1);
            this.metafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldResponseProjection.metafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) + 1);
            this.privateMetafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldResponseProjection.privateMetafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.MetafieldResponseProjection.privateMetafield", projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldResponseProjection.privateMetafield", 0) + 1);
            this.privateMetafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.MetafieldResponseProjection.privateMetafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeConnectionResponseProjection.presentmentPriceRanges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ProductPriceRangeConnectionResponseProjection.presentmentPriceRanges", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeConnectionResponseProjection.presentmentPriceRanges", 0) + 1);
            this.presentmentPriceRanges(new ProductPriceRangeConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeConnectionResponseProjection.presentmentPriceRanges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductVariantConnectionResponseProjection.variants", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ProductVariantConnectionResponseProjection.variants", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductVariantConnectionResponseProjection.variants", 0) + 1);
            this.variants(new ProductVariantConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductVariantConnectionResponseProjection.variants", 0)));
        }
        this.availableForSale();
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeResponseProjection.compareAtPriceRange", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ProductPriceRangeResponseProjection.compareAtPriceRange", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeResponseProjection.compareAtPriceRange", 0) + 1);
            this.compareAtPriceRange(new ProductPriceRangeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeResponseProjection.compareAtPriceRange", 0)));
        }
        this.description();
        this.details();
        this.handle();
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductOptionResponseProjection.options", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ProductOptionResponseProjection.options", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductOptionResponseProjection.options", 0) + 1);
            this.options(new ProductOptionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductOptionResponseProjection.options", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeResponseProjection.priceRange", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ProductPriceRangeResponseProjection.priceRange", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeResponseProjection.priceRange", 0) + 1);
            this.priceRange(new ProductPriceRangeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductPriceRangeResponseProjection.priceRange", 0)));
        }
        this.productType();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.SEOResponseProjection.seo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.SEOResponseProjection.seo", projectionDepthOnFields.getOrDefault("ProductResponseProjection.SEOResponseProjection.seo", 0) + 1);
            this.seo(new SEOResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.SEOResponseProjection.seo", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.TagResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.TagResponseProjection.tags", projectionDepthOnFields.getOrDefault("ProductResponseProjection.TagResponseProjection.tags", 0) + 1);
            this.tags(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.TagResponseProjection.tags", 0)));
        }
        this.totalInventory();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductVariantResponseProjection.variantBySelectedOptions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductResponseProjection.ProductVariantResponseProjection.variantBySelectedOptions", projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductVariantResponseProjection.variantBySelectedOptions", 0) + 1);
            this.variantBySelectedOptions(new ProductVariantResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductResponseProjection.ProductVariantResponseProjection.variantBySelectedOptions", 0)));
        }
        this.vendor();
        this.typename();
        return this;
    }

    public ProductResponseProjection id() {
        return id(null);
    }

    public ProductResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProductResponseProjection title() {
        return title(null);
    }

    public ProductResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public ProductResponseProjection createdAt() {
        return createdAt(null);
    }

    public ProductResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ProductResponseProjection images(ImageConnectionResponseProjection subProjection) {
        return images((String)null, subProjection);
    }

    public ProductResponseProjection images(String alias, ImageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection images(ProductImagesParametrizedInput input, ImageConnectionResponseProjection subProjection) {
        return images(null, input, subProjection);
    }

    public ProductResponseProjection images(String alias, ProductImagesParametrizedInput input, ImageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection media(MediaConnectionResponseProjection subProjection) {
        return media((String)null, subProjection);
    }

    public ProductResponseProjection media(String alias, MediaConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("media").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection media(ProductMediaParametrizedInput input, MediaConnectionResponseProjection subProjection) {
        return media(null, input, subProjection);
    }

    public ProductResponseProjection media(String alias, ProductMediaParametrizedInput input, MediaConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("media").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection metafields(MetafieldConnectionResponseProjection subProjection) {
        return metafields((String)null, subProjection);
    }

    public ProductResponseProjection metafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection metafields(ProductMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return metafields(null, input, subProjection);
    }

    public ProductResponseProjection metafields(String alias, ProductMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection metafield(MetafieldResponseProjection subProjection) {
        return metafield((String)null, subProjection);
    }

    public ProductResponseProjection metafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection metafield(ProductMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return metafield(null, input, subProjection);
    }

    public ProductResponseProjection metafield(String alias, ProductMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection privateMetafields(MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields((String)null, subProjection);
    }

    public ProductResponseProjection privateMetafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection privateMetafields(ProductPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields(null, input, subProjection);
    }

    public ProductResponseProjection privateMetafields(String alias, ProductPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection privateMetafield(MetafieldResponseProjection subProjection) {
        return privateMetafield((String)null, subProjection);
    }

    public ProductResponseProjection privateMetafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection privateMetafield(ProductPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return privateMetafield(null, input, subProjection);
    }

    public ProductResponseProjection privateMetafield(String alias, ProductPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection presentmentPriceRanges(ProductPriceRangeConnectionResponseProjection subProjection) {
        return presentmentPriceRanges((String)null, subProjection);
    }

    public ProductResponseProjection presentmentPriceRanges(String alias, ProductPriceRangeConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("presentmentPriceRanges").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection presentmentPriceRanges(ProductPresentmentPriceRangesParametrizedInput input, ProductPriceRangeConnectionResponseProjection subProjection) {
        return presentmentPriceRanges(null, input, subProjection);
    }

    public ProductResponseProjection presentmentPriceRanges(String alias, ProductPresentmentPriceRangesParametrizedInput input, ProductPriceRangeConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("presentmentPriceRanges").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection variants(ProductVariantConnectionResponseProjection subProjection) {
        return variants((String)null, subProjection);
    }

    public ProductResponseProjection variants(String alias, ProductVariantConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variants").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection variants(ProductVariantsParametrizedInput input, ProductVariantConnectionResponseProjection subProjection) {
        return variants(null, input, subProjection);
    }

    public ProductResponseProjection variants(String alias, ProductVariantsParametrizedInput input, ProductVariantConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variants").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection availableForSale() {
        return availableForSale(null);
    }

    public ProductResponseProjection availableForSale(String alias) {
        fields.add(new GraphQLResponseField("availableForSale").alias(alias));
        return this;
    }

    public ProductResponseProjection compareAtPriceRange(ProductPriceRangeResponseProjection subProjection) {
        return compareAtPriceRange(null, subProjection);
    }

    public ProductResponseProjection compareAtPriceRange(String alias, ProductPriceRangeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("compareAtPriceRange").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection description() {
        return description(null);
    }

    public ProductResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProductResponseProjection details() {
        return details(null);
    }

    public ProductResponseProjection details(String alias) {
        fields.add(new GraphQLResponseField("details").alias(alias));
        return this;
    }

    public ProductResponseProjection handle() {
        return handle(null);
    }

    public ProductResponseProjection handle(String alias) {
        fields.add(new GraphQLResponseField("handle").alias(alias));
        return this;
    }

    public ProductResponseProjection options(ProductOptionResponseProjection subProjection) {
        return options((String)null, subProjection);
    }

    public ProductResponseProjection options(String alias, ProductOptionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("options").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection options(ProductOptionsParametrizedInput input, ProductOptionResponseProjection subProjection) {
        return options(null, input, subProjection);
    }

    public ProductResponseProjection options(String alias, ProductOptionsParametrizedInput input, ProductOptionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("options").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection priceRange(ProductPriceRangeResponseProjection subProjection) {
        return priceRange(null, subProjection);
    }

    public ProductResponseProjection priceRange(String alias, ProductPriceRangeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("priceRange").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection productType() {
        return productType(null);
    }

    public ProductResponseProjection productType(String alias) {
        fields.add(new GraphQLResponseField("productType").alias(alias));
        return this;
    }

    public ProductResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public ProductResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public ProductResponseProjection seo(SEOResponseProjection subProjection) {
        return seo(null, subProjection);
    }

    public ProductResponseProjection seo(String alias, SEOResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("seo").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection tags(TagResponseProjection subProjection) {
        return tags(null, subProjection);
    }

    public ProductResponseProjection tags(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection totalInventory() {
        return totalInventory(null);
    }

    public ProductResponseProjection totalInventory(String alias) {
        fields.add(new GraphQLResponseField("totalInventory").alias(alias));
        return this;
    }

    public ProductResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ProductResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ProductResponseProjection variantBySelectedOptions(ProductVariantResponseProjection subProjection) {
        return variantBySelectedOptions((String)null, subProjection);
    }

    public ProductResponseProjection variantBySelectedOptions(String alias, ProductVariantResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variantBySelectedOptions").alias(alias).projection(subProjection));
        return this;
    }

    public ProductResponseProjection variantBySelectedOptions(ProductVariantBySelectedOptionsParametrizedInput input, ProductVariantResponseProjection subProjection) {
        return variantBySelectedOptions(null, input, subProjection);
    }

    public ProductResponseProjection variantBySelectedOptions(String alias, ProductVariantBySelectedOptionsParametrizedInput input, ProductVariantResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variantBySelectedOptions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProductResponseProjection vendor() {
        return vendor(null);
    }

    public ProductResponseProjection vendor(String alias) {
        fields.add(new GraphQLResponseField("vendor").alias(alias));
        return this;
    }

    public ProductResponseProjection typename() {
        return typename(null);
    }

    public ProductResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
