package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RefundLineItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class RefundLineItemEdgeResponseProjection extends GraphQLResponseProjection {

    public RefundLineItemEdgeResponseProjection() {
    }

    @Override
    public RefundLineItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefundLineItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RefundLineItemEdgeResponseProjection.RefundLineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefundLineItemEdgeResponseProjection.RefundLineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("RefundLineItemEdgeResponseProjection.RefundLineItemResponseProjection.node", 0) + 1);
            this.node(new RefundLineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefundLineItemEdgeResponseProjection.RefundLineItemResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RefundLineItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RefundLineItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RefundLineItemEdgeResponseProjection node(RefundLineItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RefundLineItemEdgeResponseProjection node(String alias, RefundLineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RefundLineItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public RefundLineItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
