package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderTransactionInputTO implements java.io.Serializable {

    private double amount;
    @javax.validation.constraints.NotNull
    private String gateway;
    @javax.validation.constraints.NotNull
    private OrderTransactionKindTO kind;
    @javax.validation.constraints.NotNull
    private String orderId;
    private String parentId;

    public OrderTransactionInputTO() {
    }

    public OrderTransactionInputTO(double amount, String gateway, OrderTransactionKindTO kind, String orderId, String parentId) {
        this.amount = amount;
        this.gateway = gateway;
        this.kind = kind;
        this.orderId = orderId;
        this.parentId = parentId;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getGateway() {
        return gateway;
    }
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public OrderTransactionKindTO getKind() {
        return kind;
    }
    public void setKind(OrderTransactionKindTO kind) {
        this.kind = kind;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("amount: " + GraphQLRequestSerializer.getEntry(amount));
        if (gateway != null) {
            joiner.add("gateway: " + GraphQLRequestSerializer.getEntry(gateway));
        }
        if (kind != null) {
            joiner.add("kind: " + GraphQLRequestSerializer.getEntry(kind));
        }
        if (orderId != null) {
            joiner.add("orderId: " + GraphQLRequestSerializer.getEntry(orderId));
        }
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        return joiner.toString();
    }

    public static OrderTransactionInputTO.Builder builder() {
        return new OrderTransactionInputTO.Builder();
    }

    public static class Builder {

        private double amount;
        private String gateway;
        private OrderTransactionKindTO kind;
        private String orderId;
        private String parentId;

        public Builder() {
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder setKind(OrderTransactionKindTO kind) {
            this.kind = kind;
            return this;
        }

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        public OrderTransactionInputTO build() {
            return new OrderTransactionInputTO(amount, gateway, kind, orderId, parentId);
        }

    }
}
