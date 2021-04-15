package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ShopQueryResponse extends GraphQLResult<Map<String, ShopTO>> {

    private static final String OPERATION_NAME = "shop";

    public ShopQueryResponse() {
    }

    public ShopTO shop() {
        Map<String, ShopTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
