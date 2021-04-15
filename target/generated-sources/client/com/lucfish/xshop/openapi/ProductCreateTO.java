package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductCreateTO implements java.io.Serializable {

    private ProductTO product;
    private ShopTO shop;
    @javax.validation.constraints.NotNull
    private java.util.List<UserErrorTO> userErrors;

    public ProductCreateTO() {
    }

    public ProductCreateTO(ProductTO product, ShopTO shop, java.util.List<UserErrorTO> userErrors) {
        this.product = product;
        this.shop = shop;
        this.userErrors = userErrors;
    }

    public ProductTO getProduct() {
        return product;
    }
    public void setProduct(ProductTO product) {
        this.product = product;
    }

    public ShopTO getShop() {
        return shop;
    }
    public void setShop(ShopTO shop) {
        this.shop = shop;
    }

    public java.util.List<UserErrorTO> getUserErrors() {
        return userErrors;
    }
    public void setUserErrors(java.util.List<UserErrorTO> userErrors) {
        this.userErrors = userErrors;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (product != null) {
            joiner.add("product: " + GraphQLRequestSerializer.getEntry(product));
        }
        if (shop != null) {
            joiner.add("shop: " + GraphQLRequestSerializer.getEntry(shop));
        }
        if (userErrors != null) {
            joiner.add("userErrors: " + GraphQLRequestSerializer.getEntry(userErrors));
        }
        return joiner.toString();
    }

    public static ProductCreateTO.Builder builder() {
        return new ProductCreateTO.Builder();
    }

    public static class Builder {

        private ProductTO product;
        private ShopTO shop;
        private java.util.List<UserErrorTO> userErrors;

        public Builder() {
        }

        public Builder setProduct(ProductTO product) {
            this.product = product;
            return this;
        }

        public Builder setShop(ShopTO shop) {
            this.shop = shop;
            return this;
        }

        public Builder setUserErrors(java.util.List<UserErrorTO> userErrors) {
            this.userErrors = userErrors;
            return this;
        }


        public ProductCreateTO build() {
            return new ProductCreateTO(product, shop, userErrors);
        }

    }
}
