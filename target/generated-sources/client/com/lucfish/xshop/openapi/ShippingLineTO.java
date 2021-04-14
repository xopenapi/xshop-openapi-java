package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ShippingLineTO implements java.io.Serializable {

    private String carrierIdentifier;
    private String code;
    private boolean custom;
    private String deliveryCategory;
    @javax.validation.constraints.NotNull
    private java.util.List<DiscountAllocationTO> discountAllocations;
    @javax.validation.constraints.NotNull
    private MoneyBagTO discountedPriceSet;
    private String id;
    @javax.validation.constraints.NotNull
    private MoneyBagTO originalPriceSet;
    private String phone;
    private FulfillmentServiceTO requestedFulfillmentService;
    private String shippingRateHandle;
    private String source;
    @javax.validation.constraints.NotNull
    private java.util.List<TaxLineTO> taxLines;
    @javax.validation.constraints.NotNull
    private String title;

    public ShippingLineTO() {
    }

    public ShippingLineTO(String carrierIdentifier, String code, boolean custom, String deliveryCategory, java.util.List<DiscountAllocationTO> discountAllocations, MoneyBagTO discountedPriceSet, String id, MoneyBagTO originalPriceSet, String phone, FulfillmentServiceTO requestedFulfillmentService, String shippingRateHandle, String source, java.util.List<TaxLineTO> taxLines, String title) {
        this.carrierIdentifier = carrierIdentifier;
        this.code = code;
        this.custom = custom;
        this.deliveryCategory = deliveryCategory;
        this.discountAllocations = discountAllocations;
        this.discountedPriceSet = discountedPriceSet;
        this.id = id;
        this.originalPriceSet = originalPriceSet;
        this.phone = phone;
        this.requestedFulfillmentService = requestedFulfillmentService;
        this.shippingRateHandle = shippingRateHandle;
        this.source = source;
        this.taxLines = taxLines;
        this.title = title;
    }

    public String getCarrierIdentifier() {
        return carrierIdentifier;
    }
    public void setCarrierIdentifier(String carrierIdentifier) {
        this.carrierIdentifier = carrierIdentifier;
    }

    /**
     * A reference to the carrier service that provided the rate. Present when the rate was computed by a third-party carrier service.
     */
    public String getCode() {
        return code;
    }
    /**
     * A reference to the carrier service that provided the rate. Present when the rate was computed by a third-party carrier service.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * A reference to the shipping method.
     */
    public boolean getCustom() {
        return custom;
    }
    /**
     * A reference to the shipping method.
     */
    public void setCustom(boolean custom) {
        this.custom = custom;
    }

    /**
     * Whether the shipping line is custom or not.
     */
    public String getDeliveryCategory() {
        return deliveryCategory;
    }
    /**
     * Whether the shipping line is custom or not.
     */
    public void setDeliveryCategory(String deliveryCategory) {
        this.deliveryCategory = deliveryCategory;
    }

    /**
     * The general classification of the delivery method.
     */
    public java.util.List<DiscountAllocationTO> getDiscountAllocations() {
        return discountAllocations;
    }
    /**
     * The general classification of the delivery method.
     */
    public void setDiscountAllocations(java.util.List<DiscountAllocationTO> discountAllocations) {
        this.discountAllocations = discountAllocations;
    }

    /**
     * The discounts that have been allocated to the shipping line.
     */
    public MoneyBagTO getDiscountedPriceSet() {
        return discountedPriceSet;
    }
    /**
     * The discounts that have been allocated to the shipping line.
     */
    public void setDiscountedPriceSet(MoneyBagTO discountedPriceSet) {
        this.discountedPriceSet = discountedPriceSet;
    }

    /**
     * The pre-tax shipping price with discounts applied.
     */
    public String getId() {
        return id;
    }
    /**
     * The pre-tax shipping price with discounts applied.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Globally unique identifier.
     */
    public MoneyBagTO getOriginalPriceSet() {
        return originalPriceSet;
    }
    /**
     * Globally unique identifier.
     */
    public void setOriginalPriceSet(MoneyBagTO originalPriceSet) {
        this.originalPriceSet = originalPriceSet;
    }

    /**
     * The pre-tax shipping price without any discounts applied.
     */
    public String getPhone() {
        return phone;
    }
    /**
     * The pre-tax shipping price without any discounts applied.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * The phone number at the shipping address.
     */
    public FulfillmentServiceTO getRequestedFulfillmentService() {
        return requestedFulfillmentService;
    }
    /**
     * The phone number at the shipping address.
     */
    public void setRequestedFulfillmentService(FulfillmentServiceTO requestedFulfillmentService) {
        this.requestedFulfillmentService = requestedFulfillmentService;
    }

    /**
     * The fulfillment service requested for the shipping method. Present if the shipping method requires processing by a third party fulfillment service.
     */
    public String getShippingRateHandle() {
        return shippingRateHandle;
    }
    /**
     * The fulfillment service requested for the shipping method. Present if the shipping method requires processing by a third party fulfillment service.
     */
    public void setShippingRateHandle(String shippingRateHandle) {
        this.shippingRateHandle = shippingRateHandle;
    }

    /**
     * A unique identifier for the shipping rate. The format can change without notice and is not meant to be shown to users.
     */
    public String getSource() {
        return source;
    }
    /**
     * A unique identifier for the shipping rate. The format can change without notice and is not meant to be shown to users.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Returns the rate source for the shipping line.
     */
    public java.util.List<TaxLineTO> getTaxLines() {
        return taxLines;
    }
    /**
     * Returns the rate source for the shipping line.
     */
    public void setTaxLines(java.util.List<TaxLineTO> taxLines) {
        this.taxLines = taxLines;
    }

    /**
     * The TaxLine objects connected to this shipping line.
     */
    public String getTitle() {
        return title;
    }
    /**
     * The TaxLine objects connected to this shipping line.
     */
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (carrierIdentifier != null) {
            joiner.add("carrierIdentifier: " + GraphQLRequestSerializer.getEntry(carrierIdentifier));
        }
        if (code != null) {
            joiner.add("code: " + GraphQLRequestSerializer.getEntry(code));
        }
        joiner.add("custom: " + GraphQLRequestSerializer.getEntry(custom));
        if (deliveryCategory != null) {
            joiner.add("deliveryCategory: " + GraphQLRequestSerializer.getEntry(deliveryCategory));
        }
        if (discountAllocations != null) {
            joiner.add("discountAllocations: " + GraphQLRequestSerializer.getEntry(discountAllocations));
        }
        if (discountedPriceSet != null) {
            joiner.add("discountedPriceSet: " + GraphQLRequestSerializer.getEntry(discountedPriceSet));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (originalPriceSet != null) {
            joiner.add("originalPriceSet: " + GraphQLRequestSerializer.getEntry(originalPriceSet));
        }
        if (phone != null) {
            joiner.add("phone: " + GraphQLRequestSerializer.getEntry(phone));
        }
        if (requestedFulfillmentService != null) {
            joiner.add("requestedFulfillmentService: " + GraphQLRequestSerializer.getEntry(requestedFulfillmentService));
        }
        if (shippingRateHandle != null) {
            joiner.add("shippingRateHandle: " + GraphQLRequestSerializer.getEntry(shippingRateHandle));
        }
        if (source != null) {
            joiner.add("source: " + GraphQLRequestSerializer.getEntry(source));
        }
        if (taxLines != null) {
            joiner.add("taxLines: " + GraphQLRequestSerializer.getEntry(taxLines));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static ShippingLineTO.Builder builder() {
        return new ShippingLineTO.Builder();
    }

    public static class Builder {

        private String carrierIdentifier;
        private String code;
        private boolean custom;
        private String deliveryCategory;
        private java.util.List<DiscountAllocationTO> discountAllocations;
        private MoneyBagTO discountedPriceSet;
        private String id;
        private MoneyBagTO originalPriceSet;
        private String phone;
        private FulfillmentServiceTO requestedFulfillmentService;
        private String shippingRateHandle;
        private String source;
        private java.util.List<TaxLineTO> taxLines;
        private String title;

        public Builder() {
        }

        public Builder setCarrierIdentifier(String carrierIdentifier) {
            this.carrierIdentifier = carrierIdentifier;
            return this;
        }

        /**
         * A reference to the carrier service that provided the rate. Present when the rate was computed by a third-party carrier service.
         */
        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        /**
         * A reference to the shipping method.
         */
        public Builder setCustom(boolean custom) {
            this.custom = custom;
            return this;
        }

        /**
         * Whether the shipping line is custom or not.
         */
        public Builder setDeliveryCategory(String deliveryCategory) {
            this.deliveryCategory = deliveryCategory;
            return this;
        }

        /**
         * The general classification of the delivery method.
         */
        public Builder setDiscountAllocations(java.util.List<DiscountAllocationTO> discountAllocations) {
            this.discountAllocations = discountAllocations;
            return this;
        }

        /**
         * The discounts that have been allocated to the shipping line.
         */
        public Builder setDiscountedPriceSet(MoneyBagTO discountedPriceSet) {
            this.discountedPriceSet = discountedPriceSet;
            return this;
        }

        /**
         * The pre-tax shipping price with discounts applied.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Globally unique identifier.
         */
        public Builder setOriginalPriceSet(MoneyBagTO originalPriceSet) {
            this.originalPriceSet = originalPriceSet;
            return this;
        }

        /**
         * The pre-tax shipping price without any discounts applied.
         */
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * The phone number at the shipping address.
         */
        public Builder setRequestedFulfillmentService(FulfillmentServiceTO requestedFulfillmentService) {
            this.requestedFulfillmentService = requestedFulfillmentService;
            return this;
        }

        /**
         * The fulfillment service requested for the shipping method. Present if the shipping method requires processing by a third party fulfillment service.
         */
        public Builder setShippingRateHandle(String shippingRateHandle) {
            this.shippingRateHandle = shippingRateHandle;
            return this;
        }

        /**
         * A unique identifier for the shipping rate. The format can change without notice and is not meant to be shown to users.
         */
        public Builder setSource(String source) {
            this.source = source;
            return this;
        }

        /**
         * Returns the rate source for the shipping line.
         */
        public Builder setTaxLines(java.util.List<TaxLineTO> taxLines) {
            this.taxLines = taxLines;
            return this;
        }

        /**
         * The TaxLine objects connected to this shipping line.
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public ShippingLineTO build() {
            return new ShippingLineTO(carrierIdentifier, code, custom, deliveryCategory, discountAllocations, discountedPriceSet, id, originalPriceSet, phone, requestedFulfillmentService, shippingRateHandle, source, taxLines, title);
        }

    }
}
