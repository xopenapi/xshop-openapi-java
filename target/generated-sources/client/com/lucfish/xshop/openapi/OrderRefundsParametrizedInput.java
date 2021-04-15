package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field refunds in type Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderRefundsParametrizedInput implements GraphQLParametrizedInput {

    private Integer first;

    public OrderRefundsParametrizedInput() {
    }

    public OrderRefundsParametrizedInput(Integer first) {
        this.first = first;
    }

    public OrderRefundsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        return joiner.toString();
    }

}
