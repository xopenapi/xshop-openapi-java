package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for InventoryLevel
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class InventoryLevelResponseProjection extends GraphQLResponseProjection {

    public InventoryLevelResponseProjection() {
    }

    @Override
    public InventoryLevelResponseProjection all$() {
        return all$(3);
    }

    @Override
    public InventoryLevelResponseProjection all$(int maxDepth) {
        this.available();
        this.canDeactivate();
        this.createdAt();
        this.deactivationAlert();
        this.deactivationAlertHtml();
        this.id();
        this.incoming();
        if (projectionDepthOnFields.getOrDefault("InventoryLevelResponseProjection.InventoryItemResponseProjection.item", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryLevelResponseProjection.InventoryItemResponseProjection.item", projectionDepthOnFields.getOrDefault("InventoryLevelResponseProjection.InventoryItemResponseProjection.item", 0) + 1);
            this.item(new InventoryItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryLevelResponseProjection.InventoryItemResponseProjection.item", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryLevelResponseProjection.LocationResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryLevelResponseProjection.LocationResponseProjection.location", projectionDepthOnFields.getOrDefault("InventoryLevelResponseProjection.LocationResponseProjection.location", 0) + 1);
            this.location(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryLevelResponseProjection.LocationResponseProjection.location", 0)));
        }
        this.updatedAt();
        this.typename();
        return this;
    }

    public InventoryLevelResponseProjection available() {
        return available(null);
    }

    public InventoryLevelResponseProjection available(String alias) {
        fields.add(new GraphQLResponseField("available").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection canDeactivate() {
        return canDeactivate(null);
    }

    public InventoryLevelResponseProjection canDeactivate(String alias) {
        fields.add(new GraphQLResponseField("canDeactivate").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection createdAt() {
        return createdAt(null);
    }

    public InventoryLevelResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection deactivationAlert() {
        return deactivationAlert(null);
    }

    public InventoryLevelResponseProjection deactivationAlert(String alias) {
        fields.add(new GraphQLResponseField("deactivationAlert").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection deactivationAlertHtml() {
        return deactivationAlertHtml(null);
    }

    public InventoryLevelResponseProjection deactivationAlertHtml(String alias) {
        fields.add(new GraphQLResponseField("deactivationAlertHtml").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection id() {
        return id(null);
    }

    public InventoryLevelResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection incoming() {
        return incoming(null);
    }

    public InventoryLevelResponseProjection incoming(String alias) {
        fields.add(new GraphQLResponseField("incoming").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection item(InventoryItemResponseProjection subProjection) {
        return item(null, subProjection);
    }

    public InventoryLevelResponseProjection item(String alias, InventoryItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("item").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryLevelResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public InventoryLevelResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryLevelResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public InventoryLevelResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public InventoryLevelResponseProjection typename() {
        return typename(null);
    }

    public InventoryLevelResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
