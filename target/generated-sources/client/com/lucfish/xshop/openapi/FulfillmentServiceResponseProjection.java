package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FulfillmentService
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class FulfillmentServiceResponseProjection extends GraphQLResponseProjection {

    public FulfillmentServiceResponseProjection() {
    }

    @Override
    public FulfillmentServiceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FulfillmentServiceResponseProjection all$(int maxDepth) {
        this.callbackUrl();
        this.fulfillmentOrdersOptIn();
        this.handle();
        this.id();
        this.inventoryManagement();
        if (projectionDepthOnFields.getOrDefault("FulfillmentServiceResponseProjection.LocationResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("FulfillmentServiceResponseProjection.LocationResponseProjection.location", projectionDepthOnFields.getOrDefault("FulfillmentServiceResponseProjection.LocationResponseProjection.location", 0) + 1);
            this.location(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FulfillmentServiceResponseProjection.LocationResponseProjection.location", 0)));
        }
        this.productBased();
        this.serviceName();
        if (projectionDepthOnFields.getOrDefault("FulfillmentServiceResponseProjection.ShippingMethodResponseProjection.shippingMethods", 0) <= maxDepth) {
            projectionDepthOnFields.put("FulfillmentServiceResponseProjection.ShippingMethodResponseProjection.shippingMethods", projectionDepthOnFields.getOrDefault("FulfillmentServiceResponseProjection.ShippingMethodResponseProjection.shippingMethods", 0) + 1);
            this.shippingMethods(new ShippingMethodResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FulfillmentServiceResponseProjection.ShippingMethodResponseProjection.shippingMethods", 0)));
        }
        this.type();
        this.typename();
        return this;
    }

    public FulfillmentServiceResponseProjection callbackUrl() {
        return callbackUrl(null);
    }

    public FulfillmentServiceResponseProjection callbackUrl(String alias) {
        fields.add(new GraphQLResponseField("callbackUrl").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection fulfillmentOrdersOptIn() {
        return fulfillmentOrdersOptIn(null);
    }

    public FulfillmentServiceResponseProjection fulfillmentOrdersOptIn(String alias) {
        fields.add(new GraphQLResponseField("fulfillmentOrdersOptIn").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection handle() {
        return handle(null);
    }

    public FulfillmentServiceResponseProjection handle(String alias) {
        fields.add(new GraphQLResponseField("handle").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection id() {
        return id(null);
    }

    public FulfillmentServiceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection inventoryManagement() {
        return inventoryManagement(null);
    }

    public FulfillmentServiceResponseProjection inventoryManagement(String alias) {
        fields.add(new GraphQLResponseField("inventoryManagement").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public FulfillmentServiceResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public FulfillmentServiceResponseProjection productBased() {
        return productBased(null);
    }

    public FulfillmentServiceResponseProjection productBased(String alias) {
        fields.add(new GraphQLResponseField("productBased").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection serviceName() {
        return serviceName(null);
    }

    public FulfillmentServiceResponseProjection serviceName(String alias) {
        fields.add(new GraphQLResponseField("serviceName").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection shippingMethods(ShippingMethodResponseProjection subProjection) {
        return shippingMethods(null, subProjection);
    }

    public FulfillmentServiceResponseProjection shippingMethods(String alias, ShippingMethodResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("shippingMethods").alias(alias).projection(subProjection));
        return this;
    }

    public FulfillmentServiceResponseProjection type() {
        return type(null);
    }

    public FulfillmentServiceResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public FulfillmentServiceResponseProjection typename() {
        return typename(null);
    }

    public FulfillmentServiceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
