package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LineItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class LineItemEdgeResponseProjection extends GraphQLResponseProjection {

    public LineItemEdgeResponseProjection() {
    }

    @Override
    public LineItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LineItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("LineItemEdgeResponseProjection.LineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LineItemEdgeResponseProjection.LineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("LineItemEdgeResponseProjection.LineItemResponseProjection.node", 0) + 1);
            this.node(new LineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LineItemEdgeResponseProjection.LineItemResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public LineItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LineItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LineItemEdgeResponseProjection node(LineItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LineItemEdgeResponseProjection node(String alias, LineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LineItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public LineItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
