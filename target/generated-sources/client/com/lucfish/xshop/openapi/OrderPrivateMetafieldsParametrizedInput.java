package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field privateMetafields in type Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderPrivateMetafieldsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private String namespace;
    private Boolean reverse;

    public OrderPrivateMetafieldsParametrizedInput() {
    }

    public OrderPrivateMetafieldsParametrizedInput(String after, String before, Integer first, Integer last, String namespace, Boolean reverse) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.namespace = namespace;
        this.reverse = reverse;
    }

    public OrderPrivateMetafieldsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrderPrivateMetafieldsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrderPrivateMetafieldsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrderPrivateMetafieldsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrderPrivateMetafieldsParametrizedInput namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public OrderPrivateMetafieldsParametrizedInput reverse(Boolean reverse) {
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
        if (namespace != null) {
            joiner.add("namespace: " + GraphQLRequestSerializer.getEntry(namespace));
        }
        if (reverse != null) {
            joiner.add("reverse: " + GraphQLRequestSerializer.getEntry(reverse));
        }
        return joiner.toString();
    }

}
