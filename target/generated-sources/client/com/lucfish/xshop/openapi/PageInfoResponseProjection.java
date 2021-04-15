package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PageInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class PageInfoResponseProjection extends GraphQLResponseProjection {

    public PageInfoResponseProjection() {
    }

    @Override
    public PageInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PageInfoResponseProjection all$(int maxDepth) {
        this.hasNextPage();
        this.hasPreviousPage();
        this.startCursor();
        this.endCursor();
        this.typename();
        return this;
    }

    public PageInfoResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public PageInfoResponseProjection hasNextPage(String alias) {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public PageInfoResponseProjection hasPreviousPage(String alias) {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection startCursor() {
        return startCursor(null);
    }

    public PageInfoResponseProjection startCursor(String alias) {
        fields.add(new GraphQLResponseField("startCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection endCursor() {
        return endCursor(null);
    }

    public PageInfoResponseProjection endCursor(String alias) {
        fields.add(new GraphQLResponseField("endCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection typename() {
        return typename(null);
    }

    public PageInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
