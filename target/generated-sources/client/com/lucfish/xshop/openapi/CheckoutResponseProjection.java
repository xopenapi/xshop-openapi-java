package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Checkout
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutResponseProjection extends GraphQLResponseProjection {

    public CheckoutResponseProjection() {
    }

    @Override
    public CheckoutResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CheckoutResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("CheckoutResponseProjection.OrderResponseProjection.order", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutResponseProjection.OrderResponseProjection.order", projectionDepthOnFields.getOrDefault("CheckoutResponseProjection.OrderResponseProjection.order", 0) + 1);
            this.order(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutResponseProjection.OrderResponseProjection.order", 0)));
        }
        this.note();
        if (projectionDepthOnFields.getOrDefault("CheckoutResponseProjection.CheckoutLineItemConnectionResponseProjection.lineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutResponseProjection.CheckoutLineItemConnectionResponseProjection.lineItems", projectionDepthOnFields.getOrDefault("CheckoutResponseProjection.CheckoutLineItemConnectionResponseProjection.lineItems", 0) + 1);
            this.lineItems(new CheckoutLineItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutResponseProjection.CheckoutLineItemConnectionResponseProjection.lineItems", 0)));
        }
        this.typename();
        return this;
    }

    public CheckoutResponseProjection id() {
        return id(null);
    }

    public CheckoutResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckoutResponseProjection order(OrderResponseProjection subProjection) {
        return order(null, subProjection);
    }

    public CheckoutResponseProjection order(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("order").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutResponseProjection note() {
        return note(null);
    }

    public CheckoutResponseProjection note(String alias) {
        fields.add(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public CheckoutResponseProjection lineItems(CheckoutLineItemConnectionResponseProjection subProjection) {
        return lineItems((String)null, subProjection);
    }

    public CheckoutResponseProjection lineItems(String alias, CheckoutLineItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lineItems").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutResponseProjection lineItems(CheckoutLineItemsParametrizedInput input, CheckoutLineItemConnectionResponseProjection subProjection) {
        return lineItems(null, input, subProjection);
    }

    public CheckoutResponseProjection lineItems(String alias, CheckoutLineItemsParametrizedInput input, CheckoutLineItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lineItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CheckoutResponseProjection typename() {
        return typename(null);
    }

    public CheckoutResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
