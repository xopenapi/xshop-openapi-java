package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderClose
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderCloseResponseProjection extends GraphQLResponseProjection {

    public OrderCloseResponseProjection() {
    }

    @Override
    public OrderCloseResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderCloseResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrderCloseResponseProjection.OrderResponseProjection.order", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderCloseResponseProjection.OrderResponseProjection.order", projectionDepthOnFields.getOrDefault("OrderCloseResponseProjection.OrderResponseProjection.order", 0) + 1);
            this.order(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderCloseResponseProjection.OrderResponseProjection.order", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderCloseResponseProjection.UserErrorResponseProjection.userErrors", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderCloseResponseProjection.UserErrorResponseProjection.userErrors", projectionDepthOnFields.getOrDefault("OrderCloseResponseProjection.UserErrorResponseProjection.userErrors", 0) + 1);
            this.userErrors(new UserErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderCloseResponseProjection.UserErrorResponseProjection.userErrors", 0)));
        }
        this.typename();
        return this;
    }

    public OrderCloseResponseProjection order(OrderResponseProjection subProjection) {
        return order(null, subProjection);
    }

    public OrderCloseResponseProjection order(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("order").alias(alias).projection(subProjection));
        return this;
    }

    public OrderCloseResponseProjection userErrors(UserErrorResponseProjection subProjection) {
        return userErrors(null, subProjection);
    }

    public OrderCloseResponseProjection userErrors(String alias, UserErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userErrors").alias(alias).projection(subProjection));
        return this;
    }

    public OrderCloseResponseProjection typename() {
        return typename(null);
    }

    public OrderCloseResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
