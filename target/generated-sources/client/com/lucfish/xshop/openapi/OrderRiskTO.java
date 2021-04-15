package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderRiskTO implements java.io.Serializable {

    private boolean display;
    private OrderRiskLevelTO level;
    private String message;

    public OrderRiskTO() {
    }

    public OrderRiskTO(boolean display, OrderRiskLevelTO level, String message) {
        this.display = display;
        this.level = level;
        this.message = message;
    }

    public boolean getDisplay() {
        return display;
    }
    public void setDisplay(boolean display) {
        this.display = display;
    }

    /**
     * Whether the risk level is shown in the Shopify admin. If false, then this order risk is ignored when Shopify determines the overall risk level for the order.
     */
    public OrderRiskLevelTO getLevel() {
        return level;
    }
    /**
     * Whether the risk level is shown in the Shopify admin. If false, then this order risk is ignored when Shopify determines the overall risk level for the order.
     */
    public void setLevel(OrderRiskLevelTO level) {
        this.level = level;
    }

    /**
     * The likelihood that an order is fraudulent, based on this order risk. The level can be set by Shopify risk analysis or by an app.
     */
    public String getMessage() {
        return message;
    }
    /**
     * The likelihood that an order is fraudulent, based on this order risk. The level can be set by Shopify risk analysis or by an app.
     */
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("display: " + GraphQLRequestSerializer.getEntry(display));
        if (level != null) {
            joiner.add("level: " + GraphQLRequestSerializer.getEntry(level));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static OrderRiskTO.Builder builder() {
        return new OrderRiskTO.Builder();
    }

    public static class Builder {

        private boolean display;
        private OrderRiskLevelTO level;
        private String message;

        public Builder() {
        }

        public Builder setDisplay(boolean display) {
            this.display = display;
            return this;
        }

        /**
         * Whether the risk level is shown in the Shopify admin. If false, then this order risk is ignored when Shopify determines the overall risk level for the order.
         */
        public Builder setLevel(OrderRiskLevelTO level) {
            this.level = level;
            return this;
        }

        /**
         * The likelihood that an order is fraudulent, based on this order risk. The level can be set by Shopify risk analysis or by an app.
         */
        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public OrderRiskTO build() {
            return new OrderRiskTO(display, level, message);
        }

    }
}
