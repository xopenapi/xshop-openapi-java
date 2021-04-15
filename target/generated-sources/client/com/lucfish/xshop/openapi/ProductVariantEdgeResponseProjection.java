package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductVariantEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductVariantEdgeResponseProjection extends GraphQLResponseProjection {

    public ProductVariantEdgeResponseProjection() {
    }

    @Override
    public ProductVariantEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductVariantEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ProductVariantEdgeResponseProjection.ProductVariantResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductVariantEdgeResponseProjection.ProductVariantResponseProjection.node", projectionDepthOnFields.getOrDefault("ProductVariantEdgeResponseProjection.ProductVariantResponseProjection.node", 0) + 1);
            this.node(new ProductVariantResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductVariantEdgeResponseProjection.ProductVariantResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ProductVariantEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProductVariantEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProductVariantEdgeResponseProjection node(ProductVariantResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProductVariantEdgeResponseProjection node(String alias, ProductVariantResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProductVariantEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProductVariantEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
