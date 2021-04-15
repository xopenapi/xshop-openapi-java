package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductQueryResponse extends GraphQLResult<Map<String, ProductTO>> {

    private static final String OPERATION_NAME = "product";

    public ProductQueryResponse() {
    }

    public ProductTO product() {
        Map<String, ProductTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
