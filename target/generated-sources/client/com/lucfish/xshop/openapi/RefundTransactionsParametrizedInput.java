package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field transactions in type Refund
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class RefundTransactionsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private Boolean reverse;

    public RefundTransactionsParametrizedInput() {
    }

    public RefundTransactionsParametrizedInput(String after, String before, Integer first, Integer last, Boolean reverse) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.reverse = reverse;
    }

    public RefundTransactionsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RefundTransactionsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RefundTransactionsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RefundTransactionsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RefundTransactionsParametrizedInput reverse(Boolean reverse) {
        this.reverse = reverse;
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
        return joiner.toString();
    }

}
