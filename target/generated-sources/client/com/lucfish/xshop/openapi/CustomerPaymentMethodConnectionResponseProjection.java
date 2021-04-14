package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerPaymentMethodConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CustomerPaymentMethodConnectionResponseProjection extends GraphQLResponseProjection {

    public CustomerPaymentMethodConnectionResponseProjection() {
    }

    @Override
    public CustomerPaymentMethodConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomerPaymentMethodConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CustomerPaymentMethodConnectionResponseProjection.CustomerPaymentMethodEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerPaymentMethodConnectionResponseProjection.CustomerPaymentMethodEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CustomerPaymentMethodConnectionResponseProjection.CustomerPaymentMethodEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CustomerPaymentMethodEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerPaymentMethodConnectionResponseProjection.CustomerPaymentMethodEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerPaymentMethodConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerPaymentMethodConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CustomerPaymentMethodConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerPaymentMethodConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CustomerPaymentMethodConnectionResponseProjection edges(CustomerPaymentMethodEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CustomerPaymentMethodConnectionResponseProjection edges(String alias, CustomerPaymentMethodEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerPaymentMethodConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CustomerPaymentMethodConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerPaymentMethodConnectionResponseProjection typename() {
        return typename(null);
    }

    public CustomerPaymentMethodConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
