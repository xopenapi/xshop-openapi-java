package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductCreate
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductCreateResponseProjection extends GraphQLResponseProjection {

    public ProductCreateResponseProjection() {
    }

    @Override
    public ProductCreateResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductCreateResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.ProductResponseProjection.product", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductCreateResponseProjection.ProductResponseProjection.product", projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.ProductResponseProjection.product", 0) + 1);
            this.product(new ProductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.ProductResponseProjection.product", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.ShopResponseProjection.shop", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductCreateResponseProjection.ShopResponseProjection.shop", projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.ShopResponseProjection.shop", 0) + 1);
            this.shop(new ShopResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.ShopResponseProjection.shop", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.UserErrorResponseProjection.userErrors", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductCreateResponseProjection.UserErrorResponseProjection.userErrors", projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.UserErrorResponseProjection.userErrors", 0) + 1);
            this.userErrors(new UserErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductCreateResponseProjection.UserErrorResponseProjection.userErrors", 0)));
        }
        this.typename();
        return this;
    }

    public ProductCreateResponseProjection product(ProductResponseProjection subProjection) {
        return product(null, subProjection);
    }

    public ProductCreateResponseProjection product(String alias, ProductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("product").alias(alias).projection(subProjection));
        return this;
    }

    public ProductCreateResponseProjection shop(ShopResponseProjection subProjection) {
        return shop(null, subProjection);
    }

    public ProductCreateResponseProjection shop(String alias, ShopResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("shop").alias(alias).projection(subProjection));
        return this;
    }

    public ProductCreateResponseProjection userErrors(UserErrorResponseProjection subProjection) {
        return userErrors(null, subProjection);
    }

    public ProductCreateResponseProjection userErrors(String alias, UserErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userErrors").alias(alias).projection(subProjection));
        return this;
    }

    public ProductCreateResponseProjection typename() {
        return typename(null);
    }

    public ProductCreateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
