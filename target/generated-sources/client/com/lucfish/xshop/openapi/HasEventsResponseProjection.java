package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for HasEvents
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class HasEventsResponseProjection extends GraphQLResponseProjection {

    public HasEventsResponseProjection() {
    }

    @Override
    public HasEventsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public HasEventsResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("HasEventsResponseProjection.EventConnectionResponseProjection.events", 0) <= maxDepth) {
            projectionDepthOnFields.put("HasEventsResponseProjection.EventConnectionResponseProjection.events", projectionDepthOnFields.getOrDefault("HasEventsResponseProjection.EventConnectionResponseProjection.events", 0) + 1);
            this.events(new EventConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HasEventsResponseProjection.EventConnectionResponseProjection.events", 0)));
        }
        this.typename();
        return this;
    }

    public HasEventsResponseProjection events(EventConnectionResponseProjection subProjection) {
        return events((String)null, subProjection);
    }

    public HasEventsResponseProjection events(String alias, EventConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("events").alias(alias).projection(subProjection));
        return this;
    }

    public HasEventsResponseProjection events(HasEventsEventsParametrizedInput input, EventConnectionResponseProjection subProjection) {
        return events(null, input, subProjection);
    }

    public HasEventsResponseProjection events(String alias, HasEventsEventsParametrizedInput input, EventConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("events").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public HasEventsResponseProjection onOrder(OrderResponseProjection subProjection) {
        return onOrder(null, subProjection);
    }

    public HasEventsResponseProjection onOrder(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Order").alias(alias).projection(subProjection));
        return this;
    }

    public HasEventsResponseProjection onCustomer(CustomerResponseProjection subProjection) {
        return onCustomer(null, subProjection);
    }

    public HasEventsResponseProjection onCustomer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Customer").alias(alias).projection(subProjection));
        return this;
    }

    public HasEventsResponseProjection typename() {
        return typename(null);
    }

    public HasEventsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
