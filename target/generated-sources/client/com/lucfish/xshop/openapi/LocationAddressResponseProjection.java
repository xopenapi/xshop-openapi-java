package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LocationAddress
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class LocationAddressResponseProjection extends GraphQLResponseProjection {

    public LocationAddressResponseProjection() {
    }

    @Override
    public LocationAddressResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LocationAddressResponseProjection all$(int maxDepth) {
        this.address1();
        this.address2();
        this.city();
        this.country();
        this.countryCode();
        this.formatted();
        this.latitude();
        this.longitude();
        this.phone();
        this.province();
        this.provinceCode();
        this.zip();
        this.typename();
        return this;
    }

    public LocationAddressResponseProjection address1() {
        return address1(null);
    }

    public LocationAddressResponseProjection address1(String alias) {
        fields.add(new GraphQLResponseField("address1").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection address2() {
        return address2(null);
    }

    public LocationAddressResponseProjection address2(String alias) {
        fields.add(new GraphQLResponseField("address2").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection city() {
        return city(null);
    }

    public LocationAddressResponseProjection city(String alias) {
        fields.add(new GraphQLResponseField("city").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection country() {
        return country(null);
    }

    public LocationAddressResponseProjection country(String alias) {
        fields.add(new GraphQLResponseField("country").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection countryCode() {
        return countryCode(null);
    }

    public LocationAddressResponseProjection countryCode(String alias) {
        fields.add(new GraphQLResponseField("countryCode").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection formatted() {
        return formatted(null);
    }

    public LocationAddressResponseProjection formatted(String alias) {
        fields.add(new GraphQLResponseField("formatted").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection latitude() {
        return latitude(null);
    }

    public LocationAddressResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection longitude() {
        return longitude(null);
    }

    public LocationAddressResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection phone() {
        return phone(null);
    }

    public LocationAddressResponseProjection phone(String alias) {
        fields.add(new GraphQLResponseField("phone").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection province() {
        return province(null);
    }

    public LocationAddressResponseProjection province(String alias) {
        fields.add(new GraphQLResponseField("province").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection provinceCode() {
        return provinceCode(null);
    }

    public LocationAddressResponseProjection provinceCode(String alias) {
        fields.add(new GraphQLResponseField("provinceCode").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection zip() {
        return zip(null);
    }

    public LocationAddressResponseProjection zip(String alias) {
        fields.add(new GraphQLResponseField("zip").alias(alias));
        return this;
    }

    public LocationAddressResponseProjection typename() {
        return typename(null);
    }

    public LocationAddressResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
