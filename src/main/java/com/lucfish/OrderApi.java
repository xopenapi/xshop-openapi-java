package com.lucfish;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.lucfish.xshop.openapi.*;
//import io.github.kobylynskyi.product.graphql.model.*;

// 先运行 mvn generate-sources 命令，生成dto
public class OrderApi extends Api {

    public OrderApi(String url) {
        super(url);
    }

    public OrderTO order(String orderId) throws Exception {
        OrderQueryRequest orderQueryRequest = new OrderQueryRequest();
        orderQueryRequest.setId(orderId);
        OrderResponseProjection responseProjection = new OrderResponseProjection().id();
        GraphQLRequest graphQLRequest = new GraphQLRequest(orderQueryRequest, responseProjection);

        OrderQueryResponse result = query(graphQLRequest, OrderQueryResponse.class);
        if (result.hasErrors()) {
            throw new Exception(result.getErrors().get(0).getMessage());
        }
        return result.order();
    }

    public OrderConnectionTO orders(String after, String before, int first, int last, Boolean reverse) throws Exception {
        OrdersQueryRequest queryRequest = new OrdersQueryRequest();
        queryRequest.setAfter(after);
        queryRequest.setBefore(before);
        queryRequest.setFirst(first);
        queryRequest.setLast(last);
        queryRequest.setReverse(reverse);

        OrderConnectionResponseProjection responseProjection = new OrderConnectionResponseProjection().totalCount();
        GraphQLRequest graphQLRequest = new GraphQLRequest(queryRequest, responseProjection);

        OrdersQueryResponse result = query(graphQLRequest, OrdersQueryResponse.class);
        if (result.hasErrors()) {
            throw new Exception(result.getErrors().get(0).getMessage());
        }
        return result.orders();
    }

}
