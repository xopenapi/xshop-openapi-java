package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Tag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class TagResponseProjection extends GraphQLResponseProjection {

    public TagResponseProjection() {
    }

    @Override
    public TagResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TagResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.TagGroupResponseProjection.group", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.TagGroupResponseProjection.group", projectionDepthOnFields.getOrDefault("TagResponseProjection.TagGroupResponseProjection.group", 0) + 1);
            this.group(new TagGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.TagGroupResponseProjection.group", 0)));
        }
        this.value();
        this.weight();
        this.typename();
        return this;
    }

    public TagResponseProjection id() {
        return id(null);
    }

    public TagResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TagResponseProjection group(TagGroupResponseProjection subProjection) {
        return group(null, subProjection);
    }

    public TagResponseProjection group(String alias, TagGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("group").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection value() {
        return value(null);
    }

    public TagResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public TagResponseProjection weight() {
        return weight(null);
    }

    public TagResponseProjection weight(String alias) {
        fields.add(new GraphQLResponseField("weight").alias(alias));
        return this;
    }

    public TagResponseProjection typename() {
        return typename(null);
    }

    public TagResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
