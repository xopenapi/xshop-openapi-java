package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class LocationAddressTO implements java.io.Serializable {

    private String address1;
    private String address2;
    private String city;
    private String country;
    private String countryCode;
    @javax.validation.constraints.NotNull
    private java.util.List<String> formatted;
    private Double latitude;
    private Double longitude;
    private String phone;
    private String province;
    private String provinceCode;
    private String zip;

    public LocationAddressTO() {
    }

    public LocationAddressTO(String address1, String address2, String city, String country, String countryCode, java.util.List<String> formatted, Double latitude, Double longitude, String phone, String province, String provinceCode, String zip) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.formatted = formatted;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phone = phone;
        this.province = province;
        this.provinceCode = provinceCode;
        this.zip = zip;
    }

    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public java.util.List<String> getFormatted() {
        return formatted;
    }
    public void setFormatted(java.util.List<String> formatted) {
        this.formatted = formatted;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (address1 != null) {
            joiner.add("address1: " + GraphQLRequestSerializer.getEntry(address1));
        }
        if (address2 != null) {
            joiner.add("address2: " + GraphQLRequestSerializer.getEntry(address2));
        }
        if (city != null) {
            joiner.add("city: " + GraphQLRequestSerializer.getEntry(city));
        }
        if (country != null) {
            joiner.add("country: " + GraphQLRequestSerializer.getEntry(country));
        }
        if (countryCode != null) {
            joiner.add("countryCode: " + GraphQLRequestSerializer.getEntry(countryCode));
        }
        if (formatted != null) {
            joiner.add("formatted: " + GraphQLRequestSerializer.getEntry(formatted));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (phone != null) {
            joiner.add("phone: " + GraphQLRequestSerializer.getEntry(phone));
        }
        if (province != null) {
            joiner.add("province: " + GraphQLRequestSerializer.getEntry(province));
        }
        if (provinceCode != null) {
            joiner.add("provinceCode: " + GraphQLRequestSerializer.getEntry(provinceCode));
        }
        if (zip != null) {
            joiner.add("zip: " + GraphQLRequestSerializer.getEntry(zip));
        }
        return joiner.toString();
    }

    public static LocationAddressTO.Builder builder() {
        return new LocationAddressTO.Builder();
    }

    public static class Builder {

        private String address1;
        private String address2;
        private String city;
        private String country;
        private String countryCode;
        private java.util.List<String> formatted;
        private Double latitude;
        private Double longitude;
        private String phone;
        private String province;
        private String provinceCode;
        private String zip;

        public Builder() {
        }

        public Builder setAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setFormatted(java.util.List<String> formatted) {
            this.formatted = formatted;
            return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }

        public Builder setZip(String zip) {
            this.zip = zip;
            return this;
        }


        public LocationAddressTO build() {
            return new LocationAddressTO(address1, address2, city, country, countryCode, formatted, latitude, longitude, phone, province, provinceCode, zip);
        }

    }
}
