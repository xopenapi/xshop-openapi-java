package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProductVariant
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductVariantResponseProjection extends GraphQLResponseProjection {

    public ProductVariantResponseProjection() {
    }

    @Override
    public ProductVariantResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProductVariantResponseProjection all$(int maxDepth) {
        this.id();
        this.typename();
        return this;
    }

    public ProductVariantResponseProjection id() {
        return id(null);
    }

    public ProductVariantResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProductVariantResponseProjection typename() {
        return typename(null);
    }

    public ProductVariantResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
