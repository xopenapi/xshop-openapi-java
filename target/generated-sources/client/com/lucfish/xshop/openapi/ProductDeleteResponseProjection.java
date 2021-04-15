package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductDelete
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductDeleteResponseProjection extends GraphQLResponseProjection {

    public ProductDeleteResponseProjection() {
    }

    @Override
    public ProductDeleteResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductDeleteResponseProjection all$(int maxDepth) {
        this.deletedProductId();
        if (projectionDepthOnFields.getOrDefault("ProductDeleteResponseProjection.ShopResponseProjection.shop", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductDeleteResponseProjection.ShopResponseProjection.shop", projectionDepthOnFields.getOrDefault("ProductDeleteResponseProjection.ShopResponseProjection.shop", 0) + 1);
            this.shop(new ShopResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductDeleteResponseProjection.ShopResponseProjection.shop", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductDeleteResponseProjection.UserErrorResponseProjection.userErrors", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductDeleteResponseProjection.UserErrorResponseProjection.userErrors", projectionDepthOnFields.getOrDefault("ProductDeleteResponseProjection.UserErrorResponseProjection.userErrors", 0) + 1);
            this.userErrors(new UserErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductDeleteResponseProjection.UserErrorResponseProjection.userErrors", 0)));
        }
        this.typename();
        return this;
    }

    public ProductDeleteResponseProjection deletedProductId() {
        return deletedProductId(null);
    }

    public ProductDeleteResponseProjection deletedProductId(String alias) {
        fields.add(new GraphQLResponseField("deletedProductId").alias(alias));
        return this;
    }

    public ProductDeleteResponseProjection shop(ShopResponseProjection subProjection) {
        return shop(null, subProjection);
    }

    public ProductDeleteResponseProjection shop(String alias, ShopResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("shop").alias(alias).projection(subProjection));
        return this;
    }

    public ProductDeleteResponseProjection userErrors(UserErrorResponseProjection subProjection) {
        return userErrors(null, subProjection);
    }

    public ProductDeleteResponseProjection userErrors(String alias, UserErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userErrors").alias(alias).projection(subProjection));
        return this;
    }

    public ProductDeleteResponseProjection typename() {
        return typename(null);
    }

    public ProductDeleteResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
