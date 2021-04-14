package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field trackingInfo in type Fulfillment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class FulfillmentTrackingInfoParametrizedInput implements GraphQLParametrizedInput {

    private Integer first;

    public FulfillmentTrackingInfoParametrizedInput() {
    }

    public FulfillmentTrackingInfoParametrizedInput(Integer first) {
        this.first = first;
    }

    public FulfillmentTrackingInfoParametrizedInput first(Integer first) {
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
