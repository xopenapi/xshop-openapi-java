package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RefundCreate
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class RefundCreateResponseProjection extends GraphQLResponseProjection {

    public RefundCreateResponseProjection() {
    }

    @Override
    public RefundCreateResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefundCreateResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.OrderResponseProjection.order", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundCreateResponseProjection.OrderResponseProjection.order", projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.OrderResponseProjection.order", 0) + 1);
            this.order(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.OrderResponseProjection.order", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.RefundResponseProjection.refund", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundCreateResponseProjection.RefundResponseProjection.refund", projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.RefundResponseProjection.refund", 0) + 1);
            this.refund(new RefundResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.RefundResponseProjection.refund", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.UserErrorResponseProjection.userErrors", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundCreateResponseProjection.UserErrorResponseProjection.userErrors", projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.UserErrorResponseProjection.userErrors", 0) + 1);
            this.userErrors(new UserErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundCreateResponseProjection.UserErrorResponseProjection.userErrors", 0)));
        }
        this.typename();
        return this;
    }

    public RefundCreateResponseProjection order(OrderResponseProjection subProjection) {
        return order(null, subProjection);
    }

    public RefundCreateResponseProjection order(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("order").alias(alias).projection(subProjection));
        return this;
    }

    public RefundCreateResponseProjection refund(RefundResponseProjection subProjection) {
        return refund(null, subProjection);
    }

    public RefundCreateResponseProjection refund(String alias, RefundResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refund").alias(alias).projection(subProjection));
        return this;
    }

    public RefundCreateResponseProjection userErrors(UserErrorResponseProjection subProjection) {
        return userErrors(null, subProjection);
    }

    public RefundCreateResponseProjection userErrors(String alias, UserErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userErrors").alias(alias).projection(subProjection));
        return this;
    }

    public RefundCreateResponseProjection typename() {
        return typename(null);
    }

    public RefundCreateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
