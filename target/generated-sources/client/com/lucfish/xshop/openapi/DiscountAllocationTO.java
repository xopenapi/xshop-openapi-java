package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An amount discounting the line that has been allocated by an associated discount application.
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class DiscountAllocationTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private MoneyBagTO allocatedAmountSet;
    @javax.validation.constraints.NotNull
    private DiscountApplicationTO discountApplication;

    public DiscountAllocationTO() {
    }

    public DiscountAllocationTO(MoneyBagTO allocatedAmountSet, DiscountApplicationTO discountApplication) {
        this.allocatedAmountSet = allocatedAmountSet;
        this.discountApplication = discountApplication;
    }

    public MoneyBagTO getAllocatedAmountSet() {
        return allocatedAmountSet;
    }
    public void setAllocatedAmountSet(MoneyBagTO allocatedAmountSet) {
        this.allocatedAmountSet = allocatedAmountSet;
    }

    /**
     * Money amount allocated by the discount application in shop and presentment currencies.
     */
    public DiscountApplicationTO getDiscountApplication() {
        return discountApplication;
    }
    /**
     * Money amount allocated by the discount application in shop and presentment currencies.
     */
    public void setDiscountApplication(DiscountApplicationTO discountApplication) {
        this.discountApplication = discountApplication;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (allocatedAmountSet != null) {
            joiner.add("allocatedAmountSet: " + GraphQLRequestSerializer.getEntry(allocatedAmountSet));
        }
        if (discountApplication != null) {
            joiner.add("discountApplication: " + GraphQLRequestSerializer.getEntry(discountApplication));
        }
        return joiner.toString();
    }

    public static DiscountAllocationTO.Builder builder() {
        return new DiscountAllocationTO.Builder();
    }

    public static class Builder {

        private MoneyBagTO allocatedAmountSet;
        private DiscountApplicationTO discountApplication;

        public Builder() {
        }

        public Builder setAllocatedAmountSet(MoneyBagTO allocatedAmountSet) {
            this.allocatedAmountSet = allocatedAmountSet;
            return this;
        }

        /**
         * Money amount allocated by the discount application in shop and presentment currencies.
         */
        public Builder setDiscountApplication(DiscountApplicationTO discountApplication) {
            this.discountApplication = discountApplication;
            return this;
        }


        public DiscountAllocationTO build() {
            return new DiscountAllocationTO(allocatedAmountSet, discountApplication);
        }

    }
}
