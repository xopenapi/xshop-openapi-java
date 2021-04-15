package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Image
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ImageResponseProjection extends GraphQLResponseProjection {

    public ImageResponseProjection() {
    }

    @Override
    public ImageResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ImageResponseProjection all$(int maxDepth) {
        this.id();
        this.alt();
        this.width();
        this.height();
        this.originalSrc();
        this.transformedSrc();
        this.typename();
        return this;
    }

    public ImageResponseProjection id() {
        return id(null);
    }

    public ImageResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ImageResponseProjection alt() {
        return alt(null);
    }

    public ImageResponseProjection alt(String alias) {
        fields.add(new GraphQLResponseField("alt").alias(alias));
        return this;
    }

    public ImageResponseProjection width() {
        return width(null);
    }

    public ImageResponseProjection width(String alias) {
        fields.add(new GraphQLResponseField("width").alias(alias));
        return this;
    }

    public ImageResponseProjection height() {
        return height(null);
    }

    public ImageResponseProjection height(String alias) {
        fields.add(new GraphQLResponseField("height").alias(alias));
        return this;
    }

    public ImageResponseProjection originalSrc() {
        return originalSrc(null);
    }

    public ImageResponseProjection originalSrc(String alias) {
        fields.add(new GraphQLResponseField("originalSrc").alias(alias));
        return this;
    }

    public ImageResponseProjection transformedSrc() {
        return transformedSrc(null);
    }

    public ImageResponseProjection transformedSrc(String alias) {
        fields.add(new GraphQLResponseField("transformedSrc").alias(alias));
        return this;
    }

    public ImageResponseProjection typename() {
        return typename(null);
    }

    public ImageResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
