package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EditableProperty
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class EditablePropertyResponseProjection extends GraphQLResponseProjection {

    public EditablePropertyResponseProjection() {
    }

    @Override
    public EditablePropertyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EditablePropertyResponseProjection all$(int maxDepth) {
        this.locked();
        this.reason();
        this.typename();
        return this;
    }

    public EditablePropertyResponseProjection locked() {
        return locked(null);
    }

    public EditablePropertyResponseProjection locked(String alias) {
        fields.add(new GraphQLResponseField("locked").alias(alias));
        return this;
    }

    public EditablePropertyResponseProjection reason() {
        return reason(null);
    }

    public EditablePropertyResponseProjection reason(String alias) {
        fields.add(new GraphQLResponseField("reason").alias(alias));
        return this;
    }

    public EditablePropertyResponseProjection typename() {
        return typename(null);
    }

    public EditablePropertyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
