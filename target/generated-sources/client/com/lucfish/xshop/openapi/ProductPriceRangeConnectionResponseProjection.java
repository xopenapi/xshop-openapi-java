package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductPriceRangeConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductPriceRangeConnectionResponseProjection extends GraphQLResponseProjection {

    public ProductPriceRangeConnectionResponseProjection() {
    }

    @Override
    public ProductPriceRangeConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductPriceRangeConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProductPriceRangeConnectionResponseProjection.ProductPriceRangeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductPriceRangeConnectionResponseProjection.ProductPriceRangeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProductPriceRangeConnectionResponseProjection.ProductPriceRangeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProductPriceRangeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductPriceRangeConnectionResponseProjection.ProductPriceRangeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProductPriceRangeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProductPriceRangeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProductPriceRangeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProductPriceRangeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ProductPriceRangeConnectionResponseProjection edges(ProductPriceRangeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProductPriceRangeConnectionResponseProjection edges(String alias, ProductPriceRangeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProductPriceRangeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProductPriceRangeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProductPriceRangeConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProductPriceRangeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
