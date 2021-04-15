package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CustomerQueryResponse extends GraphQLResult<Map<String, CustomerTO>> {

    private static final String OPERATION_NAME = "customer";

    public CustomerQueryResponse() {
    }

    public CustomerTO customer() {
        Map<String, CustomerTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
