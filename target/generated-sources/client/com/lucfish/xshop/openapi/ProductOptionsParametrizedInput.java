package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field options in type Product
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductOptionsParametrizedInput implements GraphQLParametrizedInput {

    private Integer first;

    public ProductOptionsParametrizedInput() {
    }

    public ProductOptionsParametrizedInput(Integer first) {
        this.first = first;
    }

    public ProductOptionsParametrizedInput first(Integer first) {
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
