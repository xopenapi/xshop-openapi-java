package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrdersQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "orders";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public OrdersQueryRequest() {
    }

    public OrdersQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setReverse(Boolean reverse) {
        this.input.put("reverse", reverse);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static OrdersQueryRequest.Builder builder() {
        return new OrdersQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String after;
        private String before;
        private Integer first;
        private Integer last;
        private Boolean reverse;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setReverse(Boolean reverse) {
            this.reverse = reverse;
            return this;
        }


        public OrdersQueryRequest build() {
            OrdersQueryRequest obj = new OrdersQueryRequest($alias);
            obj.setAfter(after);
            obj.setBefore(before);
            obj.setFirst(first);
            obj.setLast(last);
            obj.setReverse(reverse);
            return obj;
        }

    }
}
