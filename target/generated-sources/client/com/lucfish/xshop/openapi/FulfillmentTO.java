package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class FulfillmentTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private FulfillmentDisplayStatusTO displayStatus;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    private java.util.Date deliveredAt;
    private java.util.Date inTransitAt;
    private java.util.Date estimatedDeliveryAt;
    private FulfillmentServiceTO service;
    private LocationTO location;
    private boolean requiresShipping;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private OrderTO order;
    @javax.validation.constraints.NotNull
    private FulfillmentStatusTO status;
    private int totalQuantity;
    @javax.validation.constraints.NotNull
    private java.util.List<FulfillmentTrackingInfoTO> trackingInfo;

    public FulfillmentTO() {
    }

    public FulfillmentTO(String id, FulfillmentDisplayStatusTO displayStatus, java.util.Date createdAt, java.util.Date updatedAt, java.util.Date deliveredAt, java.util.Date inTransitAt, java.util.Date estimatedDeliveryAt, FulfillmentServiceTO service, LocationTO location, boolean requiresShipping, String name, OrderTO order, FulfillmentStatusTO status, int totalQuantity, java.util.List<FulfillmentTrackingInfoTO> trackingInfo) {
        this.id = id;
        this.displayStatus = displayStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deliveredAt = deliveredAt;
        this.inTransitAt = inTransitAt;
        this.estimatedDeliveryAt = estimatedDeliveryAt;
        this.service = service;
        this.location = location;
        this.requiresShipping = requiresShipping;
        this.name = name;
        this.order = order;
        this.status = status;
        this.totalQuantity = totalQuantity;
        this.trackingInfo = trackingInfo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public FulfillmentDisplayStatusTO getDisplayStatus() {
        return displayStatus;
    }
    public void setDisplayStatus(FulfillmentDisplayStatusTO displayStatus) {
        this.displayStatus = displayStatus;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public java.util.Date getDeliveredAt() {
        return deliveredAt;
    }
    public void setDeliveredAt(java.util.Date deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public java.util.Date getInTransitAt() {
        return inTransitAt;
    }
    public void setInTransitAt(java.util.Date inTransitAt) {
        this.inTransitAt = inTransitAt;
    }

    public java.util.Date getEstimatedDeliveryAt() {
        return estimatedDeliveryAt;
    }
    public void setEstimatedDeliveryAt(java.util.Date estimatedDeliveryAt) {
        this.estimatedDeliveryAt = estimatedDeliveryAt;
    }

    public FulfillmentServiceTO getService() {
        return service;
    }
    public void setService(FulfillmentServiceTO service) {
        this.service = service;
    }

    public LocationTO getLocation() {
        return location;
    }
    public void setLocation(LocationTO location) {
        this.location = location;
    }

    public boolean getRequiresShipping() {
        return requiresShipping;
    }
    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public OrderTO getOrder() {
        return order;
    }
    public void setOrder(OrderTO order) {
        this.order = order;
    }

    public FulfillmentStatusTO getStatus() {
        return status;
    }
    public void setStatus(FulfillmentStatusTO status) {
        this.status = status;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }
    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public java.util.List<FulfillmentTrackingInfoTO> getTrackingInfo() {
        return trackingInfo;
    }
    public void setTrackingInfo(java.util.List<FulfillmentTrackingInfoTO> trackingInfo) {
        this.trackingInfo = trackingInfo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (displayStatus != null) {
            joiner.add("displayStatus: " + GraphQLRequestSerializer.getEntry(displayStatus));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (deliveredAt != null) {
            joiner.add("deliveredAt: " + GraphQLRequestSerializer.getEntry(deliveredAt));
        }
        if (inTransitAt != null) {
            joiner.add("inTransitAt: " + GraphQLRequestSerializer.getEntry(inTransitAt));
        }
        if (estimatedDeliveryAt != null) {
            joiner.add("estimatedDeliveryAt: " + GraphQLRequestSerializer.getEntry(estimatedDeliveryAt));
        }
        if (service != null) {
            joiner.add("service: " + GraphQLRequestSerializer.getEntry(service));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        joiner.add("requiresShipping: " + GraphQLRequestSerializer.getEntry(requiresShipping));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (order != null) {
            joiner.add("order: " + GraphQLRequestSerializer.getEntry(order));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        joiner.add("totalQuantity: " + GraphQLRequestSerializer.getEntry(totalQuantity));
        if (trackingInfo != null) {
            joiner.add("trackingInfo: " + GraphQLRequestSerializer.getEntry(trackingInfo));
        }
        return joiner.toString();
    }

    public static FulfillmentTO.Builder builder() {
        return new FulfillmentTO.Builder();
    }

    public static class Builder {

        private String id;
        private FulfillmentDisplayStatusTO displayStatus;
        private java.util.Date createdAt;
        private java.util.Date updatedAt;
        private java.util.Date deliveredAt;
        private java.util.Date inTransitAt;
        private java.util.Date estimatedDeliveryAt;
        private FulfillmentServiceTO service;
        private LocationTO location;
        private boolean requiresShipping;
        private String name;
        private OrderTO order;
        private FulfillmentStatusTO status;
        private int totalQuantity;
        private java.util.List<FulfillmentTrackingInfoTO> trackingInfo;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDisplayStatus(FulfillmentDisplayStatusTO displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.util.Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setDeliveredAt(java.util.Date deliveredAt) {
            this.deliveredAt = deliveredAt;
            return this;
        }

        public Builder setInTransitAt(java.util.Date inTransitAt) {
            this.inTransitAt = inTransitAt;
            return this;
        }

        public Builder setEstimatedDeliveryAt(java.util.Date estimatedDeliveryAt) {
            this.estimatedDeliveryAt = estimatedDeliveryAt;
            return this;
        }

        public Builder setService(FulfillmentServiceTO service) {
            this.service = service;
            return this;
        }

        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        public Builder setRequiresShipping(boolean requiresShipping) {
            this.requiresShipping = requiresShipping;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOrder(OrderTO order) {
            this.order = order;
            return this;
        }

        public Builder setStatus(FulfillmentStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setTotalQuantity(int totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }

        public Builder setTrackingInfo(java.util.List<FulfillmentTrackingInfoTO> trackingInfo) {
            this.trackingInfo = trackingInfo;
            return this;
        }


        public FulfillmentTO build() {
            return new FulfillmentTO(id, displayStatus, createdAt, updatedAt, deliveredAt, inTransitAt, estimatedDeliveryAt, service, location, requiresShipping, name, order, status, totalQuantity, trackingInfo);
        }

    }
}
