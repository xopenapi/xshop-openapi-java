package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckoutUserError
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutUserErrorResponseProjection extends GraphQLResponseProjection {

    public CheckoutUserErrorResponseProjection() {
    }

    @Override
    public CheckoutUserErrorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CheckoutUserErrorResponseProjection all$(int maxDepth) {
        this.code();
        this.field();
        this.message();
        this.typename();
        return this;
    }

    public CheckoutUserErrorResponseProjection code() {
        return code(null);
    }

    public CheckoutUserErrorResponseProjection code(String alias) {
        fields.add(new GraphQLResponseField("code").alias(alias));
        return this;
    }

    public CheckoutUserErrorResponseProjection field() {
        return field(null);
    }

    public CheckoutUserErrorResponseProjection field(String alias) {
        fields.add(new GraphQLResponseField("field").alias(alias));
        return this;
    }

    public CheckoutUserErrorResponseProjection message() {
        return message(null);
    }

    public CheckoutUserErrorResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public CheckoutUserErrorResponseProjection typename() {
        return typename(null);
    }

    public CheckoutUserErrorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
