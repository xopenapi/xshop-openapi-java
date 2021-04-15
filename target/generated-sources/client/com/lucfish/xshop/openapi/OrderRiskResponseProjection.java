package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderRisk
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderRiskResponseProjection extends GraphQLResponseProjection {

    public OrderRiskResponseProjection() {
    }

    @Override
    public OrderRiskResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderRiskResponseProjection all$(int maxDepth) {
        this.display();
        this.level();
        this.message();
        this.typename();
        return this;
    }

    public OrderRiskResponseProjection display() {
        return display(null);
    }

    public OrderRiskResponseProjection display(String alias) {
        fields.add(new GraphQLResponseField("display").alias(alias));
        return this;
    }

    public OrderRiskResponseProjection level() {
        return level(null);
    }

    public OrderRiskResponseProjection level(String alias) {
        fields.add(new GraphQLResponseField("level").alias(alias));
        return this;
    }

    public OrderRiskResponseProjection message() {
        return message(null);
    }

    public OrderRiskResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public OrderRiskResponseProjection typename() {
        return typename(null);
    }

    public OrderRiskResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
