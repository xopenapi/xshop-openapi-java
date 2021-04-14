package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductCreateMutationResponse extends GraphQLResult<Map<String, ProductCreateTO>> {

    private static final String OPERATION_NAME = "productCreate";

    public ProductCreateMutationResponse() {
    }

    public ProductCreateTO productCreate() {
        Map<String, ProductCreateTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
