package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field events in type Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class OrderEventsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private String query;
    private Boolean reverse;
    private EventSortKeysTO sortKey;

    public OrderEventsParametrizedInput() {
    }

    public OrderEventsParametrizedInput(String after, String before, Integer first, Integer last, String query, Boolean reverse, EventSortKeysTO sortKey) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.query = query;
        this.reverse = reverse;
        this.sortKey = sortKey;
    }

    public OrderEventsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrderEventsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrderEventsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrderEventsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrderEventsParametrizedInput query(String query) {
        this.query = query;
        return this;
    }

    public OrderEventsParametrizedInput reverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    public OrderEventsParametrizedInput sortKey(EventSortKeysTO sortKey) {
        this.sortKey = sortKey;
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
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query));
        }
        if (reverse != null) {
            joiner.add("reverse: " + GraphQLRequestSerializer.getEntry(reverse));
        }
        if (sortKey != null) {
            joiner.add("sortKey: " + GraphQLRequestSerializer.getEntry(sortKey));
        }
        return joiner.toString();
    }

}
