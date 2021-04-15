package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field paymentMethods in type Customer
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CustomerPaymentMethodsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private Boolean reverse;
    private Boolean showRevoked;

    public CustomerPaymentMethodsParametrizedInput() {
    }

    public CustomerPaymentMethodsParametrizedInput(String after, String before, Integer first, Integer last, Boolean reverse, Boolean showRevoked) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.reverse = reverse;
        this.showRevoked = showRevoked;
    }

    public CustomerPaymentMethodsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public CustomerPaymentMethodsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public CustomerPaymentMethodsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public CustomerPaymentMethodsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public CustomerPaymentMethodsParametrizedInput reverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    public CustomerPaymentMethodsParametrizedInput showRevoked(Boolean showRevoked) {
        this.showRevoked = showRevoked;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (reverse != null) {
            joiner.add("reverse: " + GraphQLRequestSerializer.getEntry(reverse));
        }
        if (showRevoked != null) {
            joiner.add("showRevoked: " + GraphQLRequestSerializer.getEntry(showRevoked));
        }
        return joiner.toString();
    }

}
