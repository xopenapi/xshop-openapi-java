package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ShopAlert
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ShopAlertResponseProjection extends GraphQLResponseProjection {

    public ShopAlertResponseProjection() {
    }

    @Override
    public ShopAlertResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ShopAlertResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ShopAlertResponseProjection.ShopAlertActionResponseProjection.action", 0) <= maxDepth) {
            projectionDepthOnFields.put("ShopAlertResponseProjection.ShopAlertActionResponseProjection.action", projectionDepthOnFields.getOrDefault("ShopAlertResponseProjection.ShopAlertActionResponseProjection.action", 0) + 1);
            this.action(new ShopAlertActionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ShopAlertResponseProjection.ShopAlertActionResponseProjection.action", 0)));
        }
        this.description();
        this.typename();
        return this;
    }

    public ShopAlertResponseProjection action(ShopAlertActionResponseProjection subProjection) {
        return action(null, subProjection);
    }

    public ShopAlertResponseProjection action(String alias, ShopAlertActionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("action").alias(alias).projection(subProjection));
        return this;
    }

    public ShopAlertResponseProjection description() {
        return description(null);
    }

    public ShopAlertResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ShopAlertResponseProjection typename() {
        return typename(null);
    }

    public ShopAlertResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
