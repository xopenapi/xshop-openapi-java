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
public class CheckoutCreateMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "checkoutCreate";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public CheckoutCreateMutationRequest() {
    }

    public CheckoutCreateMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(CheckoutCreateInputTO input) {
        this.input.put("input", input);
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

    public static CheckoutCreateMutationRequest.Builder builder() {
        return new CheckoutCreateMutationRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private CheckoutCreateInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(CheckoutCreateInputTO input) {
            this.input = input;
            return this;
        }


        public CheckoutCreateMutationRequest build() {
            CheckoutCreateMutationRequest obj = new CheckoutCreateMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
