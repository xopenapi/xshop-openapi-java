package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Shop
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ShopResponseProjection extends GraphQLResponseProjection {

    public ShopResponseProjection() {
    }

    @Override
    public ShopResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ShopResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ShopResponseProjection.ShopAlertResponseProjection.alerts", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShopResponseProjection.ShopAlertResponseProjection.alerts", projectionDepthOnFields.getOrDefault("ShopResponseProjection.ShopAlertResponseProjection.alerts", 0) + 1);
            this.alerts(new ShopAlertResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShopResponseProjection.ShopAlertResponseProjection.alerts", 0)));
        }
        this.currencyCode();
        this.typename();
        return this;
    }

    public ShopResponseProjection id() {
        return id(null);
    }

    public ShopResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ShopResponseProjection alerts(ShopAlertResponseProjection subProjection) {
        return alerts(null, subProjection);
    }

    public ShopResponseProjection alerts(String alias, ShopAlertResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("alerts").alias(alias).projection(subProjection));
        return this;
    }

    public ShopResponseProjection currencyCode() {
        return currencyCode(null);
    }

    public ShopResponseProjection currencyCode(String alias) {
        fields.add(new GraphQLResponseField("currencyCode").alias(alias));
        return this;
    }

    public ShopResponseProjection typename() {
        return typename(null);
    }

    public ShopResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
