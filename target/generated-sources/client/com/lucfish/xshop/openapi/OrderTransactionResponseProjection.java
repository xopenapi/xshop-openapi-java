package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrderTransaction
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderTransactionResponseProjection extends GraphQLResponseProjection {

    public OrderTransactionResponseProjection() {
    }

    @Override
    public OrderTransactionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderTransactionResponseProjection all$(int maxDepth) {
        this.accountNumber();
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyBagResponseProjection.amountSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.MoneyBagResponseProjection.amountSet", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyBagResponseProjection.amountSet", 0) + 1);
            this.amountSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyBagResponseProjection.amountSet", 0)));
        }
        this.authorizationCode();
        this.authorizationExpiresAt();
        this.createdAt();
        this.errorCode();
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.TransactionFeeResponseProjection.fees", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.TransactionFeeResponseProjection.fees", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.TransactionFeeResponseProjection.fees", 0) + 1);
            this.fees(new TransactionFeeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.TransactionFeeResponseProjection.fees", 0)));
        }
        this.formattedGateway();
        this.gateway();
        this.id();
        this.kind();
        this.manuallyCapturable();
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyResponseProjection.maximumRefundableV2", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.MoneyResponseProjection.maximumRefundableV2", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyResponseProjection.maximumRefundableV2", 0) + 1);
            this.maximumRefundableV2(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyResponseProjection.maximumRefundableV2", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.OrderResponseProjection.order", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.OrderResponseProjection.order", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.OrderResponseProjection.order", 0) + 1);
            this.order(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.OrderResponseProjection.order", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.OrderTransactionResponseProjection.parentTransaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.OrderTransactionResponseProjection.parentTransaction", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.OrderTransactionResponseProjection.parentTransaction", 0) + 1);
            this.parentTransaction(new OrderTransactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.OrderTransactionResponseProjection.parentTransaction", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.ImageResponseProjection.paymentIcon", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.ImageResponseProjection.paymentIcon", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.ImageResponseProjection.paymentIcon", 0) + 1);
            this.paymentIcon(new ImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.ImageResponseProjection.paymentIcon", 0)));
        }
        this.processedAt();
        this.settlementCurrency();
        this.settlementCurrencyRate();
        this.status();
        this.test();
        if (projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyBagResponseProjection.totalUnsettledSet", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrderTransactionResponseProjection.MoneyBagResponseProjection.totalUnsettledSet", projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyBagResponseProjection.totalUnsettledSet", 0) + 1);
            this.totalUnsettledSet(new MoneyBagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrderTransactionResponseProjection.MoneyBagResponseProjection.totalUnsettledSet", 0)));
        }
        this.typename();
        return this;
    }

    public OrderTransactionResponseProjection accountNumber() {
        return accountNumber(null);
    }

    public OrderTransactionResponseProjection accountNumber(String alias) {
        fields.add(new GraphQLResponseField("accountNumber").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection amountSet(MoneyBagResponseProjection subProjection) {
        return amountSet(null, subProjection);
    }

    public OrderTransactionResponseProjection amountSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("amountSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection authorizationCode() {
        return authorizationCode(null);
    }

    public OrderTransactionResponseProjection authorizationCode(String alias) {
        fields.add(new GraphQLResponseField("authorizationCode").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection authorizationExpiresAt() {
        return authorizationExpiresAt(null);
    }

    public OrderTransactionResponseProjection authorizationExpiresAt(String alias) {
        fields.add(new GraphQLResponseField("authorizationExpiresAt").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection createdAt() {
        return createdAt(null);
    }

    public OrderTransactionResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection errorCode() {
        return errorCode(null);
    }

    public OrderTransactionResponseProjection errorCode(String alias) {
        fields.add(new GraphQLResponseField("errorCode").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection fees(TransactionFeeResponseProjection subProjection) {
        return fees(null, subProjection);
    }

    public OrderTransactionResponseProjection fees(String alias, TransactionFeeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fees").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection formattedGateway() {
        return formattedGateway(null);
    }

    public OrderTransactionResponseProjection formattedGateway(String alias) {
        fields.add(new GraphQLResponseField("formattedGateway").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection gateway() {
        return gateway(null);
    }

    public OrderTransactionResponseProjection gateway(String alias) {
        fields.add(new GraphQLResponseField("gateway").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection id() {
        return id(null);
    }

    public OrderTransactionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection kind() {
        return kind(null);
    }

    public OrderTransactionResponseProjection kind(String alias) {
        fields.add(new GraphQLResponseField("kind").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection manuallyCapturable() {
        return manuallyCapturable(null);
    }

    public OrderTransactionResponseProjection manuallyCapturable(String alias) {
        fields.add(new GraphQLResponseField("manuallyCapturable").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection maximumRefundableV2(MoneyResponseProjection subProjection) {
        return maximumRefundableV2(null, subProjection);
    }

    public OrderTransactionResponseProjection maximumRefundableV2(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("maximumRefundableV2").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection order(OrderResponseProjection subProjection) {
        return order(null, subProjection);
    }

    public OrderTransactionResponseProjection order(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("order").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection parentTransaction(OrderTransactionResponseProjection subProjection) {
        return parentTransaction(null, subProjection);
    }

    public OrderTransactionResponseProjection parentTransaction(String alias, OrderTransactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentTransaction").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection paymentIcon(ImageResponseProjection subProjection) {
        return paymentIcon((String)null, subProjection);
    }

    public OrderTransactionResponseProjection paymentIcon(String alias, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("paymentIcon").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection paymentIcon(OrderTransactionPaymentIconParametrizedInput input, ImageResponseProjection subProjection) {
        return paymentIcon(null, input, subProjection);
    }

    public OrderTransactionResponseProjection paymentIcon(String alias, OrderTransactionPaymentIconParametrizedInput input, ImageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("paymentIcon").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection processedAt() {
        return processedAt(null);
    }

    public OrderTransactionResponseProjection processedAt(String alias) {
        fields.add(new GraphQLResponseField("processedAt").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection settlementCurrency() {
        return settlementCurrency(null);
    }

    public OrderTransactionResponseProjection settlementCurrency(String alias) {
        fields.add(new GraphQLResponseField("settlementCurrency").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection settlementCurrencyRate() {
        return settlementCurrencyRate(null);
    }

    public OrderTransactionResponseProjection settlementCurrencyRate(String alias) {
        fields.add(new GraphQLResponseField("settlementCurrencyRate").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection status() {
        return status(null);
    }

    public OrderTransactionResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection test() {
        return test(null);
    }

    public OrderTransactionResponseProjection test(String alias) {
        fields.add(new GraphQLResponseField("test").alias(alias));
        return this;
    }

    public OrderTransactionResponseProjection totalUnsettledSet(MoneyBagResponseProjection subProjection) {
        return totalUnsettledSet(null, subProjection);
    }

    public OrderTransactionResponseProjection totalUnsettledSet(String alias, MoneyBagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("totalUnsettledSet").alias(alias).projection(subProjection));
        return this;
    }

    public OrderTransactionResponseProjection typename() {
        return typename(null);
    }

    public OrderTransactionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
