package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DiscountApplication
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class DiscountApplicationResponseProjection extends GraphQLResponseProjection {

    public DiscountApplicationResponseProjection() {
    }

    @Override
    public DiscountApplicationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DiscountApplicationResponseProjection all$(int maxDepth) {
        this.allocationMethod();
        this.index();
        this.targetSelection();
        this.targetType();
        if (projectionDepthOnFields.getOrDefault("DiscountApplicationResponseProjection.PricingValueResponseProjection.value", 0) <= maxDepth) {
            projectionDepthOnFields.put("DiscountApplicationResponseProjection.PricingValueResponseProjection.value", projectionDepthOnFields.getOrDefault("DiscountApplicationResponseProjection.PricingValueResponseProjection.value", 0) + 1);
            this.value(new PricingValueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DiscountApplicationResponseProjection.PricingValueResponseProjection.value", 0)));
        }
        this.typename();
        return this;
    }

    public DiscountApplicationResponseProjection allocationMethod() {
        return allocationMethod(null);
    }

    public DiscountApplicationResponseProjection allocationMethod(String alias) {
        fields.add(new GraphQLResponseField("allocationMethod").alias(alias));
        return this;
    }

    public DiscountApplicationResponseProjection index() {
        return index(null);
    }

    public DiscountApplicationResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public DiscountApplicationResponseProjection targetSelection() {
        return targetSelection(null);
    }

    public DiscountApplicationResponseProjection targetSelection(String alias) {
        fields.add(new GraphQLResponseField("targetSelection").alias(alias));
        return this;
    }

    public DiscountApplicationResponseProjection targetType() {
        return targetType(null);
    }

    public DiscountApplicationResponseProjection targetType(String alias) {
        fields.add(new GraphQLResponseField("targetType").alias(alias));
        return this;
    }

    public DiscountApplicationResponseProjection value(PricingValueResponseProjection subProjection) {
        return value(null, subProjection);
    }

    public DiscountApplicationResponseProjection value(String alias, PricingValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("value").alias(alias).projection(subProjection));
        return this;
    }

    public DiscountApplicationResponseProjection typename() {
        return typename(null);
    }

    public DiscountApplicationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
