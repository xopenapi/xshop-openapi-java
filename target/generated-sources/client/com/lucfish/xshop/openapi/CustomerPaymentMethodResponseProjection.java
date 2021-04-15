package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerPaymentMethod
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CustomerPaymentMethodResponseProjection extends GraphQLResponseProjection {

    public CustomerPaymentMethodResponseProjection() {
    }

    @Override
    public CustomerPaymentMethodResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomerPaymentMethodResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CustomerPaymentMethodResponseProjection.CustomerResponseProjection.customer", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerPaymentMethodResponseProjection.CustomerResponseProjection.customer", projectionDepthOnFields.getOrDefault("CustomerPaymentMethodResponseProjection.CustomerResponseProjection.customer", 0) + 1);
            this.customer(new CustomerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerPaymentMethodResponseProjection.CustomerResponseProjection.customer", 0)));
        }
        this.id();
        if (projectionDepthOnFields.getOrDefault("CustomerPaymentMethodResponseProjection.CustomerPaymentInstrumentResponseProjection.instrument", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerPaymentMethodResponseProjection.CustomerPaymentInstrumentResponseProjection.instrument", projectionDepthOnFields.getOrDefault("CustomerPaymentMethodResponseProjection.CustomerPaymentInstrumentResponseProjection.instrument", 0) + 1);
            this.instrument(new CustomerPaymentInstrumentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerPaymentMethodResponseProjection.CustomerPaymentInstrumentResponseProjection.instrument", 0)));
        }
        this.revokedAt();
        this.typename();
        return this;
    }

    public CustomerPaymentMethodResponseProjection customer(CustomerResponseProjection subProjection) {
        return customer(null, subProjection);
    }

    public CustomerPaymentMethodResponseProjection customer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customer").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerPaymentMethodResponseProjection id() {
        return id(null);
    }

    public CustomerPaymentMethodResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CustomerPaymentMethodResponseProjection instrument(CustomerPaymentInstrumentResponseProjection subProjection) {
        return instrument(null, subProjection);
    }

    public CustomerPaymentMethodResponseProjection instrument(String alias, CustomerPaymentInstrumentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("instrument").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerPaymentMethodResponseProjection revokedAt() {
        return revokedAt(null);
    }

    public CustomerPaymentMethodResponseProjection revokedAt(String alias) {
        fields.add(new GraphQLResponseField("revokedAt").alias(alias));
        return this;
    }

    public CustomerPaymentMethodResponseProjection typename() {
        return typename(null);
    }

    public CustomerPaymentMethodResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
