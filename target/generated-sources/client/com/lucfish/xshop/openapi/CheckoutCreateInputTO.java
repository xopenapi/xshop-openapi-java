package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutCreateInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<CheckoutLineItemInputTO> lineItems;
    private String note;
    private CurrencyCodeTO presentmentCurrencyCode;
    private String shippingAddressId;

    public CheckoutCreateInputTO() {
    }

    public CheckoutCreateInputTO(java.util.List<CheckoutLineItemInputTO> lineItems, String note, CurrencyCodeTO presentmentCurrencyCode, String shippingAddressId) {
        this.lineItems = lineItems;
        this.note = note;
        this.presentmentCurrencyCode = presentmentCurrencyCode;
        this.shippingAddressId = shippingAddressId;
    }

    public java.util.List<CheckoutLineItemInputTO> getLineItems() {
        return lineItems;
    }
    public void setLineItems(java.util.List<CheckoutLineItemInputTO> lineItems) {
        this.lineItems = lineItems;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public CurrencyCodeTO getPresentmentCurrencyCode() {
        return presentmentCurrencyCode;
    }
    public void setPresentmentCurrencyCode(CurrencyCodeTO presentmentCurrencyCode) {
        this.presentmentCurrencyCode = presentmentCurrencyCode;
    }

    public String getShippingAddressId() {
        return shippingAddressId;
    }
    public void setShippingAddressId(String shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (lineItems != null) {
            joiner.add("lineItems: " + GraphQLRequestSerializer.getEntry(lineItems));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (presentmentCurrencyCode != null) {
            joiner.add("presentmentCurrencyCode: " + GraphQLRequestSerializer.getEntry(presentmentCurrencyCode));
        }
        if (shippingAddressId != null) {
            joiner.add("shippingAddressId: " + GraphQLRequestSerializer.getEntry(shippingAddressId));
        }
        return joiner.toString();
    }

    public static CheckoutCreateInputTO.Builder builder() {
        return new CheckoutCreateInputTO.Builder();
    }

    public static class Builder {

        private java.util.List<CheckoutLineItemInputTO> lineItems;
        private String note;
        private CurrencyCodeTO presentmentCurrencyCode;
        private String shippingAddressId;

        public Builder() {
        }

        public Builder setLineItems(java.util.List<CheckoutLineItemInputTO> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setPresentmentCurrencyCode(CurrencyCodeTO presentmentCurrencyCode) {
            this.presentmentCurrencyCode = presentmentCurrencyCode;
            return this;
        }

        public Builder setShippingAddressId(String shippingAddressId) {
            this.shippingAddressId = shippingAddressId;
            return this;
        }


        public CheckoutCreateInputTO build() {
            return new CheckoutCreateInputTO(lineItems, note, presentmentCurrencyCode, shippingAddressId);
        }

    }
}
