package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field metafield in type Customer
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CustomerMetafieldParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String namespace;

    public CustomerMetafieldParametrizedInput() {
    }

    public CustomerMetafieldParametrizedInput(String key, String namespace) {
        this.key = key;
        this.namespace = namespace;
    }

    public CustomerMetafieldParametrizedInput key(String key) {
        this.key = key;
        return this;
    }

    public CustomerMetafieldParametrizedInput namespace(String namespace) {
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
