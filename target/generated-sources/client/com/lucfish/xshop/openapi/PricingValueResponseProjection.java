package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PricingValue
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class PricingValueResponseProjection extends GraphQLResponseProjection {

    public PricingValueResponseProjection() {
    }

    @Override
    public PricingValueResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PricingValueResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public PricingValueResponseProjection onMoney(MoneyResponseProjection subProjection) {
        return onMoney(null, subProjection);
    }

    public PricingValueResponseProjection onMoney(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Money").alias(alias).projection(subProjection));
        return this;
    }

    public PricingValueResponseProjection onPricingPercentageValue(PricingPercentageValueResponseProjection subProjection) {
        return onPricingPercentageValue(null, subProjection);
    }

    public PricingValueResponseProjection onPricingPercentageValue(String alias, PricingPercentageValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PricingPercentageValue").alias(alias).projection(subProjection));
        return this;
    }

    public PricingValueResponseProjection typename() {
        return typename(null);
    }

    public PricingValueResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
