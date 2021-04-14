package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CountryHarmonizedSystemCodeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private CountryCodeTO countryCode;
    @javax.validation.constraints.NotNull
    private String harmonizedSystemCode;

    public CountryHarmonizedSystemCodeTO() {
    }

    public CountryHarmonizedSystemCodeTO(CountryCodeTO countryCode, String harmonizedSystemCode) {
        this.countryCode = countryCode;
        this.harmonizedSystemCode = harmonizedSystemCode;
    }

    public CountryCodeTO getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(CountryCodeTO countryCode) {
        this.countryCode = countryCode;
    }

    public String getHarmonizedSystemCode() {
        return harmonizedSystemCode;
    }
    public void setHarmonizedSystemCode(String harmonizedSystemCode) {
        this.harmonizedSystemCode = harmonizedSystemCode;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (countryCode != null) {
            joiner.add("countryCode: " + GraphQLRequestSerializer.getEntry(countryCode));
        }
        if (harmonizedSystemCode != null) {
            joiner.add("harmonizedSystemCode: " + GraphQLRequestSerializer.getEntry(harmonizedSystemCode));
        }
        return joiner.toString();
    }

    public static CountryHarmonizedSystemCodeTO.Builder builder() {
        return new CountryHarmonizedSystemCodeTO.Builder();
    }

    public static class Builder {

        private CountryCodeTO countryCode;
        private String harmonizedSystemCode;

        public Builder() {
        }

        public Builder setCountryCode(CountryCodeTO countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setHarmonizedSystemCode(String harmonizedSystemCode) {
            this.harmonizedSystemCode = harmonizedSystemCode;
            return this;
        }


        public CountryHarmonizedSystemCodeTO build() {
            return new CountryHarmonizedSystemCodeTO(countryCode, harmonizedSystemCode);
        }

    }
}
