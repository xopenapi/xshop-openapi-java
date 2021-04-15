package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutCreateTO implements java.io.Serializable {

    private CheckoutTO checkout;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckoutUserErrorTO> checkoutUserErrors;

    public CheckoutCreateTO() {
    }

    public CheckoutCreateTO(CheckoutTO checkout, java.util.List<CheckoutUserErrorTO> checkoutUserErrors) {
        this.checkout = checkout;
        this.checkoutUserErrors = checkoutUserErrors;
    }

    public CheckoutTO getCheckout() {
        return checkout;
    }
    public void setCheckout(CheckoutTO checkout) {
        this.checkout = checkout;
    }

    public java.util.List<CheckoutUserErrorTO> getCheckoutUserErrors() {
        return checkoutUserErrors;
    }
    public void setCheckoutUserErrors(java.util.List<CheckoutUserErrorTO> checkoutUserErrors) {
        this.checkoutUserErrors = checkoutUserErrors;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (checkout != null) {
            joiner.add("checkout: " + GraphQLRequestSerializer.getEntry(checkout));
        }
        if (checkoutUserErrors != null) {
            joiner.add("checkoutUserErrors: " + GraphQLRequestSerializer.getEntry(checkoutUserErrors));
        }
        return joiner.toString();
    }

    public static CheckoutCreateTO.Builder builder() {
        return new CheckoutCreateTO.Builder();
    }

    public static class Builder {

        private CheckoutTO checkout;
        private java.util.List<CheckoutUserErrorTO> checkoutUserErrors;

        public Builder() {
        }

        public Builder setCheckout(CheckoutTO checkout) {
            this.checkout = checkout;
            return this;
        }

        public Builder setCheckoutUserErrors(java.util.List<CheckoutUserErrorTO> checkoutUserErrors) {
            this.checkoutUserErrors = checkoutUserErrors;
            return this;
        }


        public CheckoutCreateTO build() {
            return new CheckoutCreateTO(checkout, checkoutUserErrors);
        }

    }
}
