package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class OrderConnectionResponseProjection extends GraphQLResponseProjection {

    public OrderConnectionResponseProjection() {
    }

    @Override
    public OrderConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("OrderConnectionResponseProjection.OrderEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderConnectionResponseProjection.OrderEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrderConnectionResponseProjection.OrderEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrderEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderConnectionResponseProjection.OrderEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public OrderConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public OrderConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public OrderConnectionResponseProjection edges(OrderEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrderConnectionResponseProjection edges(String alias, OrderEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrderConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrderConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrderConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrderConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
