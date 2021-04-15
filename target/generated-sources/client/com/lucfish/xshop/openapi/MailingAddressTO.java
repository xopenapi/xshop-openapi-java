package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MailingAddressTO implements java.io.Serializable {

    private String address1;
    private String address2;
    private String city;
    private String company;
    private String country;
    private CountryCodeTO countryCode;
    private String firstName;
    @javax.validation.constraints.NotNull
    private java.util.List<String> formatted;
    private String formattedArea;
    @javax.validation.constraints.NotNull
    private String id;
    private String lastName;
    private Double latitude;
    private Double longitude;
    private String name;
    private String phone;
    private String province;
    private String provinceCode;
    private String zip;

    public MailingAddressTO() {
    }

    public MailingAddressTO(String address1, String address2, String city, String company, String country, CountryCodeTO countryCode, String firstName, java.util.List<String> formatted, String formattedArea, String id, String lastName, Double latitude, Double longitude, String name, String phone, String province, String provinceCode, String zip) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.company = company;
        this.country = country;
        this.countryCode = countryCode;
        this.firstName = firstName;
        this.formatted = formatted;
        this.formattedArea = formattedArea;
        this.id = id;
        this.lastName = lastName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
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

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public CountryCodeTO getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(CountryCodeTO countryCode) {
        this.countryCode = countryCode;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public java.util.List<String> getFormatted() {
        return formatted;
    }
    public void setFormatted(java.util.List<String> formatted) {
        this.formatted = formatted;
    }

    public String getFormattedArea() {
        return formattedArea;
    }
    public void setFormattedArea(String formattedArea) {
        this.formattedArea = formattedArea;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        if (company != null) {
            joiner.add("company: " + GraphQLRequestSerializer.getEntry(company));
        }
        if (country != null) {
            joiner.add("country: " + GraphQLRequestSerializer.getEntry(country));
        }
        if (countryCode != null) {
            joiner.add("countryCode: " + GraphQLRequestSerializer.getEntry(countryCode));
        }
        if (firstName != null) {
            joiner.add("firstName: " + GraphQLRequestSerializer.getEntry(firstName));
        }
        if (formatted != null) {
            joiner.add("formatted: " + GraphQLRequestSerializer.getEntry(formatted));
        }
        if (formattedArea != null) {
            joiner.add("formattedArea: " + GraphQLRequestSerializer.getEntry(formattedArea));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (lastName != null) {
            joiner.add("lastName: " + GraphQLRequestSerializer.getEntry(lastName));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
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

    public static MailingAddressTO.Builder builder() {
        return new MailingAddressTO.Builder();
    }

    public static class Builder {

        private String address1;
        private String address2;
        private String city;
        private String company;
        private String country;
        private CountryCodeTO countryCode;
        private String firstName;
        private java.util.List<String> formatted;
        private String formattedArea;
        private String id;
        private String lastName;
        private Double latitude;
        private Double longitude;
        private String name;
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

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setCountryCode(CountryCodeTO countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setFormatted(java.util.List<String> formatted) {
            this.formatted = formatted;
            return this;
        }

        public Builder setFormattedArea(String formattedArea) {
            this.formattedArea = formattedArea;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
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

        public Builder setName(String name) {
            this.name = name;
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


        public MailingAddressTO build() {
            return new MailingAddressTO(address1, address2, city, company, country, countryCode, firstName, formatted, formattedArea, id, lastName, latitude, longitude, name, phone, province, provinceCode, zip);
        }

    }
}
