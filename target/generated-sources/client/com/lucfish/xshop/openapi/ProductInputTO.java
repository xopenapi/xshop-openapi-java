package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> collectionsToJoin;
    @javax.validation.constraints.NotNull
    private java.util.List<String> collectionsToLeave;
    private String details;
    private String description;
    private Boolean giftCard;
    private String giftCardTemplateSuffix;
    private String handle;
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<ImageInputTO> images;
    @javax.validation.constraints.NotNull
    private java.util.List<MetafieldInputTO> metafields;
    @javax.validation.constraints.NotNull
    private java.util.List<ProductOptionValueInputTO> options;
    @javax.validation.constraints.NotNull
    private java.util.List<MetafieldInputTO> privateMetafields;
    private String productType;
    private java.util.Date publishDate;
    private java.util.Date publishOn;
    private Boolean published;
    private java.util.Date publishedAt;
    private Boolean redirectNewHandle;
    private Boolean requiresSellingPlan;
    private SEOInputTO seo;
    private ProductStatusTO status;
    @javax.validation.constraints.NotNull
    private java.util.List<TagInputTO> tags;
    private String templateSuffix;
    private String title;
    @javax.validation.constraints.NotNull
    private java.util.List<ProductVariantInputTO> variants;
    private String vendor;

    public ProductInputTO() {
    }

    public ProductInputTO(java.util.List<String> collectionsToJoin, java.util.List<String> collectionsToLeave, String details, String description, Boolean giftCard, String giftCardTemplateSuffix, String handle, String id, java.util.List<ImageInputTO> images, java.util.List<MetafieldInputTO> metafields, java.util.List<ProductOptionValueInputTO> options, java.util.List<MetafieldInputTO> privateMetafields, String productType, java.util.Date publishDate, java.util.Date publishOn, Boolean published, java.util.Date publishedAt, Boolean redirectNewHandle, Boolean requiresSellingPlan, SEOInputTO seo, ProductStatusTO status, java.util.List<TagInputTO> tags, String templateSuffix, String title, java.util.List<ProductVariantInputTO> variants, String vendor) {
        this.collectionsToJoin = collectionsToJoin;
        this.collectionsToLeave = collectionsToLeave;
        this.details = details;
        this.description = description;
        this.giftCard = giftCard;
        this.giftCardTemplateSuffix = giftCardTemplateSuffix;
        this.handle = handle;
        this.id = id;
        this.images = images;
        this.metafields = metafields;
        this.options = options;
        this.privateMetafields = privateMetafields;
        this.productType = productType;
        this.publishDate = publishDate;
        this.publishOn = publishOn;
        this.published = published;
        this.publishedAt = publishedAt;
        this.redirectNewHandle = redirectNewHandle;
        this.requiresSellingPlan = requiresSellingPlan;
        this.seo = seo;
        this.status = status;
        this.tags = tags;
        this.templateSuffix = templateSuffix;
        this.title = title;
        this.variants = variants;
        this.vendor = vendor;
    }

    public java.util.List<String> getCollectionsToJoin() {
        return collectionsToJoin;
    }
    public void setCollectionsToJoin(java.util.List<String> collectionsToJoin) {
        this.collectionsToJoin = collectionsToJoin;
    }

    public java.util.List<String> getCollectionsToLeave() {
        return collectionsToLeave;
    }
    public void setCollectionsToLeave(java.util.List<String> collectionsToLeave) {
        this.collectionsToLeave = collectionsToLeave;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getGiftCard() {
        return giftCard;
    }
    public void setGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
    }

    public String getGiftCardTemplateSuffix() {
        return giftCardTemplateSuffix;
    }
    public void setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
        this.giftCardTemplateSuffix = giftCardTemplateSuffix;
    }

    public String getHandle() {
        return handle;
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.List<ImageInputTO> getImages() {
        return images;
    }
    public void setImages(java.util.List<ImageInputTO> images) {
        this.images = images;
    }

    public java.util.List<MetafieldInputTO> getMetafields() {
        return metafields;
    }
    public void setMetafields(java.util.List<MetafieldInputTO> metafields) {
        this.metafields = metafields;
    }

    public java.util.List<ProductOptionValueInputTO> getOptions() {
        return options;
    }
    public void setOptions(java.util.List<ProductOptionValueInputTO> options) {
        this.options = options;
    }

    public java.util.List<MetafieldInputTO> getPrivateMetafields() {
        return privateMetafields;
    }
    public void setPrivateMetafields(java.util.List<MetafieldInputTO> privateMetafields) {
        this.privateMetafields = privateMetafields;
    }

    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public java.util.Date getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(java.util.Date publishDate) {
        this.publishDate = publishDate;
    }

    public java.util.Date getPublishOn() {
        return publishOn;
    }
    public void setPublishOn(java.util.Date publishOn) {
        this.publishOn = publishOn;
    }

    public Boolean getPublished() {
        return published;
    }
    public void setPublished(Boolean published) {
        this.published = published;
    }

    public java.util.Date getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(java.util.Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle;
    }
    public void setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = redirectNewHandle;
    }

    public Boolean getRequiresSellingPlan() {
        return requiresSellingPlan;
    }
    public void setRequiresSellingPlan(Boolean requiresSellingPlan) {
        this.requiresSellingPlan = requiresSellingPlan;
    }

    public SEOInputTO getSeo() {
        return seo;
    }
    public void setSeo(SEOInputTO seo) {
        this.seo = seo;
    }

    public ProductStatusTO getStatus() {
        return status;
    }
    public void setStatus(ProductStatusTO status) {
        this.status = status;
    }

    public java.util.List<TagInputTO> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagInputTO> tags) {
        this.tags = tags;
    }

    public String getTemplateSuffix() {
        return templateSuffix;
    }
    public void setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = templateSuffix;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<ProductVariantInputTO> getVariants() {
        return variants;
    }
    public void setVariants(java.util.List<ProductVariantInputTO> variants) {
        this.variants = variants;
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
        if (collectionsToJoin != null) {
            joiner.add("collectionsToJoin: " + GraphQLRequestSerializer.getEntry(collectionsToJoin));
        }
        if (collectionsToLeave != null) {
            joiner.add("collectionsToLeave: " + GraphQLRequestSerializer.getEntry(collectionsToLeave));
        }
        if (details != null) {
            joiner.add("details: " + GraphQLRequestSerializer.getEntry(details));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (giftCard != null) {
            joiner.add("giftCard: " + GraphQLRequestSerializer.getEntry(giftCard));
        }
        if (giftCardTemplateSuffix != null) {
            joiner.add("giftCardTemplateSuffix: " + GraphQLRequestSerializer.getEntry(giftCardTemplateSuffix));
        }
        if (handle != null) {
            joiner.add("handle: " + GraphQLRequestSerializer.getEntry(handle));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (images != null) {
            joiner.add("images: " + GraphQLRequestSerializer.getEntry(images));
        }
        if (metafields != null) {
            joiner.add("metafields: " + GraphQLRequestSerializer.getEntry(metafields));
        }
        if (options != null) {
            joiner.add("options: " + GraphQLRequestSerializer.getEntry(options));
        }
        if (privateMetafields != null) {
            joiner.add("privateMetafields: " + GraphQLRequestSerializer.getEntry(privateMetafields));
        }
        if (productType != null) {
            joiner.add("productType: " + GraphQLRequestSerializer.getEntry(productType));
        }
        if (publishDate != null) {
            joiner.add("publishDate: " + GraphQLRequestSerializer.getEntry(publishDate));
        }
        if (publishOn != null) {
            joiner.add("publishOn: " + GraphQLRequestSerializer.getEntry(publishOn));
        }
        if (published != null) {
            joiner.add("published: " + GraphQLRequestSerializer.getEntry(published));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (redirectNewHandle != null) {
            joiner.add("redirectNewHandle: " + GraphQLRequestSerializer.getEntry(redirectNewHandle));
        }
        if (requiresSellingPlan != null) {
            joiner.add("requiresSellingPlan: " + GraphQLRequestSerializer.getEntry(requiresSellingPlan));
        }
        if (seo != null) {
            joiner.add("seo: " + GraphQLRequestSerializer.getEntry(seo));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (templateSuffix != null) {
            joiner.add("templateSuffix: " + GraphQLRequestSerializer.getEntry(templateSuffix));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (variants != null) {
            joiner.add("variants: " + GraphQLRequestSerializer.getEntry(variants));
        }
        if (vendor != null) {
            joiner.add("vendor: " + GraphQLRequestSerializer.getEntry(vendor));
        }
        return joiner.toString();
    }

    public static ProductInputTO.Builder builder() {
        return new ProductInputTO.Builder();
    }

    public static class Builder {

        private java.util.List<String> collectionsToJoin;
        private java.util.List<String> collectionsToLeave;
        private String details;
        private String description;
        private Boolean giftCard;
        private String giftCardTemplateSuffix;
        private String handle;
        private String id;
        private java.util.List<ImageInputTO> images;
        private java.util.List<MetafieldInputTO> metafields;
        private java.util.List<ProductOptionValueInputTO> options;
        private java.util.List<MetafieldInputTO> privateMetafields;
        private String productType;
        private java.util.Date publishDate;
        private java.util.Date publishOn;
        private Boolean published;
        private java.util.Date publishedAt;
        private Boolean redirectNewHandle;
        private Boolean requiresSellingPlan;
        private SEOInputTO seo;
        private ProductStatusTO status;
        private java.util.List<TagInputTO> tags;
        private String templateSuffix;
        private String title;
        private java.util.List<ProductVariantInputTO> variants;
        private String vendor;

        public Builder() {
        }

        public Builder setCollectionsToJoin(java.util.List<String> collectionsToJoin) {
            this.collectionsToJoin = collectionsToJoin;
            return this;
        }

        public Builder setCollectionsToLeave(java.util.List<String> collectionsToLeave) {
            this.collectionsToLeave = collectionsToLeave;
            return this;
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGiftCard(Boolean giftCard) {
            this.giftCard = giftCard;
            return this;
        }

        public Builder setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
            this.giftCardTemplateSuffix = giftCardTemplateSuffix;
            return this;
        }

        public Builder setHandle(String handle) {
            this.handle = handle;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImages(java.util.List<ImageInputTO> images) {
            this.images = images;
            return this;
        }

        public Builder setMetafields(java.util.List<MetafieldInputTO> metafields) {
            this.metafields = metafields;
            return this;
        }

        public Builder setOptions(java.util.List<ProductOptionValueInputTO> options) {
            this.options = options;
            return this;
        }

        public Builder setPrivateMetafields(java.util.List<MetafieldInputTO> privateMetafields) {
            this.privateMetafields = privateMetafields;
            return this;
        }

        public Builder setProductType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder setPublishDate(java.util.Date publishDate) {
            this.publishDate = publishDate;
            return this;
        }

        public Builder setPublishOn(java.util.Date publishOn) {
            this.publishOn = publishOn;
            return this;
        }

        public Builder setPublished(Boolean published) {
            this.published = published;
            return this;
        }

        public Builder setPublishedAt(java.util.Date publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder setRedirectNewHandle(Boolean redirectNewHandle) {
            this.redirectNewHandle = redirectNewHandle;
            return this;
        }

        public Builder setRequiresSellingPlan(Boolean requiresSellingPlan) {
            this.requiresSellingPlan = requiresSellingPlan;
            return this;
        }

        public Builder setSeo(SEOInputTO seo) {
            this.seo = seo;
            return this;
        }

        public Builder setStatus(ProductStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setTags(java.util.List<TagInputTO> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTemplateSuffix(String templateSuffix) {
            this.templateSuffix = templateSuffix;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setVariants(java.util.List<ProductVariantInputTO> variants) {
            this.variants = variants;
            return this;
        }

        public Builder setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }


        public ProductInputTO build() {
            return new ProductInputTO(collectionsToJoin, collectionsToLeave, details, description, giftCard, giftCardTemplateSuffix, handle, id, images, metafields, options, privateMetafields, productType, publishDate, publishOn, published, publishedAt, redirectNewHandle, requiresSellingPlan, seo, status, tags, templateSuffix, title, variants, vendor);
        }

    }
}
