package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class DiscountApplicationTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private DiscountApplicationAllocationMethodTO allocationMethod;
    private int index;
    @javax.validation.constraints.NotNull
    private DiscountApplicationTargetSelectionTO targetSelection;
    @javax.validation.constraints.NotNull
    private DiscountApplicationTargetTypeTO targetType;
    @javax.validation.constraints.NotNull
    private PricingValueTO value;

    public DiscountApplicationTO() {
    }

    public DiscountApplicationTO(DiscountApplicationAllocationMethodTO allocationMethod, int index, DiscountApplicationTargetSelectionTO targetSelection, DiscountApplicationTargetTypeTO targetType, PricingValueTO value) {
        this.allocationMethod = allocationMethod;
        this.index = index;
        this.targetSelection = targetSelection;
        this.targetType = targetType;
        this.value = value;
    }

    public DiscountApplicationAllocationMethodTO getAllocationMethod() {
        return allocationMethod;
    }
    public void setAllocationMethod(DiscountApplicationAllocationMethodTO allocationMethod) {
        this.allocationMethod = allocationMethod;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public DiscountApplicationTargetSelectionTO getTargetSelection() {
        return targetSelection;
    }
    public void setTargetSelection(DiscountApplicationTargetSelectionTO targetSelection) {
        this.targetSelection = targetSelection;
    }

    public DiscountApplicationTargetTypeTO getTargetType() {
        return targetType;
    }
    public void setTargetType(DiscountApplicationTargetTypeTO targetType) {
        this.targetType = targetType;
    }

    public PricingValueTO getValue() {
        return value;
    }
    public void setValue(PricingValueTO value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (allocationMethod != null) {
            joiner.add("allocationMethod: " + GraphQLRequestSerializer.getEntry(allocationMethod));
        }
        joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        if (targetSelection != null) {
            joiner.add("targetSelection: " + GraphQLRequestSerializer.getEntry(targetSelection));
        }
        if (targetType != null) {
            joiner.add("targetType: " + GraphQLRequestSerializer.getEntry(targetType));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static DiscountApplicationTO.Builder builder() {
        return new DiscountApplicationTO.Builder();
    }

    public static class Builder {

        private DiscountApplicationAllocationMethodTO allocationMethod;
        private int index;
        private DiscountApplicationTargetSelectionTO targetSelection;
        private DiscountApplicationTargetTypeTO targetType;
        private PricingValueTO value;

        public Builder() {
        }

        public Builder setAllocationMethod(DiscountApplicationAllocationMethodTO allocationMethod) {
            this.allocationMethod = allocationMethod;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }

        public Builder setTargetSelection(DiscountApplicationTargetSelectionTO targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }

        public Builder setTargetType(DiscountApplicationTargetTypeTO targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder setValue(PricingValueTO value) {
            this.value = value;
            return this;
        }


        public DiscountApplicationTO build() {
            return new DiscountApplicationTO(allocationMethod, index, targetSelection, targetType, value);
        }

    }
}
