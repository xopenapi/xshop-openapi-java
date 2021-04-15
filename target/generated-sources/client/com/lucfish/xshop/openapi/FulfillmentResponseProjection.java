package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Fulfillment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class FulfillmentResponseProjection extends GraphQLResponseProjection {

    public FulfillmentResponseProjection() {
    }

    @Override
    public FulfillmentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FulfillmentResponseProjection all$(int maxDepth) {
        this.id();
        this.displayStatus();
        this.createdAt();
        this.updatedAt();
        this.deliveredAt();
        this.inTransitAt();
        this.estimatedDeliveryAt();
        if (projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.FulfillmentServiceResponseProjection.service", 0) <= maxDepth) {
            projectionDepthOnFields.put("FulfillmentResponseProjection.FulfillmentServiceResponseProjection.service", projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.FulfillmentServiceResponseProjection.service", 0) + 1);
            this.service(new FulfillmentServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.FulfillmentServiceResponseProjection.service", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.LocationResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("FulfillmentResponseProjection.LocationResponseProjection.location", projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.LocationResponseProjection.location", 0) + 1);
            this.location(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.LocationResponseProjection.location", 0)));
        }
        this.requiresShipping();
        this.name();
        if (projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.OrderResponseProjection.order", 0) <= maxDepth) {
            projectionDepthOnFields.put("FulfillmentResponseProjection.OrderResponseProjection.order", projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.OrderResponseProjection.order", 0) + 1);
            this.order(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.OrderResponseProjection.order", 0)));
        }
        this.status();
        this.totalQuantity();
        if (projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.FulfillmentTrackingInfoResponseProjection.trackingInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FulfillmentResponseProjection.FulfillmentTrackingInfoResponseProjection.trackingInfo", projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.FulfillmentTrackingInfoResponseProjection.trackingInfo", 0) + 1);
            this.trackingInfo(new FulfillmentTrackingInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FulfillmentResponseProjection.FulfillmentTrackingInfoResponseProjection.trackingInfo", 0)));
        }
        this.typename();
        return this;
    }

    public FulfillmentResponseProjection id() {
        return id(null);
    }

    public FulfillmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection displayStatus() {
        return displayStatus(null);
    }

    public FulfillmentResponseProjection displayStatus(String alias) {
        fields.add(new GraphQLResponseField("displayStatus").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection createdAt() {
        return createdAt(null);
    }

    public FulfillmentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public FulfillmentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection deliveredAt() {
        return deliveredAt(null);
    }

    public FulfillmentResponseProjection deliveredAt(String alias) {
        fields.add(new GraphQLResponseField("deliveredAt").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection inTransitAt() {
        return inTransitAt(null);
    }

    public FulfillmentResponseProjection inTransitAt(String alias) {
        fields.add(new GraphQLResponseField("inTransitAt").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection estimatedDeliveryAt() {
        return estimatedDeliveryAt(null);
    }

    public FulfillmentResponseProjection estimatedDeliveryAt(String alias) {
        fields.add(new GraphQLResponseField("estimatedDeliveryAt").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection service(FulfillmentServiceResponseProjection subProjection) {
        return service(null, subProjection);
    }

    public FulfillmentResponseProjection service(String alias, FulfillmentServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("service").alias(alias).projection(subProjection));
        return this;
    }

    public FulfillmentResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public FulfillmentResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public FulfillmentResponseProjection requiresShipping() {
        return requiresShipping(null);
    }

    public FulfillmentResponseProjection requiresShipping(String alias) {
        fields.add(new GraphQLResponseField("requiresShipping").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection name() {
        return name(null);
    }

    public FulfillmentResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection order(OrderResponseProjection subProjection) {
        return order(null, subProjection);
    }

    public FulfillmentResponseProjection order(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("order").alias(alias).projection(subProjection));
        return this;
    }

    public FulfillmentResponseProjection status() {
        return status(null);
    }

    public FulfillmentResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection totalQuantity() {
        return totalQuantity(null);
    }

    public FulfillmentResponseProjection totalQuantity(String alias) {
        fields.add(new GraphQLResponseField("totalQuantity").alias(alias));
        return this;
    }

    public FulfillmentResponseProjection trackingInfo(FulfillmentTrackingInfoResponseProjection subProjection) {
        return trackingInfo((String)null, subProjection);
    }

    public FulfillmentResponseProjection trackingInfo(String alias, FulfillmentTrackingInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("trackingInfo").alias(alias).projection(subProjection));
        return this;
    }

    public FulfillmentResponseProjection trackingInfo(FulfillmentTrackingInfoParametrizedInput input, FulfillmentTrackingInfoResponseProjection subProjection) {
        return trackingInfo(null, input, subProjection);
    }

    public FulfillmentResponseProjection trackingInfo(String alias, FulfillmentTrackingInfoParametrizedInput input, FulfillmentTrackingInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("trackingInfo").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public FulfillmentResponseProjection typename() {
        return typename(null);
    }

    public FulfillmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
