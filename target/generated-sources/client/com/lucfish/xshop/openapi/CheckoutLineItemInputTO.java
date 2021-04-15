package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CheckoutLineItemInputTO implements java.io.Serializable {

    private int quantity;
    @javax.validation.constraints.NotNull
    private String variantId;

    public CheckoutLineItemInputTO() {
    }

    public CheckoutLineItemInputTO(int quantity, String variantId) {
        this.quantity = quantity;
        this.variantId = variantId;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVariantId() {
        return variantId;
    }
    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("quantity: " + GraphQLRequestSerializer.getEntry(quantity));
        if (variantId != null) {
            joiner.add("variantId: " + GraphQLRequestSerializer.getEntry(variantId));
        }
        return joiner.toString();
    }

    public static CheckoutLineItemInputTO.Builder builder() {
        return new CheckoutLineItemInputTO.Builder();
    }

    public static class Builder {

        private int quantity;
        private String variantId;

        public Builder() {
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setVariantId(String variantId) {
            this.variantId = variantId;
            return this;
        }


        public CheckoutLineItemInputTO build() {
            return new CheckoutLineItemInputTO(quantity, variantId);
        }

    }
}
