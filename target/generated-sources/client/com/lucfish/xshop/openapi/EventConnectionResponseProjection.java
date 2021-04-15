package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class EventConnectionResponseProjection extends GraphQLResponseProjection {

    public EventConnectionResponseProjection() {
    }

    @Override
    public EventConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EventConnectionResponseProjection.EventEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventConnectionResponseProjection.EventEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EventConnectionResponseProjection.EventEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EventEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventConnectionResponseProjection.EventEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EventConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EventConnectionResponseProjection edges(EventEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EventConnectionResponseProjection edges(String alias, EventEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EventConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EventConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EventConnectionResponseProjection typename() {
        return typename(null);
    }

    public EventConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
