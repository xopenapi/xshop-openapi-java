package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MoneyBag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MoneyBagResponseProjection extends GraphQLResponseProjection {

    public MoneyBagResponseProjection() {
    }

    @Override
    public MoneyBagResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MoneyBagResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MoneyBagResponseProjection.MoneyResponseProjection.presentmentMoney", 0) <= maxDepth) {
            projectionDepthOnFields.put("MoneyBagResponseProjection.MoneyResponseProjection.presentmentMoney", projectionDepthOnFields.getOrDefault("MoneyBagResponseProjection.MoneyResponseProjection.presentmentMoney", 0) + 1);
            this.presentmentMoney(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MoneyBagResponseProjection.MoneyResponseProjection.presentmentMoney", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MoneyBagResponseProjection.MoneyResponseProjection.shopMoney", 0) <= maxDepth) {
            projectionDepthOnFields.put("MoneyBagResponseProjection.MoneyResponseProjection.shopMoney", projectionDepthOnFields.getOrDefault("MoneyBagResponseProjection.MoneyResponseProjection.shopMoney", 0) + 1);
            this.shopMoney(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MoneyBagResponseProjection.MoneyResponseProjection.shopMoney", 0)));
        }
        this.typename();
        return this;
    }

    public MoneyBagResponseProjection presentmentMoney(MoneyResponseProjection subProjection) {
        return presentmentMoney(null, subProjection);
    }

    public MoneyBagResponseProjection presentmentMoney(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("presentmentMoney").alias(alias).projection(subProjection));
        return this;
    }

    public MoneyBagResponseProjection shopMoney(MoneyResponseProjection subProjection) {
        return shopMoney(null, subProjection);
    }

    public MoneyBagResponseProjection shopMoney(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("shopMoney").alias(alias).projection(subProjection));
        return this;
    }

    public MoneyBagResponseProjection typename() {
        return typename(null);
    }

    public MoneyBagResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
