package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductTO implements java.io.Serializable, NodeTO, HasMetafieldsTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private ImageConnectionTO images;
    private MediaConnectionTO media;
    @javax.validation.constraints.NotNull
    private MetafieldConnectionTO metafields;
    private MetafieldTO metafield;
    @javax.validation.constraints.NotNull
    private MetafieldConnectionTO privateMetafields;
    private MetafieldTO privateMetafield;
    @javax.validation.constraints.NotNull
    private ProductPriceRangeConnectionTO presentmentPriceRanges;
    @javax.validation.constraints.NotNull
    private ProductVariantConnectionTO variants;
    private boolean availableForSale;
    @javax.validation.constraints.NotNull
    private ProductPriceRangeTO compareAtPriceRange;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String details;
    @javax.validation.constraints.NotNull
    private String handle;
    @javax.validation.constraints.NotNull
    private java.util.List<ProductOptionTO> options;
    @javax.validation.constraints.NotNull
    private ProductPriceRangeTO priceRange;
    @javax.validation.constraints.NotNull
    private String productType;
    @javax.validation.constraints.NotNull
    private java.util.Date publishedAt;
    private SEOTO seo;
    @javax.validation.constraints.NotNull
    private java.util.List<TagTO> tags;
    private Integer totalInventory;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    private ProductVariantTO variantBySelectedOptions;
    @javax.validation.constraints.NotNull
    private String vendor;

    public ProductTO() {
    }

    public ProductTO(String id, String title, java.util.Date createdAt, ImageConnectionTO images, MediaConnectionTO media, MetafieldConnectionTO metafields, MetafieldTO metafield, MetafieldConnectionTO privateMetafields, MetafieldTO privateMetafield, ProductPriceRangeConnectionTO presentmentPriceRanges, ProductVariantConnectionTO variants, boolean availableForSale, ProductPriceRangeTO compareAtPriceRange, String description, String details, String handle, java.util.List<ProductOptionTO> options, ProductPriceRangeTO priceRange, String productType, java.util.Date publishedAt, SEOTO seo, java.util.List<TagTO> tags, Integer totalInventory, java.util.Date updatedAt, ProductVariantTO variantBySelectedOptions, String vendor) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
        this.images = images;
        this.media = media;
        this.metafields = metafields;
        this.metafield = metafield;
        this.privateMetafields = privateMetafields;
        this.privateMetafield = privateMetafield;
        this.presentmentPriceRanges = presentmentPriceRanges;
        this.variants = variants;
        this.availableForSale = availableForSale;
        this.compareAtPriceRange = compareAtPriceRange;
        this.description = description;
        this.details = details;
        this.handle = handle;
        this.options = options;
        this.priceRange = priceRange;
        this.productType = productType;
        this.publishedAt = publishedAt;
        this.seo = seo;
        this.tags = tags;
        this.totalInventory = totalInventory;
        this.updatedAt = updatedAt;
        this.variantBySelectedOptions = variantBySelectedOptions;
        this.vendor = vendor;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public ImageConnectionTO getImages() {
        return images;
    }
    public void setImages(ImageConnectionTO images) {
        this.images = images;
    }

    public MediaConnectionTO getMedia() {
        return media;
    }
    public void setMedia(MediaConnectionTO media) {
        this.media = media;
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

    public ProductPriceRangeConnectionTO getPresentmentPriceRanges() {
        return presentmentPriceRanges;
    }
    public void setPresentmentPriceRanges(ProductPriceRangeConnectionTO presentmentPriceRanges) {
        this.presentmentPriceRanges = presentmentPriceRanges;
    }

    public ProductVariantConnectionTO getVariants() {
        return variants;
    }
    public void setVariants(ProductVariantConnectionTO variants) {
        this.variants = variants;
    }

    public boolean getAvailableForSale() {
        return availableForSale;
    }
    public void setAvailableForSale(boolean availableForSale) {
        this.availableForSale = availableForSale;
    }

    public ProductPriceRangeTO getCompareAtPriceRange() {
        return compareAtPriceRange;
    }
    public void setCompareAtPriceRange(ProductPriceRangeTO compareAtPriceRange) {
        this.compareAtPriceRange = compareAtPriceRange;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String getHandle() {
        return handle;
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }

    public java.util.List<ProductOptionTO> getOptions() {
        return options;
    }
    public void setOptions(java.util.List<ProductOptionTO> options) {
        this.options = options;
    }

    public ProductPriceRangeTO getPriceRange() {
        return priceRange;
    }
    public void setPriceRange(ProductPriceRangeTO priceRange) {
        this.priceRange = priceRange;
    }

    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public java.util.Date getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(java.util.Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public SEOTO getSeo() {
        return seo;
    }
    public void setSeo(SEOTO seo) {
        this.seo = seo;
    }

    public java.util.List<TagTO> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagTO> tags) {
        this.tags = tags;
    }

    public Integer getTotalInventory() {
        return totalInventory;
    }
    public void setTotalInventory(Integer totalInventory) {
        this.totalInventory = totalInventory;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProductVariantTO getVariantBySelectedOptions() {
        return variantBySelectedOptions;
    }
    public void setVariantBySelectedOptions(ProductVariantTO variantBySelectedOptions) {
        this.variantBySelectedOptions = variantBySelectedOptions;
    }

    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (images != null) {
            joiner.add("images: " + GraphQLRequestSerializer.getEntry(images));
        }
        if (media != null) {
            joiner.add("media: " + GraphQLRequestSerializer.getEntry(media));
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
        if (presentmentPriceRanges != null) {
            joiner.add("presentmentPriceRanges: " + GraphQLRequestSerializer.getEntry(presentmentPriceRanges));
        }
        if (variants != null) {
            joiner.add("variants: " + GraphQLRequestSerializer.getEntry(variants));
        }
        joiner.add("availableForSale: " + GraphQLRequestSerializer.getEntry(availableForSale));
        if (compareAtPriceRange != null) {
            joiner.add("compareAtPriceRange: " + GraphQLRequestSerializer.getEntry(compareAtPriceRange));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (details != null) {
            joiner.add("details: " + GraphQLRequestSerializer.getEntry(details));
        }
        if (handle != null) {
            joiner.add("handle: " + GraphQLRequestSerializer.getEntry(handle));
        }
        if (options != null) {
            joiner.add("options: " + GraphQLRequestSerializer.getEntry(options));
        }
        if (priceRange != null) {
            joiner.add("priceRange: " + GraphQLRequestSerializer.getEntry(priceRange));
        }
        if (productType != null) {
            joiner.add("productType: " + GraphQLRequestSerializer.getEntry(productType));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (seo != null) {
            joiner.add("seo: " + GraphQLRequestSerializer.getEntry(seo));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (totalInventory != null) {
            joiner.add("totalInventory: " + GraphQLRequestSerializer.getEntry(totalInventory));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (variantBySelectedOptions != null) {
            joiner.add("variantBySelectedOptions: " + GraphQLRequestSerializer.getEntry(variantBySelectedOptions));
        }
        if (vendor != null) {
            joiner.add("vendor: " + GraphQLRequestSerializer.getEntry(vendor));
        }
        return joiner.toString();
    }

    public static ProductTO.Builder builder() {
        return new ProductTO.Builder();
    }

    public static class Builder {

        private String id;
        private String title;
        private java.util.Date createdAt;
        private ImageConnectionTO images;
        private MediaConnectionTO media;
        private MetafieldConnectionTO metafields;
        private MetafieldTO metafield;
        private MetafieldConnectionTO privateMetafields;
        private MetafieldTO privateMetafield;
        private ProductPriceRangeConnectionTO presentmentPriceRanges;
        private ProductVariantConnectionTO variants;
        private boolean availableForSale;
        private ProductPriceRangeTO compareAtPriceRange;
        private String description;
        private String details;
        private String handle;
        private java.util.List<ProductOptionTO> options;
        private ProductPriceRangeTO priceRange;
        private String productType;
        private java.util.Date publishedAt;
        private SEOTO seo;
        private java.util.List<TagTO> tags;
        private Integer totalInventory;
        private java.util.Date updatedAt;
        private ProductVariantTO variantBySelectedOptions;
        private String vendor;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setImages(ImageConnectionTO images) {
            this.images = images;
            return this;
        }

        public Builder setMedia(MediaConnectionTO media) {
            this.media = media;
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

        public Builder setPresentmentPriceRanges(ProductPriceRangeConnectionTO presentmentPriceRanges) {
            this.presentmentPriceRanges = presentmentPriceRanges;
            return this;
        }

        public Builder setVariants(ProductVariantConnectionTO variants) {
            this.variants = variants;
            return this;
        }

        public Builder setAvailableForSale(boolean availableForSale) {
            this.availableForSale = availableForSale;
            return this;
        }

        public Builder setCompareAtPriceRange(ProductPriceRangeTO compareAtPriceRange) {
            this.compareAtPriceRange = compareAtPriceRange;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setHandle(String handle) {
            this.handle = handle;
            return this;
        }

        public Builder setOptions(java.util.List<ProductOptionTO> options) {
            this.options = options;
            return this;
        }

        public Builder setPriceRange(ProductPriceRangeTO priceRange) {
            this.priceRange = priceRange;
            return this;
        }

        public Builder setProductType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder setPublishedAt(java.util.Date publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder setSeo(SEOTO seo) {
            this.seo = seo;
            return this;
        }

        public Builder setTags(java.util.List<TagTO> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTotalInventory(Integer totalInventory) {
            this.totalInventory = totalInventory;
            return this;
        }

        public Builder setUpdatedAt(java.util.Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setVariantBySelectedOptions(ProductVariantTO variantBySelectedOptions) {
            this.variantBySelectedOptions = variantBySelectedOptions;
            return this;
        }

        public Builder setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }


        public ProductTO build() {
            return new ProductTO(id, title, createdAt, images, media, metafields, metafield, privateMetafields, privateMetafield, presentmentPriceRanges, variants, availableForSale, compareAtPriceRange, description, details, handle, options, priceRange, productType, publishedAt, seo, tags, totalInventory, updatedAt, variantBySelectedOptions, vendor);
        }

    }
}
