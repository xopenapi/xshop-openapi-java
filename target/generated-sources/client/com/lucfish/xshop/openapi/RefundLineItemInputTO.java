package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class RefundLineItemInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String lineItemId;
    private String locationId;
    private int quantity;
    private RefundLineItemRestockTypeTO restockType;

    public RefundLineItemInputTO() {
    }

    public RefundLineItemInputTO(String lineItemId, String locationId, int quantity, RefundLineItemRestockTypeTO restockType) {
        this.lineItemId = lineItemId;
        this.locationId = locationId;
        this.quantity = quantity;
        this.restockType = restockType;
    }

    public String getLineItemId() {
        return lineItemId;
    }
    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public String getLocationId() {
        return locationId;
    }
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public RefundLineItemRestockTypeTO getRestockType() {
        return restockType;
    }
    public void setRestockType(RefundLineItemRestockTypeTO restockType) {
        this.restockType = restockType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (lineItemId != null) {
            joiner.add("lineItemId: " + GraphQLRequestSerializer.getEntry(lineItemId));
        }
        if (locationId != null) {
            joiner.add("locationId: " + GraphQLRequestSerializer.getEntry(locationId));
        }
        joiner.add("quantity: " + GraphQLRequestSerializer.getEntry(quantity));
        if (restockType != null) {
            joiner.add("restockType: " + GraphQLRequestSerializer.getEntry(restockType));
        }
        return joiner.toString();
    }

    public static RefundLineItemInputTO.Builder builder() {
        return new RefundLineItemInputTO.Builder();
    }

    public static class Builder {

        private String lineItemId;
        private String locationId;
        private int quantity;
        private RefundLineItemRestockTypeTO restockType;

        public Builder() {
        }

        public Builder setLineItemId(String lineItemId) {
            this.lineItemId = lineItemId;
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setRestockType(RefundLineItemRestockTypeTO restockType) {
            this.restockType = restockType;
            return this;
        }


        public RefundLineItemInputTO build() {
            return new RefundLineItemInputTO(lineItemId, locationId, quantity, restockType);
        }

    }
}
