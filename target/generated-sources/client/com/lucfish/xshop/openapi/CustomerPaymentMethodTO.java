package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CustomerPaymentMethodTO implements java.io.Serializable {

    private CustomerTO customer;
    @javax.validation.constraints.NotNull
    private String id;
    private CustomerPaymentInstrumentTO instrument;
    private java.util.Date revokedAt;

    public CustomerPaymentMethodTO() {
    }

    public CustomerPaymentMethodTO(CustomerTO customer, String id, CustomerPaymentInstrumentTO instrument, java.util.Date revokedAt) {
        this.customer = customer;
        this.id = id;
        this.instrument = instrument;
        this.revokedAt = revokedAt;
    }

    public CustomerTO getCustomer() {
        return customer;
    }
    public void setCustomer(CustomerTO customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public CustomerPaymentInstrumentTO getInstrument() {
        return instrument;
    }
    public void setInstrument(CustomerPaymentInstrumentTO instrument) {
        this.instrument = instrument;
    }

    public java.util.Date getRevokedAt() {
        return revokedAt;
    }
    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (customer != null) {
            joiner.add("customer: " + GraphQLRequestSerializer.getEntry(customer));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (instrument != null) {
            joiner.add("instrument: " + GraphQLRequestSerializer.getEntry(instrument));
        }
        if (revokedAt != null) {
            joiner.add("revokedAt: " + GraphQLRequestSerializer.getEntry(revokedAt));
        }
        return joiner.toString();
    }

    public static CustomerPaymentMethodTO.Builder builder() {
        return new CustomerPaymentMethodTO.Builder();
    }

    public static class Builder {

        private CustomerTO customer;
        private String id;
        private CustomerPaymentInstrumentTO instrument;
        private java.util.Date revokedAt;

        public Builder() {
        }

        public Builder setCustomer(CustomerTO customer) {
            this.customer = customer;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInstrument(CustomerPaymentInstrumentTO instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder setRevokedAt(java.util.Date revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }


        public CustomerPaymentMethodTO build() {
            return new CustomerPaymentMethodTO(customer, id, instrument, revokedAt);
        }

    }
}
