package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DiscountApplicationEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class DiscountApplicationEdgeResponseProjection extends GraphQLResponseProjection {

    public DiscountApplicationEdgeResponseProjection() {
    }

    @Override
    public DiscountApplicationEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DiscountApplicationEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("DiscountApplicationEdgeResponseProjection.DiscountApplicationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DiscountApplicationEdgeResponseProjection.DiscountApplicationResponseProjection.node", projectionDepthOnFields.getOrDefault("DiscountApplicationEdgeResponseProjection.DiscountApplicationResponseProjection.node", 0) + 1);
            this.node(new DiscountApplicationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DiscountApplicationEdgeResponseProjection.DiscountApplicationResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public DiscountApplicationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public DiscountApplicationEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public DiscountApplicationEdgeResponseProjection node(DiscountApplicationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public DiscountApplicationEdgeResponseProjection node(String alias, DiscountApplicationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public DiscountApplicationEdgeResponseProjection typename() {
        return typename(null);
    }

    public DiscountApplicationEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
