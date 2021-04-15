package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SEO
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class SEOResponseProjection extends GraphQLResponseProjection {

    public SEOResponseProjection() {
    }

    @Override
    public SEOResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SEOResponseProjection all$(int maxDepth) {
        this.description();
        this.title();
        this.typename();
        return this;
    }

    public SEOResponseProjection description() {
        return description(null);
    }

    public SEOResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public SEOResponseProjection title() {
        return title(null);
    }

    public SEOResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public SEOResponseProjection typename() {
        return typename(null);
    }

    public SEOResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
