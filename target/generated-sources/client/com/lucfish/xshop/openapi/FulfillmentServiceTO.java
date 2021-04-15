package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class FulfillmentServiceTO implements java.io.Serializable {

    private String callbackUrl;
    private boolean fulfillmentOrdersOptIn;
    @javax.validation.constraints.NotNull
    private String handle;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean inventoryManagement;
    private LocationTO location;
    private boolean productBased;
    @javax.validation.constraints.NotNull
    private String serviceName;
    @javax.validation.constraints.NotNull
    private java.util.List<ShippingMethodTO> shippingMethods;
    @javax.validation.constraints.NotNull
    private FulfillmentServiceTypeTO type;

    public FulfillmentServiceTO() {
    }

    public FulfillmentServiceTO(String callbackUrl, boolean fulfillmentOrdersOptIn, String handle, String id, boolean inventoryManagement, LocationTO location, boolean productBased, String serviceName, java.util.List<ShippingMethodTO> shippingMethods, FulfillmentServiceTypeTO type) {
        this.callbackUrl = callbackUrl;
        this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
        this.handle = handle;
        this.id = id;
        this.inventoryManagement = inventoryManagement;
        this.location = location;
        this.productBased = productBased;
        this.serviceName = serviceName;
        this.shippingMethods = shippingMethods;
        this.type = type;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public boolean getFulfillmentOrdersOptIn() {
        return fulfillmentOrdersOptIn;
    }
    public void setFulfillmentOrdersOptIn(boolean fulfillmentOrdersOptIn) {
        this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
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

    public boolean getInventoryManagement() {
        return inventoryManagement;
    }
    public void setInventoryManagement(boolean inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public LocationTO getLocation() {
        return location;
    }
    public void setLocation(LocationTO location) {
        this.location = location;
    }

    public boolean getProductBased() {
        return productBased;
    }
    public void setProductBased(boolean productBased) {
        this.productBased = productBased;
    }

    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public java.util.List<ShippingMethodTO> getShippingMethods() {
        return shippingMethods;
    }
    public void setShippingMethods(java.util.List<ShippingMethodTO> shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public FulfillmentServiceTypeTO getType() {
        return type;
    }
    public void setType(FulfillmentServiceTypeTO type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (callbackUrl != null) {
            joiner.add("callbackUrl: " + GraphQLRequestSerializer.getEntry(callbackUrl));
        }
        joiner.add("fulfillmentOrdersOptIn: " + GraphQLRequestSerializer.getEntry(fulfillmentOrdersOptIn));
        if (handle != null) {
            joiner.add("handle: " + GraphQLRequestSerializer.getEntry(handle));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("inventoryManagement: " + GraphQLRequestSerializer.getEntry(inventoryManagement));
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        joiner.add("productBased: " + GraphQLRequestSerializer.getEntry(productBased));
        if (serviceName != null) {
            joiner.add("serviceName: " + GraphQLRequestSerializer.getEntry(serviceName));
        }
        if (shippingMethods != null) {
            joiner.add("shippingMethods: " + GraphQLRequestSerializer.getEntry(shippingMethods));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

    public static FulfillmentServiceTO.Builder builder() {
        return new FulfillmentServiceTO.Builder();
    }

    public static class Builder {

        private String callbackUrl;
        private boolean fulfillmentOrdersOptIn;
        private String handle;
        private String id;
        private boolean inventoryManagement;
        private LocationTO location;
        private boolean productBased;
        private String serviceName;
        private java.util.List<ShippingMethodTO> shippingMethods;
        private FulfillmentServiceTypeTO type;

        public Builder() {
        }

        public Builder setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public Builder setFulfillmentOrdersOptIn(boolean fulfillmentOrdersOptIn) {
            this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
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

        public Builder setInventoryManagement(boolean inventoryManagement) {
            this.inventoryManagement = inventoryManagement;
            return this;
        }

        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        public Builder setProductBased(boolean productBased) {
            this.productBased = productBased;
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setShippingMethods(java.util.List<ShippingMethodTO> shippingMethods) {
            this.shippingMethods = shippingMethods;
            return this;
        }

        public Builder setType(FulfillmentServiceTypeTO type) {
            this.type = type;
            return this;
        }


        public FulfillmentServiceTO build() {
            return new FulfillmentServiceTO(callbackUrl, fulfillmentOrdersOptIn, handle, id, inventoryManagement, location, productBased, serviceName, shippingMethods, type);
        }

    }
}
