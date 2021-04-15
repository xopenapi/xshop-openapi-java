package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductPriceRange
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductPriceRangeResponseProjection extends GraphQLResponseProjection {

    public ProductPriceRangeResponseProjection() {
    }

    @Override
    public ProductPriceRangeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductPriceRangeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProductPriceRangeResponseProjection.MoneyResponseProjection.minVariantPrice", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductPriceRangeResponseProjection.MoneyResponseProjection.minVariantPrice", projectionDepthOnFields.getOrDefault("ProductPriceRangeResponseProjection.MoneyResponseProjection.minVariantPrice", 0) + 1);
            this.minVariantPrice(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductPriceRangeResponseProjection.MoneyResponseProjection.minVariantPrice", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductPriceRangeResponseProjection.MoneyResponseProjection.maxVariantPrice", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductPriceRangeResponseProjection.MoneyResponseProjection.maxVariantPrice", projectionDepthOnFields.getOrDefault("ProductPriceRangeResponseProjection.MoneyResponseProjection.maxVariantPrice", 0) + 1);
            this.maxVariantPrice(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductPriceRangeResponseProjection.MoneyResponseProjection.maxVariantPrice", 0)));
        }
        this.typename();
        return this;
    }

    public ProductPriceRangeResponseProjection minVariantPrice(MoneyResponseProjection subProjection) {
        return minVariantPrice(null, subProjection);
    }

    public ProductPriceRangeResponseProjection minVariantPrice(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("minVariantPrice").alias(alias).projection(subProjection));
        return this;
    }

    public ProductPriceRangeResponseProjection maxVariantPrice(MoneyResponseProjection subProjection) {
        return maxVariantPrice(null, subProjection);
    }

    public ProductPriceRangeResponseProjection maxVariantPrice(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("maxVariantPrice").alias(alias).projection(subProjection));
        return this;
    }

    public ProductPriceRangeResponseProjection typename() {
        return typename(null);
    }

    public ProductPriceRangeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
