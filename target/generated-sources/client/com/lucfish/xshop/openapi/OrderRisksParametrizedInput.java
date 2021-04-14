package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field risks in type Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class OrderRisksParametrizedInput implements GraphQLParametrizedInput {

    private Integer first;

    public OrderRisksParametrizedInput() {
    }

    public OrderRisksParametrizedInput(Integer first) {
        this.first = first;
    }

    public OrderRisksParametrizedInput first(Integer first) {
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
