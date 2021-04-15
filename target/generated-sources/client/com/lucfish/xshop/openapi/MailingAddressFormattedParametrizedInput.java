package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field formatted in type MailingAddress
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class MailingAddressFormattedParametrizedInput implements GraphQLParametrizedInput {

    private Boolean withCompany;
    private Boolean withName;

    public MailingAddressFormattedParametrizedInput() {
    }

    public MailingAddressFormattedParametrizedInput(Boolean withCompany, Boolean withName) {
        this.withCompany = withCompany;
        this.withName = withName;
    }

    public MailingAddressFormattedParametrizedInput withCompany(Boolean withCompany) {
        this.withCompany = withCompany;
        return this;
    }

    public MailingAddressFormattedParametrizedInput withName(Boolean withName) {
        this.withName = withName;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (withCompany != null) {
            joiner.add("withCompany: " + GraphQLRequestSerializer.getEntry(withCompany));
        }
        if (withName != null) {
            joiner.add("withName: " + GraphQLRequestSerializer.getEntry(withName));
        }
        return joiner.toString();
    }

}
