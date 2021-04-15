package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ShippingMethod
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ShippingMethodResponseProjection extends GraphQLResponseProjection {

    public ShippingMethodResponseProjection() {
    }

    @Override
    public ShippingMethodResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ShippingMethodResponseProjection all$(int maxDepth) {
        this.code();
        this.label();
        this.typename();
        return this;
    }

    public ShippingMethodResponseProjection code() {
        return code(null);
    }

    public ShippingMethodResponseProjection code(String alias) {
        fields.add(new GraphQLResponseField("code").alias(alias));
        return this;
    }

    public ShippingMethodResponseProjection label() {
        return label(null);
    }

    public ShippingMethodResponseProjection label(String alias) {
        fields.add(new GraphQLResponseField("label").alias(alias));
        return this;
    }

    public ShippingMethodResponseProjection typename() {
        return typename(null);
    }

    public ShippingMethodResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
