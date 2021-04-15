package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field transactions in type Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderTransactionsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean capturable;
    private Integer first;
    private Boolean manuallyResolvable;

    public OrderTransactionsParametrizedInput() {
    }

    public OrderTransactionsParametrizedInput(Boolean capturable, Integer first, Boolean manuallyResolvable) {
        this.capturable = capturable;
        this.first = first;
        this.manuallyResolvable = manuallyResolvable;
    }

    public OrderTransactionsParametrizedInput capturable(Boolean capturable) {
        this.capturable = capturable;
        return this;
    }

    public OrderTransactionsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrderTransactionsParametrizedInput manuallyResolvable(Boolean manuallyResolvable) {
        this.manuallyResolvable = manuallyResolvable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (capturable != null) {
            joiner.add("capturable: " + GraphQLRequestSerializer.getEntry(capturable));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (manuallyResolvable != null) {
            joiner.add("manuallyResolvable: " + GraphQLRequestSerializer.getEntry(manuallyResolvable));
        }
        return joiner.toString();
    }

}
