package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderEdgeResponseProjection extends GraphQLResponseProjection {

    public OrderEdgeResponseProjection() {
    }

    @Override
    public OrderEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("OrderEdgeResponseProjection.OrderResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderEdgeResponseProjection.OrderResponseProjection.node", projectionDepthOnFields.getOrDefault("OrderEdgeResponseProjection.OrderResponseProjection.node", 0) + 1);
            this.node(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderEdgeResponseProjection.OrderResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public OrderEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrderEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrderEdgeResponseProjection node(OrderResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrderEdgeResponseProjection node(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrderEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrderEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
