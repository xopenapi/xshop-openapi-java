package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ShopAlertAction
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ShopAlertActionResponseProjection extends GraphQLResponseProjection {

    public ShopAlertActionResponseProjection() {
    }

    @Override
    public ShopAlertActionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ShopAlertActionResponseProjection all$(int maxDepth) {
        this.title();
        this.url();
        this.typename();
        return this;
    }

    public ShopAlertActionResponseProjection title() {
        return title(null);
    }

    public ShopAlertActionResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public ShopAlertActionResponseProjection url() {
        return url(null);
    }

    public ShopAlertActionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ShopAlertActionResponseProjection typename() {
        return typename(null);
    }

    public ShopAlertActionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
