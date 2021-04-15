package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DisplayableError
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class DisplayableErrorResponseProjection extends GraphQLResponseProjection {

    public DisplayableErrorResponseProjection() {
    }

    @Override
    public DisplayableErrorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DisplayableErrorResponseProjection all$(int maxDepth) {
        this.field();
        this.message();
        this.typename();
        return this;
    }

    public DisplayableErrorResponseProjection field() {
        return field(null);
    }

    public DisplayableErrorResponseProjection field(String alias) {
        fields.add(new GraphQLResponseField("field").alias(alias));
        return this;
    }

    public DisplayableErrorResponseProjection message() {
        return message(null);
    }

    public DisplayableErrorResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public DisplayableErrorResponseProjection onCheckoutUserError(CheckoutUserErrorResponseProjection subProjection) {
        return onCheckoutUserError(null, subProjection);
    }

    public DisplayableErrorResponseProjection onCheckoutUserError(String alias, CheckoutUserErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CheckoutUserError").alias(alias).projection(subProjection));
        return this;
    }

    public DisplayableErrorResponseProjection typename() {
        return typename(null);
    }

    public DisplayableErrorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
