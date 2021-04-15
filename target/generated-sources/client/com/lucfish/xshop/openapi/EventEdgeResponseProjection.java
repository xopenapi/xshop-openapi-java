package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class EventEdgeResponseProjection extends GraphQLResponseProjection {

    public EventEdgeResponseProjection() {
    }

    @Override
    public EventEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("EventEdgeResponseProjection.EventResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventEdgeResponseProjection.EventResponseProjection.node", projectionDepthOnFields.getOrDefault("EventEdgeResponseProjection.EventResponseProjection.node", 0) + 1);
            this.node(new EventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventEdgeResponseProjection.EventResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public EventEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EventEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EventEdgeResponseProjection node(EventResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EventEdgeResponseProjection node(String alias, EventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EventEdgeResponseProjection typename() {
        return typename(null);
    }

    public EventEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
