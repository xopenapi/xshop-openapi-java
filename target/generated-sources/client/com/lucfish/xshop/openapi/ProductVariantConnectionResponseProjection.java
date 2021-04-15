package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductVariantConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductVariantConnectionResponseProjection extends GraphQLResponseProjection {

    public ProductVariantConnectionResponseProjection() {
    }

    @Override
    public ProductVariantConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductVariantConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProductVariantConnectionResponseProjection.ProductVariantEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductVariantConnectionResponseProjection.ProductVariantEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProductVariantConnectionResponseProjection.ProductVariantEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProductVariantEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductVariantConnectionResponseProjection.ProductVariantEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductVariantConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductVariantConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProductVariantConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductVariantConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ProductVariantConnectionResponseProjection edges(ProductVariantEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProductVariantConnectionResponseProjection edges(String alias, ProductVariantEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProductVariantConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProductVariantConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProductVariantConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProductVariantConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
