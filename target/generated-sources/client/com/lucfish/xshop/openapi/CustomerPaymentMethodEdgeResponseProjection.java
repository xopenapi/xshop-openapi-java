package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerPaymentMethodEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CustomerPaymentMethodEdgeResponseProjection extends GraphQLResponseProjection {

    public CustomerPaymentMethodEdgeResponseProjection() {
    }

    @Override
    public CustomerPaymentMethodEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomerPaymentMethodEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CustomerPaymentMethodEdgeResponseProjection.CustomerPaymentMethodResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerPaymentMethodEdgeResponseProjection.CustomerPaymentMethodResponseProjection.node", projectionDepthOnFields.getOrDefault("CustomerPaymentMethodEdgeResponseProjection.CustomerPaymentMethodResponseProjection.node", 0) + 1);
            this.node(new CustomerPaymentMethodResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerPaymentMethodEdgeResponseProjection.CustomerPaymentMethodResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CustomerPaymentMethodEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CustomerPaymentMethodEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CustomerPaymentMethodEdgeResponseProjection node(CustomerPaymentMethodResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CustomerPaymentMethodEdgeResponseProjection node(String alias, CustomerPaymentMethodResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerPaymentMethodEdgeResponseProjection typename() {
        return typename(null);
    }

    public CustomerPaymentMethodEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
