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
public class ProductCreateMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "productCreate";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public ProductCreateMutationRequest() {
    }

    public ProductCreateMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(ProductInputTO input) {
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

    public static ProductCreateMutationRequest.Builder builder() {
        return new ProductCreateMutationRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private ProductInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(ProductInputTO input) {
            this.input = input;
            return this;
        }


        public ProductCreateMutationRequest build() {
            ProductCreateMutationRequest obj = new ProductCreateMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
