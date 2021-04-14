package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FulfillmentTrackingInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class FulfillmentTrackingInfoResponseProjection extends GraphQLResponseProjection {

    public FulfillmentTrackingInfoResponseProjection() {
    }

    @Override
    public FulfillmentTrackingInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FulfillmentTrackingInfoResponseProjection all$(int maxDepth) {
        this.company();
        this.number();
        this.url();
        this.typename();
        return this;
    }

    public FulfillmentTrackingInfoResponseProjection company() {
        return company(null);
    }

    public FulfillmentTrackingInfoResponseProjection company(String alias) {
        fields.add(new GraphQLResponseField("company").alias(alias));
        return this;
    }

    public FulfillmentTrackingInfoResponseProjection number() {
        return number(null);
    }

    public FulfillmentTrackingInfoResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public FulfillmentTrackingInfoResponseProjection url() {
        return url(null);
    }

    public FulfillmentTrackingInfoResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public FulfillmentTrackingInfoResponseProjection typename() {
        return typename(null);
    }

    public FulfillmentTrackingInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
