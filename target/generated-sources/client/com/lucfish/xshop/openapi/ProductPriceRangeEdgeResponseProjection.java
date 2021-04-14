package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductPriceRangeEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductPriceRangeEdgeResponseProjection extends GraphQLResponseProjection {

    public ProductPriceRangeEdgeResponseProjection() {
    }

    @Override
    public ProductPriceRangeEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductPriceRangeEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ProductPriceRangeEdgeResponseProjection.ProductPriceRangeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductPriceRangeEdgeResponseProjection.ProductPriceRangeResponseProjection.node", projectionDepthOnFields.getOrDefault("ProductPriceRangeEdgeResponseProjection.ProductPriceRangeResponseProjection.node", 0) + 1);
            this.node(new ProductPriceRangeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductPriceRangeEdgeResponseProjection.ProductPriceRangeResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ProductPriceRangeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProductPriceRangeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProductPriceRangeEdgeResponseProjection node(ProductPriceRangeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProductPriceRangeEdgeResponseProjection node(String alias, ProductPriceRangeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProductPriceRangeEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProductPriceRangeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
