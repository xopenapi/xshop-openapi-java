package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductOption
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductOptionResponseProjection extends GraphQLResponseProjection {

    public ProductOptionResponseProjection() {
    }

    @Override
    public ProductOptionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductOptionResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ProductOptionResponseProjection.ProductOptionValueResponseProjection.values", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductOptionResponseProjection.ProductOptionValueResponseProjection.values", projectionDepthOnFields.getOrDefault("ProductOptionResponseProjection.ProductOptionValueResponseProjection.values", 0) + 1);
            this.values(new ProductOptionValueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductOptionResponseProjection.ProductOptionValueResponseProjection.values", 0)));
        }
        this.typename();
        return this;
    }

    public ProductOptionResponseProjection id() {
        return id(null);
    }

    public ProductOptionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProductOptionResponseProjection name() {
        return name(null);
    }

    public ProductOptionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProductOptionResponseProjection values(ProductOptionValueResponseProjection subProjection) {
        return values(null, subProjection);
    }

    public ProductOptionResponseProjection values(String alias, ProductOptionValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("values").alias(alias).projection(subProjection));
        return this;
    }

    public ProductOptionResponseProjection typename() {
        return typename(null);
    }

    public ProductOptionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
