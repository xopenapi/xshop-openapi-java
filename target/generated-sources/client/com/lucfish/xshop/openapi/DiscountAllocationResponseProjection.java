package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DiscountAllocation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class DiscountAllocationResponseProjection extends GraphQLResponseProjection {

    public DiscountAllocationResponseProjection() {
    }

    @Override
    public DiscountAllocationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DiscountAllocationResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DiscountAllocationResponseProjection.MoneyBagResponseProjection.allocatedAmountSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("DiscountAllocationResponseProjection.MoneyBagResponseProjection.allocatedAmountSet", projectionDepthOnFields.getOrDefault("DiscountAllocationResponseProjection.MoneyBagResponseProjection.allocatedAmountSet", 0) + 1);
            this.allocatedAmountSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DiscountAllocationResponseProjection.MoneyBagResponseProjection.allocatedAmountSet", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DiscountAllocationResponseProjection.DiscountApplicationResponseProjection.discountApplication", 0) <= maxDepth) {
            projectionDepthOnFields.put("DiscountAllocationResponseProjection.DiscountApplicationResponseProjection.discountApplication", projectionDepthOnFields.getOrDefault("DiscountAllocationResponseProjection.DiscountApplicationResponseProjection.discountApplication", 0) + 1);
            this.discountApplication(new DiscountApplicationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DiscountAllocationResponseProjection.DiscountApplicationResponseProjection.discountApplication", 0)));
        }
        this.typename();
        return this;
    }

    public DiscountAllocationResponseProjection allocatedAmountSet(MoneyBagResponseProjection subProjection) {
        return allocatedAmountSet(null, subProjection);
    }

    public DiscountAllocationResponseProjection allocatedAmountSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("allocatedAmountSet").alias(alias).projection(subProjection));
        return this;
    }

    public DiscountAllocationResponseProjection discountApplication(DiscountApplicationResponseProjection subProjection) {
        return discountApplication(null, subProjection);
    }

    public DiscountAllocationResponseProjection discountApplication(String alias, DiscountApplicationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("discountApplication").alias(alias).projection(subProjection));
        return this;
    }

    public DiscountAllocationResponseProjection typename() {
        return typename(null);
    }

    public DiscountAllocationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
