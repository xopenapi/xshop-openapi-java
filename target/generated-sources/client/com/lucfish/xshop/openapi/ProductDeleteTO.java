package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductDeleteTO implements java.io.Serializable {

    private String deletedProductId;
    private ShopTO shop;
    @javax.validation.constraints.NotNull
    private java.util.List<UserErrorTO> userErrors;

    public ProductDeleteTO() {
    }

    public ProductDeleteTO(String deletedProductId, ShopTO shop, java.util.List<UserErrorTO> userErrors) {
        this.deletedProductId = deletedProductId;
        this.shop = shop;
        this.userErrors = userErrors;
    }

    public String getDeletedProductId() {
        return deletedProductId;
    }
    public void setDeletedProductId(String deletedProductId) {
        this.deletedProductId = deletedProductId;
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
        if (deletedProductId != null) {
            joiner.add("deletedProductId: " + GraphQLRequestSerializer.getEntry(deletedProductId));
        }
        if (shop != null) {
            joiner.add("shop: " + GraphQLRequestSerializer.getEntry(shop));
        }
        if (userErrors != null) {
            joiner.add("userErrors: " + GraphQLRequestSerializer.getEntry(userErrors));
        }
        return joiner.toString();
    }

    public static ProductDeleteTO.Builder builder() {
        return new ProductDeleteTO.Builder();
    }

    public static class Builder {

        private String deletedProductId;
        private ShopTO shop;
        private java.util.List<UserErrorTO> userErrors;

        public Builder() {
        }

        public Builder setDeletedProductId(String deletedProductId) {
            this.deletedProductId = deletedProductId;
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


        public ProductDeleteTO build() {
            return new ProductDeleteTO(deletedProductId, shop, userErrors);
        }

    }
}
