package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Refund
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class RefundResponseProjection extends GraphQLResponseProjection {

    public RefundResponseProjection() {
    }

    @Override
    public RefundResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefundResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("RefundResponseProjection.RefundLineItemConnectionResponseProjection.refundLineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundResponseProjection.RefundLineItemConnectionResponseProjection.refundLineItems", projectionDepthOnFields.getOrDefault("RefundResponseProjection.RefundLineItemConnectionResponseProjection.refundLineItems", 0) + 1);
            this.refundLineItems(new RefundLineItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundResponseProjection.RefundLineItemConnectionResponseProjection.refundLineItems", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefundResponseProjection.OrderTransactionConnectionResponseProjection.transactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundResponseProjection.OrderTransactionConnectionResponseProjection.transactions", projectionDepthOnFields.getOrDefault("RefundResponseProjection.OrderTransactionConnectionResponseProjection.transactions", 0) + 1);
            this.transactions(new OrderTransactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundResponseProjection.OrderTransactionConnectionResponseProjection.transactions", 0)));
        }
        this.typename();
        return this;
    }

    public RefundResponseProjection id() {
        return id(null);
    }

    public RefundResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RefundResponseProjection refundLineItems(RefundLineItemConnectionResponseProjection subProjection) {
        return refundLineItems((String)null, subProjection);
    }

    public RefundResponseProjection refundLineItems(String alias, RefundLineItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refundLineItems").alias(alias).projection(subProjection));
        return this;
    }

    public RefundResponseProjection refundLineItems(RefundRefundLineItemsParametrizedInput input, RefundLineItemConnectionResponseProjection subProjection) {
        return refundLineItems(null, input, subProjection);
    }

    public RefundResponseProjection refundLineItems(String alias, RefundRefundLineItemsParametrizedInput input, RefundLineItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refundLineItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RefundResponseProjection transactions(OrderTransactionConnectionResponseProjection subProjection) {
        return transactions((String)null, subProjection);
    }

    public RefundResponseProjection transactions(String alias, OrderTransactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("transactions").alias(alias).projection(subProjection));
        return this;
    }

    public RefundResponseProjection transactions(RefundTransactionsParametrizedInput input, OrderTransactionConnectionResponseProjection subProjection) {
        return transactions(null, input, subProjection);
    }

    public RefundResponseProjection transactions(String alias, RefundTransactionsParametrizedInput input, OrderTransactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("transactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RefundResponseProjection typename() {
        return typename(null);
    }

    public RefundResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
