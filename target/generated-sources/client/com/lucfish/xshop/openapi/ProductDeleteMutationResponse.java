package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductDeleteMutationResponse extends GraphQLResult<Map<String, ProductDeleteTO>> {

    private static final String OPERATION_NAME = "productDelete";

    public ProductDeleteMutationResponse() {
    }

    public ProductDeleteTO productDelete() {
        Map<String, ProductDeleteTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
