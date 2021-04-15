package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderTransactionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderTransactionEdgeResponseProjection extends GraphQLResponseProjection {

    public OrderTransactionEdgeResponseProjection() {
    }

    @Override
    public OrderTransactionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderTransactionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("OrderTransactionEdgeResponseProjection.OrderTransactionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionEdgeResponseProjection.OrderTransactionResponseProjection.node", projectionDepthOnFields.getOrDefault("OrderTransactionEdgeResponseProjection.OrderTransactionResponseProjection.node", 0) + 1);
            this.node(new OrderTransactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionEdgeResponseProjection.OrderTransactionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public OrderTransactionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrderTransactionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrderTransactionEdgeResponseProjection node(OrderTransactionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrderTransactionEdgeResponseProjection node(String alias, OrderTransactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrderTransactionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
