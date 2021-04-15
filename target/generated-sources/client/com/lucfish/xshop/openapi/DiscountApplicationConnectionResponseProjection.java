package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DiscountApplicationConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class DiscountApplicationConnectionResponseProjection extends GraphQLResponseProjection {

    public DiscountApplicationConnectionResponseProjection() {
    }

    @Override
    public DiscountApplicationConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DiscountApplicationConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DiscountApplicationConnectionResponseProjection.DiscountApplicationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DiscountApplicationConnectionResponseProjection.DiscountApplicationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DiscountApplicationConnectionResponseProjection.DiscountApplicationEdgeResponseProjection.edges", 0) + 1);
            this.edges(new DiscountApplicationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DiscountApplicationConnectionResponseProjection.DiscountApplicationEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DiscountApplicationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DiscountApplicationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DiscountApplicationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DiscountApplicationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public DiscountApplicationConnectionResponseProjection edges(DiscountApplicationEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public DiscountApplicationConnectionResponseProjection edges(String alias, DiscountApplicationEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public DiscountApplicationConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public DiscountApplicationConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public DiscountApplicationConnectionResponseProjection typename() {
        return typename(null);
    }

    public DiscountApplicationConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
