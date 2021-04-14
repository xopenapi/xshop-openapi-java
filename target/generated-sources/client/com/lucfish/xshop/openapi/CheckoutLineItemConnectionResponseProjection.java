package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckoutLineItemConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CheckoutLineItemConnectionResponseProjection extends GraphQLResponseProjection {

    public CheckoutLineItemConnectionResponseProjection() {
    }

    @Override
    public CheckoutLineItemConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CheckoutLineItemConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CheckoutLineItemConnectionResponseProjection.CheckoutLineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutLineItemConnectionResponseProjection.CheckoutLineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CheckoutLineItemConnectionResponseProjection.CheckoutLineItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CheckoutLineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutLineItemConnectionResponseProjection.CheckoutLineItemEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CheckoutLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CheckoutLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutLineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CheckoutLineItemConnectionResponseProjection edges(CheckoutLineItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CheckoutLineItemConnectionResponseProjection edges(String alias, CheckoutLineItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutLineItemConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CheckoutLineItemConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutLineItemConnectionResponseProjection typename() {
        return typename(null);
    }

    public CheckoutLineItemConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
