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
public class ProductDeleteMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "productDelete";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public ProductDeleteMutationRequest() {
    }

    public ProductDeleteMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(ProductDeleteInputTO input) {
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

    public static ProductDeleteMutationRequest.Builder builder() {
        return new ProductDeleteMutationRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private ProductDeleteInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(ProductDeleteInputTO input) {
            this.input = input;
            return this;
        }


        public ProductDeleteMutationRequest build() {
            ProductDeleteMutationRequest obj = new ProductDeleteMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
