package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CheckoutTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private OrderTO order;
    private String note;
    @javax.validation.constraints.NotNull
    private CheckoutLineItemConnectionTO lineItems;

    public CheckoutTO() {
    }

    public CheckoutTO(String id, OrderTO order, String note, CheckoutLineItemConnectionTO lineItems) {
        this.id = id;
        this.order = order;
        this.note = note;
        this.lineItems = lineItems;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OrderTO getOrder() {
        return order;
    }
    public void setOrder(OrderTO order) {
        this.order = order;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public CheckoutLineItemConnectionTO getLineItems() {
        return lineItems;
    }
    public void setLineItems(CheckoutLineItemConnectionTO lineItems) {
        this.lineItems = lineItems;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (order != null) {
            joiner.add("order: " + GraphQLRequestSerializer.getEntry(order));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (lineItems != null) {
            joiner.add("lineItems: " + GraphQLRequestSerializer.getEntry(lineItems));
        }
        return joiner.toString();
    }

    public static CheckoutTO.Builder builder() {
        return new CheckoutTO.Builder();
    }

    public static class Builder {

        private String id;
        private OrderTO order;
        private String note;
        private CheckoutLineItemConnectionTO lineItems;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setOrder(OrderTO order) {
            this.order = order;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setLineItems(CheckoutLineItemConnectionTO lineItems) {
            this.lineItems = lineItems;
            return this;
        }


        public CheckoutTO build() {
            return new CheckoutTO(id, order, note, lineItems);
        }

    }
}
