package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for InventoryLevelEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class InventoryLevelEdgeResponseProjection extends GraphQLResponseProjection {

    public InventoryLevelEdgeResponseProjection() {
    }

    @Override
    public InventoryLevelEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public InventoryLevelEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("InventoryLevelEdgeResponseProjection.InventoryLevelResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryLevelEdgeResponseProjection.InventoryLevelResponseProjection.node", projectionDepthOnFields.getOrDefault("InventoryLevelEdgeResponseProjection.InventoryLevelResponseProjection.node", 0) + 1);
            this.node(new InventoryLevelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryLevelEdgeResponseProjection.InventoryLevelResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public InventoryLevelEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public InventoryLevelEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public InventoryLevelEdgeResponseProjection node(InventoryLevelResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public InventoryLevelEdgeResponseProjection node(String alias, InventoryLevelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryLevelEdgeResponseProjection typename() {
        return typename(null);
    }

    public InventoryLevelEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
