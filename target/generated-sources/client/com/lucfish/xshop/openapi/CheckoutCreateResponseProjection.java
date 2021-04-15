package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckoutCreate
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutCreateResponseProjection extends GraphQLResponseProjection {

    public CheckoutCreateResponseProjection() {
    }

    @Override
    public CheckoutCreateResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CheckoutCreateResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CheckoutCreateResponseProjection.CheckoutResponseProjection.checkout", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutCreateResponseProjection.CheckoutResponseProjection.checkout", projectionDepthOnFields.getOrDefault("CheckoutCreateResponseProjection.CheckoutResponseProjection.checkout", 0) + 1);
            this.checkout(new CheckoutResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutCreateResponseProjection.CheckoutResponseProjection.checkout", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CheckoutCreateResponseProjection.CheckoutUserErrorResponseProjection.checkoutUserErrors", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckoutCreateResponseProjection.CheckoutUserErrorResponseProjection.checkoutUserErrors", projectionDepthOnFields.getOrDefault("CheckoutCreateResponseProjection.CheckoutUserErrorResponseProjection.checkoutUserErrors", 0) + 1);
            this.checkoutUserErrors(new CheckoutUserErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckoutCreateResponseProjection.CheckoutUserErrorResponseProjection.checkoutUserErrors", 0)));
        }
        this.typename();
        return this;
    }

    public CheckoutCreateResponseProjection checkout(CheckoutResponseProjection subProjection) {
        return checkout(null, subProjection);
    }

    public CheckoutCreateResponseProjection checkout(String alias, CheckoutResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkout").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutCreateResponseProjection checkoutUserErrors(CheckoutUserErrorResponseProjection subProjection) {
        return checkoutUserErrors(null, subProjection);
    }

    public CheckoutCreateResponseProjection checkoutUserErrors(String alias, CheckoutUserErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkoutUserErrors").alias(alias).projection(subProjection));
        return this;
    }

    public CheckoutCreateResponseProjection typename() {
        return typename(null);
    }

    public CheckoutCreateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
