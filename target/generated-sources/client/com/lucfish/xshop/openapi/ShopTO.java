package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ShopTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<ShopAlertTO> alerts;
    @javax.validation.constraints.NotNull
    private CurrencyCodeTO currencyCode;

    public ShopTO() {
    }

    public ShopTO(String id, java.util.List<ShopAlertTO> alerts, CurrencyCodeTO currencyCode) {
        this.id = id;
        this.alerts = alerts;
        this.currencyCode = currencyCode;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.List<ShopAlertTO> getAlerts() {
        return alerts;
    }
    public void setAlerts(java.util.List<ShopAlertTO> alerts) {
        this.alerts = alerts;
    }

    public CurrencyCodeTO getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(CurrencyCodeTO currencyCode) {
        this.currencyCode = currencyCode;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (alerts != null) {
            joiner.add("alerts: " + GraphQLRequestSerializer.getEntry(alerts));
        }
        if (currencyCode != null) {
            joiner.add("currencyCode: " + GraphQLRequestSerializer.getEntry(currencyCode));
        }
        return joiner.toString();
    }

    public static ShopTO.Builder builder() {
        return new ShopTO.Builder();
    }

    public static class Builder {

        private String id;
        private java.util.List<ShopAlertTO> alerts;
        private CurrencyCodeTO currencyCode;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAlerts(java.util.List<ShopAlertTO> alerts) {
            this.alerts = alerts;
            return this;
        }

        public Builder setCurrencyCode(CurrencyCodeTO currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }


        public ShopTO build() {
            return new ShopTO(id, alerts, currencyCode);
        }

    }
}
