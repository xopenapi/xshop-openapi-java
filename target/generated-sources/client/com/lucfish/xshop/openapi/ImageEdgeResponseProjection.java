package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ImageEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ImageEdgeResponseProjection extends GraphQLResponseProjection {

    public ImageEdgeResponseProjection() {
    }

    @Override
    public ImageEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ImageEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ImageEdgeResponseProjection.ImageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ImageEdgeResponseProjection.ImageResponseProjection.node", projectionDepthOnFields.getOrDefault("ImageEdgeResponseProjection.ImageResponseProjection.node", 0) + 1);
            this.node(new ImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ImageEdgeResponseProjection.ImageResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ImageEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ImageEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ImageEdgeResponseProjection node(ImageResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ImageEdgeResponseProjection node(String alias, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ImageEdgeResponseProjection typename() {
        return typename(null);
    }

    public ImageEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
