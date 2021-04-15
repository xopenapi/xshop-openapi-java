package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TaxLine
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class TaxLineResponseProjection extends GraphQLResponseProjection {

    public TaxLineResponseProjection() {
    }

    @Override
    public TaxLineResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TaxLineResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TaxLineResponseProjection.MoneyBagResponseProjection.priceSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("TaxLineResponseProjection.MoneyBagResponseProjection.priceSet", projectionDepthOnFields.getOrDefault("TaxLineResponseProjection.MoneyBagResponseProjection.priceSet", 0) + 1);
            this.priceSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TaxLineResponseProjection.MoneyBagResponseProjection.priceSet", 0)));
        }
        this.rate();
        this.ratePercentage();
        this.title();
        this.typename();
        return this;
    }

    public TaxLineResponseProjection priceSet(MoneyBagResponseProjection subProjection) {
        return priceSet(null, subProjection);
    }

    public TaxLineResponseProjection priceSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("priceSet").alias(alias).projection(subProjection));
        return this;
    }

    public TaxLineResponseProjection rate() {
        return rate(null);
    }

    public TaxLineResponseProjection rate(String alias) {
        fields.add(new GraphQLResponseField("rate").alias(alias));
        return this;
    }

    public TaxLineResponseProjection ratePercentage() {
        return ratePercentage(null);
    }

    public TaxLineResponseProjection ratePercentage(String alias) {
        fields.add(new GraphQLResponseField("ratePercentage").alias(alias));
        return this;
    }

    public TaxLineResponseProjection title() {
        return title(null);
    }

    public TaxLineResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public TaxLineResponseProjection typename() {
        return typename(null);
    }

    public TaxLineResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
