package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MetafieldEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MetafieldEdgeResponseProjection extends GraphQLResponseProjection {

    public MetafieldEdgeResponseProjection() {
    }

    @Override
    public MetafieldEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MetafieldEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("MetafieldEdgeResponseProjection.MetafieldResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("MetafieldEdgeResponseProjection.MetafieldResponseProjection.node", projectionDepthOnFields.getOrDefault("MetafieldEdgeResponseProjection.MetafieldResponseProjection.node", 0) + 1);
            this.node(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MetafieldEdgeResponseProjection.MetafieldResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public MetafieldEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public MetafieldEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public MetafieldEdgeResponseProjection node(MetafieldResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public MetafieldEdgeResponseProjection node(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public MetafieldEdgeResponseProjection typename() {
        return typename(null);
    }

    public MetafieldEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
