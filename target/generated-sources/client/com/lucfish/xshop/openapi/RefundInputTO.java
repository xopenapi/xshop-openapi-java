package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class RefundInputTO implements java.io.Serializable {

    private CurrencyCodeTO currency;
    private String note;
    private Boolean notify;
    @javax.validation.constraints.NotNull
    private String orderId;
    @javax.validation.constraints.NotNull
    private java.util.List<RefundLineItemInputTO> refundLineItems;
    private ShippingRefundInputTO shipping;
    @javax.validation.constraints.NotNull
    private java.util.List<OrderTransactionInputTO> transactions;

    public RefundInputTO() {
    }

    public RefundInputTO(CurrencyCodeTO currency, String note, Boolean notify, String orderId, java.util.List<RefundLineItemInputTO> refundLineItems, ShippingRefundInputTO shipping, java.util.List<OrderTransactionInputTO> transactions) {
        this.currency = currency;
        this.note = note;
        this.notify = notify;
        this.orderId = orderId;
        this.refundLineItems = refundLineItems;
        this.shipping = shipping;
        this.transactions = transactions;
    }

    public CurrencyCodeTO getCurrency() {
        return currency;
    }
    public void setCurrency(CurrencyCodeTO currency) {
        this.currency = currency;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getNotify() {
        return notify;
    }
    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public java.util.List<RefundLineItemInputTO> getRefundLineItems() {
        return refundLineItems;
    }
    public void setRefundLineItems(java.util.List<RefundLineItemInputTO> refundLineItems) {
        this.refundLineItems = refundLineItems;
    }

    public ShippingRefundInputTO getShipping() {
        return shipping;
    }
    public void setShipping(ShippingRefundInputTO shipping) {
        this.shipping = shipping;
    }

    public java.util.List<OrderTransactionInputTO> getTransactions() {
        return transactions;
    }
    public void setTransactions(java.util.List<OrderTransactionInputTO> transactions) {
        this.transactions = transactions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (currency != null) {
            joiner.add("currency: " + GraphQLRequestSerializer.getEntry(currency));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (notify != null) {
            joiner.add("notify: " + GraphQLRequestSerializer.getEntry(notify));
        }
        if (orderId != null) {
            joiner.add("orderId: " + GraphQLRequestSerializer.getEntry(orderId));
        }
        if (refundLineItems != null) {
            joiner.add("refundLineItems: " + GraphQLRequestSerializer.getEntry(refundLineItems));
        }
        if (shipping != null) {
            joiner.add("shipping: " + GraphQLRequestSerializer.getEntry(shipping));
        }
        if (transactions != null) {
            joiner.add("transactions: " + GraphQLRequestSerializer.getEntry(transactions));
        }
        return joiner.toString();
    }

    public static RefundInputTO.Builder builder() {
        return new RefundInputTO.Builder();
    }

    public static class Builder {

        private CurrencyCodeTO currency;
        private String note;
        private Boolean notify;
        private String orderId;
        private java.util.List<RefundLineItemInputTO> refundLineItems;
        private ShippingRefundInputTO shipping;
        private java.util.List<OrderTransactionInputTO> transactions;

        public Builder() {
        }

        public Builder setCurrency(CurrencyCodeTO currency) {
            this.currency = currency;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setNotify(Boolean notify) {
            this.notify = notify;
            return this;
        }

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setRefundLineItems(java.util.List<RefundLineItemInputTO> refundLineItems) {
            this.refundLineItems = refundLineItems;
            return this;
        }

        public Builder setShipping(ShippingRefundInputTO shipping) {
            this.shipping = shipping;
            return this;
        }

        public Builder setTransactions(java.util.List<OrderTransactionInputTO> transactions) {
            this.transactions = transactions;
            return this;
        }


        public RefundInputTO build() {
            return new RefundInputTO(currency, note, notify, orderId, refundLineItems, shipping, transactions);
        }

    }
}
