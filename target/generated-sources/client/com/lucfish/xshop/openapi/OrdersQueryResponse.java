package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class OrdersQueryResponse extends GraphQLResult<Map<String, OrderConnectionTO>> {

    private static final String OPERATION_NAME = "orders";

    public OrdersQueryResponse() {
    }

    public OrderConnectionTO orders() {
        Map<String, OrderConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
