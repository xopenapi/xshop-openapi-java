package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Location
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class LocationResponseProjection extends GraphQLResponseProjection {

    public LocationResponseProjection() {
    }

    @Override
    public LocationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LocationResponseProjection all$(int maxDepth) {
        this.activatable();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationAddressResponseProjection.address", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.LocationAddressResponseProjection.address", projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationAddressResponseProjection.address", 0) + 1);
            this.address(new LocationAddressResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationAddressResponseProjection.address", 0)));
        }
        this.addressVerified();
        this.deactivatable();
        this.deactivatedAt();
        this.deletable();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", projectionDepthOnFields.getOrDefault("LocationResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", 0) + 1);
            this.fulfillmentService(new FulfillmentServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.FulfillmentServiceResponseProjection.fulfillmentService", 0)));
        }
        this.fulfillsOnlineOrders();
        this.hasActiveInventory();
        this.hasUnfulfilledOrders();
        this.id();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.InventoryLevelResponseProjection.inventoryLevel", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.InventoryLevelResponseProjection.inventoryLevel", projectionDepthOnFields.getOrDefault("LocationResponseProjection.InventoryLevelResponseProjection.inventoryLevel", 0) + 1);
            this.inventoryLevel(new InventoryLevelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.InventoryLevelResponseProjection.inventoryLevel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", projectionDepthOnFields.getOrDefault("LocationResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", 0) + 1);
            this.inventoryLevels(new InventoryLevelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", 0)));
        }
        this.isActive();
        this.name();
        this.shipsInventory();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationAddressResponseProjection.suggestedAddresses", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.LocationAddressResponseProjection.suggestedAddresses", projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationAddressResponseProjection.suggestedAddresses", 0) + 1);
            this.suggestedAddresses(new LocationAddressResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationAddressResponseProjection.suggestedAddresses", 0)));
        }
        this.typename();
        return this;
    }

    public LocationResponseProjection activatable() {
        return activatable(null);
    }

    public LocationResponseProjection activatable(String alias) {
        fields.add(new GraphQLResponseField("activatable").alias(alias));
        return this;
    }

    public LocationResponseProjection address(LocationAddressResponseProjection subProjection) {
        return address(null, subProjection);
    }

    public LocationResponseProjection address(String alias, LocationAddressResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("address").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection addressVerified() {
        return addressVerified(null);
    }

    public LocationResponseProjection addressVerified(String alias) {
        fields.add(new GraphQLResponseField("addressVerified").alias(alias));
        return this;
    }

    public LocationResponseProjection deactivatable() {
        return deactivatable(null);
    }

    public LocationResponseProjection deactivatable(String alias) {
        fields.add(new GraphQLResponseField("deactivatable").alias(alias));
        return this;
    }

    public LocationResponseProjection deactivatedAt() {
        return deactivatedAt(null);
    }

    public LocationResponseProjection deactivatedAt(String alias) {
        fields.add(new GraphQLResponseField("deactivatedAt").alias(alias));
        return this;
    }

    public LocationResponseProjection deletable() {
        return deletable(null);
    }

    public LocationResponseProjection deletable(String alias) {
        fields.add(new GraphQLResponseField("deletable").alias(alias));
        return this;
    }

    public LocationResponseProjection fulfillmentService(FulfillmentServiceResponseProjection subProjection) {
        return fulfillmentService(null, subProjection);
    }

    public LocationResponseProjection fulfillmentService(String alias, FulfillmentServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fulfillmentService").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection fulfillsOnlineOrders() {
        return fulfillsOnlineOrders(null);
    }

    public LocationResponseProjection fulfillsOnlineOrders(String alias) {
        fields.add(new GraphQLResponseField("fulfillsOnlineOrders").alias(alias));
        return this;
    }

    public LocationResponseProjection hasActiveInventory() {
        return hasActiveInventory(null);
    }

    public LocationResponseProjection hasActiveInventory(String alias) {
        fields.add(new GraphQLResponseField("hasActiveInventory").alias(alias));
        return this;
    }

    public LocationResponseProjection hasUnfulfilledOrders() {
        return hasUnfulfilledOrders(null);
    }

    public LocationResponseProjection hasUnfulfilledOrders(String alias) {
        fields.add(new GraphQLResponseField("hasUnfulfilledOrders").alias(alias));
        return this;
    }

    public LocationResponseProjection id() {
        return id(null);
    }

    public LocationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LocationResponseProjection inventoryLevel(InventoryLevelResponseProjection subProjection) {
        return inventoryLevel((String)null, subProjection);
    }

    public LocationResponseProjection inventoryLevel(String alias, InventoryLevelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevel").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection inventoryLevel(LocationInventoryLevelParametrizedInput input, InventoryLevelResponseProjection subProjection) {
        return inventoryLevel(null, input, subProjection);
    }

    public LocationResponseProjection inventoryLevel(String alias, LocationInventoryLevelParametrizedInput input, InventoryLevelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LocationResponseProjection inventoryLevels(InventoryLevelConnectionResponseProjection subProjection) {
        return inventoryLevels((String)null, subProjection);
    }

    public LocationResponseProjection inventoryLevels(String alias, InventoryLevelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevels").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection inventoryLevels(LocationInventoryLevelsParametrizedInput input, InventoryLevelConnectionResponseProjection subProjection) {
        return inventoryLevels(null, input, subProjection);
    }

    public LocationResponseProjection inventoryLevels(String alias, LocationInventoryLevelsParametrizedInput input, InventoryLevelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LocationResponseProjection isActive() {
        return isActive(null);
    }

    public LocationResponseProjection isActive(String alias) {
        fields.add(new GraphQLResponseField("isActive").alias(alias));
        return this;
    }

    public LocationResponseProjection name() {
        return name(null);
    }

    public LocationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LocationResponseProjection shipsInventory() {
        return shipsInventory(null);
    }

    public LocationResponseProjection shipsInventory(String alias) {
        fields.add(new GraphQLResponseField("shipsInventory").alias(alias));
        return this;
    }

    public LocationResponseProjection suggestedAddresses(LocationAddressResponseProjection subProjection) {
        return suggestedAddresses(null, subProjection);
    }

    public LocationResponseProjection suggestedAddresses(String alias, LocationAddressResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("suggestedAddresses").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection typename() {
        return typename(null);
    }

    public LocationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
