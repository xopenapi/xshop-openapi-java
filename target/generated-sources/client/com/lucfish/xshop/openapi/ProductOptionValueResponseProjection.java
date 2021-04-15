package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductOptionValue
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductOptionValueResponseProjection extends GraphQLResponseProjection {

    public ProductOptionValueResponseProjection() {
    }

    @Override
    public ProductOptionValueResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductOptionValueResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProductOptionValueResponseProjection.ImageResponseProjection.image", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductOptionValueResponseProjection.ImageResponseProjection.image", projectionDepthOnFields.getOrDefault("ProductOptionValueResponseProjection.ImageResponseProjection.image", 0) + 1);
            this.image(new ImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductOptionValueResponseProjection.ImageResponseProjection.image", 0)));
        }
        this.value();
        this.typename();
        return this;
    }

    public ProductOptionValueResponseProjection image(ImageResponseProjection subProjection) {
        return image(null, subProjection);
    }

    public ProductOptionValueResponseProjection image(String alias, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("image").alias(alias).projection(subProjection));
        return this;
    }

    public ProductOptionValueResponseProjection value() {
        return value(null);
    }

    public ProductOptionValueResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public ProductOptionValueResponseProjection typename() {
        return typename(null);
    }

    public ProductOptionValueResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
