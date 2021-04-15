package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class PricingPercentageValueTO implements java.io.Serializable, PricingValueTO {

    private double percentage;

    public PricingPercentageValueTO() {
    }

    public PricingPercentageValueTO(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("percentage: " + GraphQLRequestSerializer.getEntry(percentage));
        return joiner.toString();
    }

    public static PricingPercentageValueTO.Builder builder() {
        return new PricingPercentageValueTO.Builder();
    }

    public static class Builder {

        private double percentage;

        public Builder() {
        }

        public Builder setPercentage(double percentage) {
            this.percentage = percentage;
            return this;
        }


        public PricingPercentageValueTO build() {
            return new PricingPercentageValueTO(percentage);
        }

    }
}
