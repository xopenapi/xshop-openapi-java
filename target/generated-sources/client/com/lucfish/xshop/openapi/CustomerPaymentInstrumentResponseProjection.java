package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerPaymentInstrument
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class CustomerPaymentInstrumentResponseProjection extends GraphQLResponseProjection {

    public CustomerPaymentInstrumentResponseProjection() {
    }

    @Override
    public CustomerPaymentInstrumentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomerPaymentInstrumentResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public CustomerPaymentInstrumentResponseProjection onCustomerCreditCard(CustomerCreditCardResponseProjection subProjection) {
        return onCustomerCreditCard(null, subProjection);
    }

    public CustomerPaymentInstrumentResponseProjection onCustomerCreditCard(String alias, CustomerCreditCardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CustomerCreditCard").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerPaymentInstrumentResponseProjection typename() {
        return typename(null);
    }

    public CustomerPaymentInstrumentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
