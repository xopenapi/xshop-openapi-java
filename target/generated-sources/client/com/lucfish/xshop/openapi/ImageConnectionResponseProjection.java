package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ImageConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ImageConnectionResponseProjection extends GraphQLResponseProjection {

    public ImageConnectionResponseProjection() {
    }

    @Override
    public ImageConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ImageConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ImageConnectionResponseProjection.ImageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ImageConnectionResponseProjection.ImageEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ImageConnectionResponseProjection.ImageEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ImageEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ImageConnectionResponseProjection.ImageEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ImageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ImageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ImageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ImageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ImageConnectionResponseProjection edges(ImageEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ImageConnectionResponseProjection edges(String alias, ImageEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ImageConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ImageConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ImageConnectionResponseProjection typename() {
        return typename(null);
    }

    public ImageConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
