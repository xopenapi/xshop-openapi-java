package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderTransactionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderTransactionConnectionResponseProjection extends GraphQLResponseProjection {

    public OrderTransactionConnectionResponseProjection() {
    }

    @Override
    public OrderTransactionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderTransactionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrderTransactionConnectionResponseProjection.OrderTransactionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionConnectionResponseProjection.OrderTransactionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrderTransactionConnectionResponseProjection.OrderTransactionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrderTransactionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionConnectionResponseProjection.OrderTransactionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderTransactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrderTransactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public OrderTransactionConnectionResponseProjection edges(OrderTransactionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrderTransactionConnectionResponseProjection edges(String alias, OrderTransactionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrderTransactionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrderTransactionConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
