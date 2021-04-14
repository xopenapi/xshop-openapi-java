package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field countryHarmonizedSystemCodes in type InventoryItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class InventoryItemCountryHarmonizedSystemCodesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private Boolean reverse;

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput() {
    }

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput(String after, String before, Integer first, Integer last, Boolean reverse) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.reverse = reverse;
    }

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public InventoryItemCountryHarmonizedSystemCodesParametrizedInput reverse(Boolean reverse) {
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
