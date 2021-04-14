package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field variantBySelectedOptions in type Product
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductVariantBySelectedOptionsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<SelectedOptionInputTO> selectedOptions;

    public ProductVariantBySelectedOptionsParametrizedInput() {
    }

    public ProductVariantBySelectedOptionsParametrizedInput(java.util.List<SelectedOptionInputTO> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public ProductVariantBySelectedOptionsParametrizedInput selectedOptions(java.util.List<SelectedOptionInputTO> selectedOptions) {
        this.selectedOptions = selectedOptions;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (selectedOptions != null) {
            joiner.add("selectedOptions: " + GraphQLRequestSerializer.getEntry(selectedOptions));
        }
        return joiner.toString();
    }

}
