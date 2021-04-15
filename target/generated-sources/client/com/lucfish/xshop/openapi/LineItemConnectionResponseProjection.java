package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LineItemConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class LineItemConnectionResponseProjection extends GraphQLResponseProjection {

    public LineItemConnectionResponseProjection() {
    }

    @Override
    public LineItemConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LineItemConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LineItemConnectionResponseProjection.LineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemConnectionResponseProjection.LineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LineItemConnectionResponseProjection.LineItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemConnectionResponseProjection.LineItemEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public LineItemConnectionResponseProjection edges(LineItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LineItemConnectionResponseProjection edges(String alias, LineItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LineItemConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemConnectionResponseProjection typename() {
        return typename(null);
    }

    public LineItemConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
