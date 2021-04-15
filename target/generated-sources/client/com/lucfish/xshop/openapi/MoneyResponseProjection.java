package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Money
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MoneyResponseProjection extends GraphQLResponseProjection {

    public MoneyResponseProjection() {
    }

    @Override
    public MoneyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MoneyResponseProjection all$(int maxDepth) {
        this.amount();
        this.currencyCode();
        this.typename();
        return this;
    }

    public MoneyResponseProjection amount() {
        return amount(null);
    }

    public MoneyResponseProjection amount(String alias) {
        fields.add(new GraphQLResponseField("amount").alias(alias));
        return this;
    }

    public MoneyResponseProjection currencyCode() {
        return currencyCode(null);
    }

    public MoneyResponseProjection currencyCode(String alias) {
        fields.add(new GraphQLResponseField("currencyCode").alias(alias));
        return this;
    }

    public MoneyResponseProjection typename() {
        return typename(null);
    }

    public MoneyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
