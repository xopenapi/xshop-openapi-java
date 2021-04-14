package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CustomerTO implements java.io.Serializable, NodeTO, HasMetafieldsTO, HasEventsTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private EventConnectionTO events;
    @javax.validation.constraints.NotNull
    private MetafieldConnectionTO metafields;
    private MetafieldTO metafield;
    @javax.validation.constraints.NotNull
    private MetafieldConnectionTO privateMetafields;
    private MetafieldTO privateMetafield;
    @javax.validation.constraints.NotNull
    private OrderConnectionTO orders;
    @javax.validation.constraints.NotNull
    private CustomerPaymentMethodConnectionTO paymentMethods;
    @javax.validation.constraints.NotNull
    private java.util.List<TagTO> tags;
    private OrderTO lastOrder;
    private String note;
    @javax.validation.constraints.NotNull
    private String ordersCount;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public CustomerTO() {
    }

    public CustomerTO(String id, EventConnectionTO events, MetafieldConnectionTO metafields, MetafieldTO metafield, MetafieldConnectionTO privateMetafields, MetafieldTO privateMetafield, OrderConnectionTO orders, CustomerPaymentMethodConnectionTO paymentMethods, java.util.List<TagTO> tags, OrderTO lastOrder, String note, String ordersCount, java.util.Date createdAt, java.util.Date updatedAt) {
        this.id = id;
        this.events = events;
        this.metafields = metafields;
        this.metafield = metafield;
        this.privateMetafields = privateMetafields;
        this.privateMetafield = privateMetafield;
        this.orders = orders;
        this.paymentMethods = paymentMethods;
        this.tags = tags;
        this.lastOrder = lastOrder;
        this.note = note;
        this.ordersCount = ordersCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public EventConnectionTO getEvents() {
        return events;
    }
    public void setEvents(EventConnectionTO events) {
        this.events = events;
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

    public OrderConnectionTO getOrders() {
        return orders;
    }
    public void setOrders(OrderConnectionTO orders) {
        this.orders = orders;
    }

    public CustomerPaymentMethodConnectionTO getPaymentMethods() {
        return paymentMethods;
    }
    public void setPaymentMethods(CustomerPaymentMethodConnectionTO paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public java.util.List<TagTO> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagTO> tags) {
        this.tags = tags;
    }

    public OrderTO getLastOrder() {
        return lastOrder;
    }
    public void setLastOrder(OrderTO lastOrder) {
        this.lastOrder = lastOrder;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getOrdersCount() {
        return ordersCount;
    }
    public void setOrdersCount(String ordersCount) {
        this.ordersCount = ordersCount;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (events != null) {
            joiner.add("events: " + GraphQLRequestSerializer.getEntry(events));
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
        if (orders != null) {
            joiner.add("orders: " + GraphQLRequestSerializer.getEntry(orders));
        }
        if (paymentMethods != null) {
            joiner.add("paymentMethods: " + GraphQLRequestSerializer.getEntry(paymentMethods));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (lastOrder != null) {
            joiner.add("lastOrder: " + GraphQLRequestSerializer.getEntry(lastOrder));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (ordersCount != null) {
            joiner.add("ordersCount: " + GraphQLRequestSerializer.getEntry(ordersCount));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static CustomerTO.Builder builder() {
        return new CustomerTO.Builder();
    }

    public static class Builder {

        private String id;
        private EventConnectionTO events;
        private MetafieldConnectionTO metafields;
        private MetafieldTO metafield;
        private MetafieldConnectionTO privateMetafields;
        private MetafieldTO privateMetafield;
        private OrderConnectionTO orders;
        private CustomerPaymentMethodConnectionTO paymentMethods;
        private java.util.List<TagTO> tags;
        private OrderTO lastOrder;
        private String note;
        private String ordersCount;
        private java.util.Date createdAt;
        private java.util.Date updatedAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setEvents(EventConnectionTO events) {
            this.events = events;
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

        public Builder setOrders(OrderConnectionTO orders) {
            this.orders = orders;
            return this;
        }

        public Builder setPaymentMethods(CustomerPaymentMethodConnectionTO paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public Builder setTags(java.util.List<TagTO> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setLastOrder(OrderTO lastOrder) {
            this.lastOrder = lastOrder;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setOrdersCount(String ordersCount) {
            this.ordersCount = ordersCount;
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


        public CustomerTO build() {
            return new CustomerTO(id, events, metafields, metafield, privateMetafields, privateMetafield, orders, paymentMethods, tags, lastOrder, note, ordersCount, createdAt, updatedAt);
        }

    }
}
