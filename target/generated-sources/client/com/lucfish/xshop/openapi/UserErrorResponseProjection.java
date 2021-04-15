package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserError
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class UserErrorResponseProjection extends GraphQLResponseProjection {

    public UserErrorResponseProjection() {
    }

    @Override
    public UserErrorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserErrorResponseProjection all$(int maxDepth) {
        this.field();
        this.message();
        this.typename();
        return this;
    }

    public UserErrorResponseProjection field() {
        return field(null);
    }

    public UserErrorResponseProjection field(String alias) {
        fields.add(new GraphQLResponseField("field").alias(alias));
        return this;
    }

    public UserErrorResponseProjection message() {
        return message(null);
    }

    public UserErrorResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public UserErrorResponseProjection typename() {
        return typename(null);
    }

    public UserErrorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
