package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CountryHarmonizedSystemCode
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CountryHarmonizedSystemCodeResponseProjection extends GraphQLResponseProjection {

    public CountryHarmonizedSystemCodeResponseProjection() {
    }

    @Override
    public CountryHarmonizedSystemCodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CountryHarmonizedSystemCodeResponseProjection all$(int maxDepth) {
        this.countryCode();
        this.harmonizedSystemCode();
        this.typename();
        return this;
    }

    public CountryHarmonizedSystemCodeResponseProjection countryCode() {
        return countryCode(null);
    }

    public CountryHarmonizedSystemCodeResponseProjection countryCode(String alias) {
        fields.add(new GraphQLResponseField("countryCode").alias(alias));
        return this;
    }

    public CountryHarmonizedSystemCodeResponseProjection harmonizedSystemCode() {
        return harmonizedSystemCode(null);
    }

    public CountryHarmonizedSystemCodeResponseProjection harmonizedSystemCode(String alias) {
        fields.add(new GraphQLResponseField("harmonizedSystemCode").alias(alias));
        return this;
    }

    public CountryHarmonizedSystemCodeResponseProjection typename() {
        return typename(null);
    }

    public CountryHarmonizedSystemCodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
