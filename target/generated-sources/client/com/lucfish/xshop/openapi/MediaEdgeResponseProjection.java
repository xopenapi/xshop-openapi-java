package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MediaEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class MediaEdgeResponseProjection extends GraphQLResponseProjection {

    public MediaEdgeResponseProjection() {
    }

    @Override
    public MediaEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MediaEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("MediaEdgeResponseProjection.MediaResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("MediaEdgeResponseProjection.MediaResponseProjection.node", projectionDepthOnFields.getOrDefault("MediaEdgeResponseProjection.MediaResponseProjection.node", 0) + 1);
            this.node(new MediaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MediaEdgeResponseProjection.MediaResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public MediaEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public MediaEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public MediaEdgeResponseProjection node(MediaResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public MediaEdgeResponseProjection node(String alias, MediaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public MediaEdgeResponseProjection typename() {
        return typename(null);
    }

    public MediaEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
