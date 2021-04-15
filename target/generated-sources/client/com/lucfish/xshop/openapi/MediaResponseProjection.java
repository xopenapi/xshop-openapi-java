package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Media
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MediaResponseProjection extends GraphQLResponseProjection {

    public MediaResponseProjection() {
    }

    @Override
    public MediaResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MediaResponseProjection all$(int maxDepth) {
        this.alt();
        this.mediaContentType();
        if (projectionDepthOnFields.getOrDefault("MediaResponseProjection.ImageResponseProjection.previewImage", 0) <= maxDepth) {
            projectionDepthOnFields.put("MediaResponseProjection.ImageResponseProjection.previewImage", projectionDepthOnFields.getOrDefault("MediaResponseProjection.ImageResponseProjection.previewImage", 0) + 1);
            this.previewImage(new ImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MediaResponseProjection.ImageResponseProjection.previewImage", 0)));
        }
        this.typename();
        return this;
    }

    public MediaResponseProjection alt() {
        return alt(null);
    }

    public MediaResponseProjection alt(String alias) {
        fields.add(new GraphQLResponseField("alt").alias(alias));
        return this;
    }

    public MediaResponseProjection mediaContentType() {
        return mediaContentType(null);
    }

    public MediaResponseProjection mediaContentType(String alias) {
        fields.add(new GraphQLResponseField("mediaContentType").alias(alias));
        return this;
    }

    public MediaResponseProjection previewImage(ImageResponseProjection subProjection) {
        return previewImage(null, subProjection);
    }

    public MediaResponseProjection previewImage(String alias, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("previewImage").alias(alias).projection(subProjection));
        return this;
    }

    public MediaResponseProjection typename() {
        return typename(null);
    }

    public MediaResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
