package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MediaConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class MediaConnectionResponseProjection extends GraphQLResponseProjection {

    public MediaConnectionResponseProjection() {
    }

    @Override
    public MediaConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MediaConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MediaConnectionResponseProjection.MediaEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("MediaConnectionResponseProjection.MediaEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("MediaConnectionResponseProjection.MediaEdgeResponseProjection.edges", 0) + 1);
            this.edges(new MediaEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MediaConnectionResponseProjection.MediaEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MediaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("MediaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("MediaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MediaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public MediaConnectionResponseProjection edges(MediaEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public MediaConnectionResponseProjection edges(String alias, MediaEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public MediaConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public MediaConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public MediaConnectionResponseProjection typename() {
        return typename(null);
    }

    public MediaConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
