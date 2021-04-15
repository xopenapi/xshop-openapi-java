package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MailingAddress
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MailingAddressResponseProjection extends GraphQLResponseProjection {

    public MailingAddressResponseProjection() {
    }

    @Override
    public MailingAddressResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MailingAddressResponseProjection all$(int maxDepth) {
        this.address1();
        this.address2();
        this.city();
        this.company();
        this.country();
        this.countryCode();
        this.firstName();
        this.formatted();
        this.formattedArea();
        this.id();
        this.lastName();
        this.latitude();
        this.longitude();
        this.name();
        this.phone();
        this.province();
        this.provinceCode();
        this.zip();
        this.typename();
        return this;
    }

    public MailingAddressResponseProjection address1() {
        return address1(null);
    }

    public MailingAddressResponseProjection address1(String alias) {
        fields.add(new GraphQLResponseField("address1").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection address2() {
        return address2(null);
    }

    public MailingAddressResponseProjection address2(String alias) {
        fields.add(new GraphQLResponseField("address2").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection city() {
        return city(null);
    }

    public MailingAddressResponseProjection city(String alias) {
        fields.add(new GraphQLResponseField("city").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection company() {
        return company(null);
    }

    public MailingAddressResponseProjection company(String alias) {
        fields.add(new GraphQLResponseField("company").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection country() {
        return country(null);
    }

    public MailingAddressResponseProjection country(String alias) {
        fields.add(new GraphQLResponseField("country").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection countryCode() {
        return countryCode(null);
    }

    public MailingAddressResponseProjection countryCode(String alias) {
        fields.add(new GraphQLResponseField("countryCode").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection firstName() {
        return firstName(null);
    }

    public MailingAddressResponseProjection firstName(String alias) {
        fields.add(new GraphQLResponseField("firstName").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection formatted() {
        return formatted((String)null);
    }

    public MailingAddressResponseProjection formatted(String alias) {
        fields.add(new GraphQLResponseField("formatted").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection formatted(MailingAddressFormattedParametrizedInput input) {
        return formatted(null, input);
    }

    public MailingAddressResponseProjection formatted(String alias, MailingAddressFormattedParametrizedInput input) {
        fields.add(new GraphQLResponseField("formatted").alias(alias).parameters(input));
        return this;
    }

    public MailingAddressResponseProjection formattedArea() {
        return formattedArea(null);
    }

    public MailingAddressResponseProjection formattedArea(String alias) {
        fields.add(new GraphQLResponseField("formattedArea").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection id() {
        return id(null);
    }

    public MailingAddressResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection lastName() {
        return lastName(null);
    }

    public MailingAddressResponseProjection lastName(String alias) {
        fields.add(new GraphQLResponseField("lastName").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection latitude() {
        return latitude(null);
    }

    public MailingAddressResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection longitude() {
        return longitude(null);
    }

    public MailingAddressResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection name() {
        return name(null);
    }

    public MailingAddressResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection phone() {
        return phone(null);
    }

    public MailingAddressResponseProjection phone(String alias) {
        fields.add(new GraphQLResponseField("phone").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection province() {
        return province(null);
    }

    public MailingAddressResponseProjection province(String alias) {
        fields.add(new GraphQLResponseField("province").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection provinceCode() {
        return provinceCode(null);
    }

    public MailingAddressResponseProjection provinceCode(String alias) {
        fields.add(new GraphQLResponseField("provinceCode").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection zip() {
        return zip(null);
    }

    public MailingAddressResponseProjection zip(String alias) {
        fields.add(new GraphQLResponseField("zip").alias(alias));
        return this;
    }

    public MailingAddressResponseProjection typename() {
        return typename(null);
    }

    public MailingAddressResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
