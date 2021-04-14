package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field presentmentPriceRanges in type Product
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductPresentmentPriceRangesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private java.util.List<CurrencyCodeTO> presentmentCurrencies;
    private Boolean reverse;

    public ProductPresentmentPriceRangesParametrizedInput() {
    }

    public ProductPresentmentPriceRangesParametrizedInput(String after, String before, Integer first, Integer last, java.util.List<CurrencyCodeTO> presentmentCurrencies, Boolean reverse) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.presentmentCurrencies = presentmentCurrencies;
        this.reverse = reverse;
    }

    public ProductPresentmentPriceRangesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ProductPresentmentPriceRangesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ProductPresentmentPriceRangesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ProductPresentmentPriceRangesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ProductPresentmentPriceRangesParametrizedInput presentmentCurrencies(java.util.List<CurrencyCodeTO> presentmentCurrencies) {
        this.presentmentCurrencies = presentmentCurrencies;
        return this;
    }

    public ProductPresentmentPriceRangesParametrizedInput reverse(Boolean reverse) {
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
        if (presentmentCurrencies != null) {
            joiner.add("presentmentCurrencies: " + GraphQLRequestSerializer.getEntry(presentmentCurrencies));
        }
        if (reverse != null) {
            joiner.add("reverse: " + GraphQLRequestSerializer.getEntry(reverse));
        }
        return joiner.toString();
    }

}
