package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CustomerCreditCardTO implements java.io.Serializable, CustomerPaymentInstrumentTO {

    @javax.validation.constraints.NotNull
    private String name;

    public CustomerCreditCardTO() {
    }

    public CustomerCreditCardTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static CustomerCreditCardTO.Builder builder() {
        return new CustomerCreditCardTO.Builder();
    }

    public static class Builder {

        private String name;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public CustomerCreditCardTO build() {
            return new CustomerCreditCardTO(name);
        }

    }
}
