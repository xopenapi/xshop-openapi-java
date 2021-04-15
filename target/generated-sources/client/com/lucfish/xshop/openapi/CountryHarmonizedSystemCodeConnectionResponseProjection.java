package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CountryHarmonizedSystemCodeConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CountryHarmonizedSystemCodeConnectionResponseProjection extends GraphQLResponseProjection {

    public CountryHarmonizedSystemCodeConnectionResponseProjection() {
    }

    @Override
    public CountryHarmonizedSystemCodeConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CountryHarmonizedSystemCodeConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeConnectionResponseProjection.CountryHarmonizedSystemCodeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CountryHarmonizedSystemCodeConnectionResponseProjection.CountryHarmonizedSystemCodeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeConnectionResponseProjection.CountryHarmonizedSystemCodeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CountryHarmonizedSystemCodeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeConnectionResponseProjection.CountryHarmonizedSystemCodeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CountryHarmonizedSystemCodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CountryHarmonizedSystemCodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CountryHarmonizedSystemCodeConnectionResponseProjection edges(CountryHarmonizedSystemCodeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CountryHarmonizedSystemCodeConnectionResponseProjection edges(String alias, CountryHarmonizedSystemCodeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CountryHarmonizedSystemCodeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CountryHarmonizedSystemCodeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CountryHarmonizedSystemCodeConnectionResponseProjection typename() {
        return typename(null);
    }

    public CountryHarmonizedSystemCodeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
