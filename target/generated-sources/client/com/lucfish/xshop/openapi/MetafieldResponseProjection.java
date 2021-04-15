package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Metafield
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class MetafieldResponseProjection extends GraphQLResponseProjection {

    public MetafieldResponseProjection() {
    }

    @Override
    public MetafieldResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MetafieldResponseProjection all$(int maxDepth) {
        this.id();
        this.key();
        this.namespace();
        this.createdAt();
        this.updatedAt();
        this.value();
        this.valueType();
        this.ownerType();
        this.description();
        this.typename();
        return this;
    }

    public MetafieldResponseProjection id() {
        return id(null);
    }

    public MetafieldResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MetafieldResponseProjection key() {
        return key(null);
    }

    public MetafieldResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public MetafieldResponseProjection namespace() {
        return namespace(null);
    }

    public MetafieldResponseProjection namespace(String alias) {
        fields.add(new GraphQLResponseField("namespace").alias(alias));
        return this;
    }

    public MetafieldResponseProjection createdAt() {
        return createdAt(null);
    }

    public MetafieldResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MetafieldResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public MetafieldResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public MetafieldResponseProjection value() {
        return value(null);
    }

    public MetafieldResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public MetafieldResponseProjection valueType() {
        return valueType(null);
    }

    public MetafieldResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public MetafieldResponseProjection ownerType() {
        return ownerType(null);
    }

    public MetafieldResponseProjection ownerType(String alias) {
        fields.add(new GraphQLResponseField("ownerType").alias(alias));
        return this;
    }

    public MetafieldResponseProjection description() {
        return description(null);
    }

    public MetafieldResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public MetafieldResponseProjection typename() {
        return typename(null);
    }

    public MetafieldResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
