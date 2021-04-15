package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class FulfillmentTrackingInfoTO implements java.io.Serializable {

    private String company;
    private String number;
    private String url;

    public FulfillmentTrackingInfoTO() {
    }

    public FulfillmentTrackingInfoTO(String company, String number, String url) {
        this.company = company;
        this.number = number;
        this.url = url;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (company != null) {
            joiner.add("company: " + GraphQLRequestSerializer.getEntry(company));
        }
        if (number != null) {
            joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static FulfillmentTrackingInfoTO.Builder builder() {
        return new FulfillmentTrackingInfoTO.Builder();
    }

    public static class Builder {

        private String company;
        private String number;
        private String url;

        public Builder() {
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public FulfillmentTrackingInfoTO build() {
            return new FulfillmentTrackingInfoTO(company, number, url);
        }

    }
}
