package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class MoneyBagTO implements java.io.Serializable {

    private MoneyTO presentmentMoney;
    private MoneyTO shopMoney;

    public MoneyBagTO() {
    }

    public MoneyBagTO(MoneyTO presentmentMoney, MoneyTO shopMoney) {
        this.presentmentMoney = presentmentMoney;
        this.shopMoney = shopMoney;
    }

    public MoneyTO getPresentmentMoney() {
        return presentmentMoney;
    }
    public void setPresentmentMoney(MoneyTO presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
    }

    /**
     * 展示价格
     */
    public MoneyTO getShopMoney() {
        return shopMoney;
    }
    /**
     * 展示价格
     */
    public void setShopMoney(MoneyTO shopMoney) {
        this.shopMoney = shopMoney;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (presentmentMoney != null) {
            joiner.add("presentmentMoney: " + GraphQLRequestSerializer.getEntry(presentmentMoney));
        }
        if (shopMoney != null) {
            joiner.add("shopMoney: " + GraphQLRequestSerializer.getEntry(shopMoney));
        }
        return joiner.toString();
    }

    public static MoneyBagTO.Builder builder() {
        return new MoneyBagTO.Builder();
    }

    public static class Builder {

        private MoneyTO presentmentMoney;
        private MoneyTO shopMoney;

        public Builder() {
        }

        public Builder setPresentmentMoney(MoneyTO presentmentMoney) {
            this.presentmentMoney = presentmentMoney;
            return this;
        }

        /**
         * 展示价格
         */
        public Builder setShopMoney(MoneyTO shopMoney) {
            this.shopMoney = shopMoney;
            return this;
        }


        public MoneyBagTO build() {
            return new MoneyBagTO(presentmentMoney, shopMoney);
        }

    }
}
