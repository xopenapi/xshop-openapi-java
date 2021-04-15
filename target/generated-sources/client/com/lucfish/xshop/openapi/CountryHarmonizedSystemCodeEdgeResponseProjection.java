package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CountryHarmonizedSystemCodeEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CountryHarmonizedSystemCodeEdgeResponseProjection extends GraphQLResponseProjection {

    public CountryHarmonizedSystemCodeEdgeResponseProjection() {
    }

    @Override
    public CountryHarmonizedSystemCodeEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CountryHarmonizedSystemCodeEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeEdgeResponseProjection.CountryHarmonizedSystemCodeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CountryHarmonizedSystemCodeEdgeResponseProjection.CountryHarmonizedSystemCodeResponseProjection.node", projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeEdgeResponseProjection.CountryHarmonizedSystemCodeResponseProjection.node", 0) + 1);
            this.node(new CountryHarmonizedSystemCodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeEdgeResponseProjection.CountryHarmonizedSystemCodeResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CountryHarmonizedSystemCodeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CountryHarmonizedSystemCodeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CountryHarmonizedSystemCodeEdgeResponseProjection node(CountryHarmonizedSystemCodeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CountryHarmonizedSystemCodeEdgeResponseProjection node(String alias, CountryHarmonizedSystemCodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CountryHarmonizedSystemCodeEdgeResponseProjection typename() {
        return typename(null);
    }

    public CountryHarmonizedSystemCodeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
