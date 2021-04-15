package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CheckoutCreateMutationResponse extends GraphQLResult<Map<String, CheckoutCreateTO>> {

    private static final String OPERATION_NAME = "checkoutCreate";

    public CheckoutCreateMutationResponse() {
    }

    public CheckoutCreateTO checkoutCreate() {
        Map<String, CheckoutCreateTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
