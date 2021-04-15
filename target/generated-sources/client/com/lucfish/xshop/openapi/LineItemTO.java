package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class LineItemTO implements java.io.Serializable, NodeTO {

    private int fulfillableQuantity;
    @javax.validation.constraints.NotNull
    private FulfillmentServiceTO fulfillmentService;
    @javax.validation.constraints.NotNull
    private String fulfillmentStatus;
    @javax.validation.constraints.NotNull
    private String id;
    private ImageTO image;
    private boolean merchantEditable;
    @javax.validation.constraints.NotNull
    private String name;
    private int nonFulfillableQuantity;
    private ProductTO product;
    private int quantity;
    private int refundableQuantity;
    private boolean requiresShipping;
    private boolean restockable;
    private String sku;
    private boolean taxable;
    @javax.validation.constraints.NotNull
    private String title;
    private int unfulfilledQuantity;
    private ProductVariantTO variant;
    private String variantTitle;
    private String vendor;

    public LineItemTO() {
    }

    public LineItemTO(int fulfillableQuantity, FulfillmentServiceTO fulfillmentService, String fulfillmentStatus, String id, ImageTO image, boolean merchantEditable, String name, int nonFulfillableQuantity, ProductTO product, int quantity, int refundableQuantity, boolean requiresShipping, boolean restockable, String sku, boolean taxable, String title, int unfulfilledQuantity, ProductVariantTO variant, String variantTitle, String vendor) {
        this.fulfillableQuantity = fulfillableQuantity;
        this.fulfillmentService = fulfillmentService;
        this.fulfillmentStatus = fulfillmentStatus;
        this.id = id;
        this.image = image;
        this.merchantEditable = merchantEditable;
        this.name = name;
        this.nonFulfillableQuantity = nonFulfillableQuantity;
        this.product = product;
        this.quantity = quantity;
        this.refundableQuantity = refundableQuantity;
        this.requiresShipping = requiresShipping;
        this.restockable = restockable;
        this.sku = sku;
        this.taxable = taxable;
        this.title = title;
        this.unfulfilledQuantity = unfulfilledQuantity;
        this.variant = variant;
        this.variantTitle = variantTitle;
        this.vendor = vendor;
    }

    public int getFulfillableQuantity() {
        return fulfillableQuantity;
    }
    public void setFulfillableQuantity(int fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public FulfillmentServiceTO getFulfillmentService() {
        return fulfillmentService;
    }
    public void setFulfillmentService(FulfillmentServiceTO fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }
    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ImageTO getImage() {
        return image;
    }
    public void setImage(ImageTO image) {
        this.image = image;
    }

    public boolean getMerchantEditable() {
        return merchantEditable;
    }
    public void setMerchantEditable(boolean merchantEditable) {
        this.merchantEditable = merchantEditable;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNonFulfillableQuantity() {
        return nonFulfillableQuantity;
    }
    public void setNonFulfillableQuantity(int nonFulfillableQuantity) {
        this.nonFulfillableQuantity = nonFulfillableQuantity;
    }

    public ProductTO getProduct() {
        return product;
    }
    public void setProduct(ProductTO product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRefundableQuantity() {
        return refundableQuantity;
    }
    public void setRefundableQuantity(int refundableQuantity) {
        this.refundableQuantity = refundableQuantity;
    }

    public boolean getRequiresShipping() {
        return requiresShipping;
    }
    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public boolean getRestockable() {
        return restockable;
    }
    public void setRestockable(boolean restockable) {
        this.restockable = restockable;
    }

    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean getTaxable() {
        return taxable;
    }
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnfulfilledQuantity() {
        return unfulfilledQuantity;
    }
    public void setUnfulfilledQuantity(int unfulfilledQuantity) {
        this.unfulfilledQuantity = unfulfilledQuantity;
    }

    public ProductVariantTO getVariant() {
        return variant;
    }
    public void setVariant(ProductVariantTO variant) {
        this.variant = variant;
    }

    public String getVariantTitle() {
        return variantTitle;
    }
    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
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
        joiner.add("fulfillableQuantity: " + GraphQLRequestSerializer.getEntry(fulfillableQuantity));
        if (fulfillmentService != null) {
            joiner.add("fulfillmentService: " + GraphQLRequestSerializer.getEntry(fulfillmentService));
        }
        if (fulfillmentStatus != null) {
            joiner.add("fulfillmentStatus: " + GraphQLRequestSerializer.getEntry(fulfillmentStatus));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        joiner.add("merchantEditable: " + GraphQLRequestSerializer.getEntry(merchantEditable));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("nonFulfillableQuantity: " + GraphQLRequestSerializer.getEntry(nonFulfillableQuantity));
        if (product != null) {
            joiner.add("product: " + GraphQLRequestSerializer.getEntry(product));
        }
        joiner.add("quantity: " + GraphQLRequestSerializer.getEntry(quantity));
        joiner.add("refundableQuantity: " + GraphQLRequestSerializer.getEntry(refundableQuantity));
        joiner.add("requiresShipping: " + GraphQLRequestSerializer.getEntry(requiresShipping));
        joiner.add("restockable: " + GraphQLRequestSerializer.getEntry(restockable));
        if (sku != null) {
            joiner.add("sku: " + GraphQLRequestSerializer.getEntry(sku));
        }
        joiner.add("taxable: " + GraphQLRequestSerializer.getEntry(taxable));
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        joiner.add("unfulfilledQuantity: " + GraphQLRequestSerializer.getEntry(unfulfilledQuantity));
        if (variant != null) {
            joiner.add("variant: " + GraphQLRequestSerializer.getEntry(variant));
        }
        if (variantTitle != null) {
            joiner.add("variantTitle: " + GraphQLRequestSerializer.getEntry(variantTitle));
        }
        if (vendor != null) {
            joiner.add("vendor: " + GraphQLRequestSerializer.getEntry(vendor));
        }
        return joiner.toString();
    }

    public static LineItemTO.Builder builder() {
        return new LineItemTO.Builder();
    }

    public static class Builder {

        private int fulfillableQuantity;
        private FulfillmentServiceTO fulfillmentService;
        private String fulfillmentStatus;
        private String id;
        private ImageTO image;
        private boolean merchantEditable;
        private String name;
        private int nonFulfillableQuantity;
        private ProductTO product;
        private int quantity;
        private int refundableQuantity;
        private boolean requiresShipping;
        private boolean restockable;
        private String sku;
        private boolean taxable;
        private String title;
        private int unfulfilledQuantity;
        private ProductVariantTO variant;
        private String variantTitle;
        private String vendor;

        public Builder() {
        }

        public Builder setFulfillableQuantity(int fulfillableQuantity) {
            this.fulfillableQuantity = fulfillableQuantity;
            return this;
        }

        public Builder setFulfillmentService(FulfillmentServiceTO fulfillmentService) {
            this.fulfillmentService = fulfillmentService;
            return this;
        }

        public Builder setFulfillmentStatus(String fulfillmentStatus) {
            this.fulfillmentStatus = fulfillmentStatus;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImage(ImageTO image) {
            this.image = image;
            return this;
        }

        public Builder setMerchantEditable(boolean merchantEditable) {
            this.merchantEditable = merchantEditable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNonFulfillableQuantity(int nonFulfillableQuantity) {
            this.nonFulfillableQuantity = nonFulfillableQuantity;
            return this;
        }

        public Builder setProduct(ProductTO product) {
            this.product = product;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setRefundableQuantity(int refundableQuantity) {
            this.refundableQuantity = refundableQuantity;
            return this;
        }

        public Builder setRequiresShipping(boolean requiresShipping) {
            this.requiresShipping = requiresShipping;
            return this;
        }

        public Builder setRestockable(boolean restockable) {
            this.restockable = restockable;
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTaxable(boolean taxable) {
            this.taxable = taxable;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setUnfulfilledQuantity(int unfulfilledQuantity) {
            this.unfulfilledQuantity = unfulfilledQuantity;
            return this;
        }

        public Builder setVariant(ProductVariantTO variant) {
            this.variant = variant;
            return this;
        }

        public Builder setVariantTitle(String variantTitle) {
            this.variantTitle = variantTitle;
            return this;
        }

        public Builder setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }


        public LineItemTO build() {
            return new LineItemTO(fulfillableQuantity, fulfillmentService, fulfillmentStatus, id, image, merchantEditable, name, nonFulfillableQuantity, product, quantity, refundableQuantity, requiresShipping, restockable, sku, taxable, title, unfulfilledQuantity, variant, variantTitle, vendor);
        }

    }
}
