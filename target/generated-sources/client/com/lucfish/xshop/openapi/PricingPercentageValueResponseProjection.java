package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PricingPercentageValue
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class PricingPercentageValueResponseProjection extends GraphQLResponseProjection {

    public PricingPercentageValueResponseProjection() {
    }

    @Override
    public PricingPercentageValueResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PricingPercentageValueResponseProjection all$(int maxDepth) {
        this.percentage();
        this.typename();
        return this;
    }

    public PricingPercentageValueResponseProjection percentage() {
        return percentage(null);
    }

    public PricingPercentageValueResponseProjection percentage(String alias) {
        fields.add(new GraphQLResponseField("percentage").alias(alias));
        return this;
    }

    public PricingPercentageValueResponseProjection typename() {
        return typename(null);
    }

    public PricingPercentageValueResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
