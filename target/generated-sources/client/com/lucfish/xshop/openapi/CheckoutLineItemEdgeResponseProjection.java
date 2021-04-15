package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckoutLineItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutLineItemEdgeResponseProjection extends GraphQLResponseProjection {

    public CheckoutLineItemEdgeResponseProjection() {
    }

    @Override
    public CheckoutLineItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CheckoutLineItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CheckoutLineItemEdgeResponseProjection.CheckoutLineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutLineItemEdgeResponseProjection.CheckoutLineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("CheckoutLineItemEdgeResponseProjection.CheckoutLineItemResponseProjection.node", 0) + 1);
            this.node(new CheckoutLineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutLineItemEdgeResponseProjection.CheckoutLineItemResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CheckoutLineItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CheckoutLineItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CheckoutLineItemEdgeResponseProjection node(CheckoutLineItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CheckoutLineItemEdgeResponseProjection node(String alias, CheckoutLineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutLineItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public CheckoutLineItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
