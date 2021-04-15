package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RefundLineItemConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class RefundLineItemConnectionResponseProjection extends GraphQLResponseProjection {

    public RefundLineItemConnectionResponseProjection() {
    }

    @Override
    public RefundLineItemConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefundLineItemConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RefundLineItemConnectionResponseProjection.RefundLineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemConnectionResponseProjection.RefundLineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RefundLineItemConnectionResponseProjection.RefundLineItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RefundLineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemConnectionResponseProjection.RefundLineItemEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RefundLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public RefundLineItemConnectionResponseProjection edges(RefundLineItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RefundLineItemConnectionResponseProjection edges(String alias, RefundLineItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RefundLineItemConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemConnectionResponseProjection typename() {
        return typename(null);
    }

    public RefundLineItemConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
