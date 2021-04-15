package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerCreditCard
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CustomerCreditCardResponseProjection extends GraphQLResponseProjection {

    public CustomerCreditCardResponseProjection() {
    }

    @Override
    public CustomerCreditCardResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomerCreditCardResponseProjection all$(int maxDepth) {
        this.name();
        this.typename();
        return this;
    }

    public CustomerCreditCardResponseProjection name() {
        return name(null);
    }

    public CustomerCreditCardResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CustomerCreditCardResponseProjection typename() {
        return typename(null);
    }

    public CustomerCreditCardResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
