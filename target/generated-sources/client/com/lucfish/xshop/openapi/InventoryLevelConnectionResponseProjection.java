package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for InventoryLevelConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class InventoryLevelConnectionResponseProjection extends GraphQLResponseProjection {

    public InventoryLevelConnectionResponseProjection() {
    }

    @Override
    public InventoryLevelConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public InventoryLevelConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("InventoryLevelConnectionResponseProjection.InventoryLevelEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryLevelConnectionResponseProjection.InventoryLevelEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("InventoryLevelConnectionResponseProjection.InventoryLevelEdgeResponseProjection.edges", 0) + 1);
            this.edges(new InventoryLevelEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryLevelConnectionResponseProjection.InventoryLevelEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryLevelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryLevelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("InventoryLevelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryLevelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public InventoryLevelConnectionResponseProjection edges(InventoryLevelEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public InventoryLevelConnectionResponseProjection edges(String alias, InventoryLevelEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryLevelConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public InventoryLevelConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryLevelConnectionResponseProjection typename() {
        return typename(null);
    }

    public InventoryLevelConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
