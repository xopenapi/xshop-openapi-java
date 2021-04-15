package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TransactionFee
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class TransactionFeeResponseProjection extends GraphQLResponseProjection {

    public TransactionFeeResponseProjection() {
    }

    @Override
    public TransactionFeeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TransactionFeeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.amount", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransactionFeeResponseProjection.MoneyResponseProjection.amount", projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.amount", 0) + 1);
            this.amount(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.amount", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.flatFee", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransactionFeeResponseProjection.MoneyResponseProjection.flatFee", projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.flatFee", 0) + 1);
            this.flatFee(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.flatFee", 0)));
        }
        this.flatFeeName();
        this.id();
        this.rate();
        this.rateName();
        if (projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.taxAmount", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransactionFeeResponseProjection.MoneyResponseProjection.taxAmount", projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.taxAmount", 0) + 1);
            this.taxAmount(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransactionFeeResponseProjection.MoneyResponseProjection.taxAmount", 0)));
        }
        this.type();
        this.typename();
        return this;
    }

    public TransactionFeeResponseProjection amount(MoneyResponseProjection subProjection) {
        return amount(null, subProjection);
    }

    public TransactionFeeResponseProjection amount(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("amount").alias(alias).projection(subProjection));
        return this;
    }

    public TransactionFeeResponseProjection flatFee(MoneyResponseProjection subProjection) {
        return flatFee(null, subProjection);
    }

    public TransactionFeeResponseProjection flatFee(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("flatFee").alias(alias).projection(subProjection));
        return this;
    }

    public TransactionFeeResponseProjection flatFeeName() {
        return flatFeeName(null);
    }

    public TransactionFeeResponseProjection flatFeeName(String alias) {
        fields.add(new GraphQLResponseField("flatFeeName").alias(alias));
        return this;
    }

    public TransactionFeeResponseProjection id() {
        return id(null);
    }

    public TransactionFeeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TransactionFeeResponseProjection rate() {
        return rate(null);
    }

    public TransactionFeeResponseProjection rate(String alias) {
        fields.add(new GraphQLResponseField("rate").alias(alias));
        return this;
    }

    public TransactionFeeResponseProjection rateName() {
        return rateName(null);
    }

    public TransactionFeeResponseProjection rateName(String alias) {
        fields.add(new GraphQLResponseField("rateName").alias(alias));
        return this;
    }

    public TransactionFeeResponseProjection taxAmount(MoneyResponseProjection subProjection) {
        return taxAmount(null, subProjection);
    }

    public TransactionFeeResponseProjection taxAmount(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("taxAmount").alias(alias).projection(subProjection));
        return this;
    }

    public TransactionFeeResponseProjection type() {
        return type(null);
    }

    public TransactionFeeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TransactionFeeResponseProjection typename() {
        return typename(null);
    }

    public TransactionFeeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
