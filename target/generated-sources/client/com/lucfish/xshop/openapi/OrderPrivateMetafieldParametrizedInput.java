package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field privateMetafield in type Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderPrivateMetafieldParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String namespace;

    public OrderPrivateMetafieldParametrizedInput() {
    }

    public OrderPrivateMetafieldParametrizedInput(String key, String namespace) {
        this.key = key;
        this.namespace = namespace;
    }

    public OrderPrivateMetafieldParametrizedInput key(String key) {
        this.key = key;
        return this;
    }

    public OrderPrivateMetafieldParametrizedInput namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (namespace != null) {
            joiner.add("namespace: " + GraphQLRequestSerializer.getEntry(namespace));
        }
        return joiner.toString();
    }

}
