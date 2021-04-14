package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TagGroup
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class TagGroupResponseProjection extends GraphQLResponseProjection {

    public TagGroupResponseProjection() {
    }

    @Override
    public TagGroupResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TagGroupResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.typename();
        return this;
    }

    public TagGroupResponseProjection id() {
        return id(null);
    }

    public TagGroupResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TagGroupResponseProjection title() {
        return title(null);
    }

    public TagGroupResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public TagGroupResponseProjection typename() {
        return typename(null);
    }

    public TagGroupResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
