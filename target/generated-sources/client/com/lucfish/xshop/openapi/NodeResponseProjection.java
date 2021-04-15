package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Node
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class NodeResponseProjection extends GraphQLResponseProjection {

    public NodeResponseProjection() {
    }

    @Override
    public NodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public NodeResponseProjection all$(int maxDepth) {
        this.id();
        this.typename();
        return this;
    }

    public NodeResponseProjection id() {
        return id(null);
    }

    public NodeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NodeResponseProjection onOrder(OrderResponseProjection subProjection) {
        return onOrder(null, subProjection);
    }

    public NodeResponseProjection onOrder(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Order").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onShop(ShopResponseProjection subProjection) {
        return onShop(null, subProjection);
    }

    public NodeResponseProjection onShop(String alias, ShopResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Shop").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onInventoryItem(InventoryItemResponseProjection subProjection) {
        return onInventoryItem(null, subProjection);
    }

    public NodeResponseProjection onInventoryItem(String alias, InventoryItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on InventoryItem").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onInventoryLevel(InventoryLevelResponseProjection subProjection) {
        return onInventoryLevel(null, subProjection);
    }

    public NodeResponseProjection onInventoryLevel(String alias, InventoryLevelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on InventoryLevel").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onOrderTransaction(OrderTransactionResponseProjection subProjection) {
        return onOrderTransaction(null, subProjection);
    }

    public NodeResponseProjection onOrderTransaction(String alias, OrderTransactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on OrderTransaction").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRefund(RefundResponseProjection subProjection) {
        return onRefund(null, subProjection);
    }

    public NodeResponseProjection onRefund(String alias, RefundResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Refund").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCustomer(CustomerResponseProjection subProjection) {
        return onCustomer(null, subProjection);
    }

    public NodeResponseProjection onCustomer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Customer").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProduct(ProductResponseProjection subProjection) {
        return onProduct(null, subProjection);
    }

    public NodeResponseProjection onProduct(String alias, ProductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Product").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLineItem(LineItemResponseProjection subProjection) {
        return onLineItem(null, subProjection);
    }

    public NodeResponseProjection onLineItem(String alias, LineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LineItem").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTransactionFee(TransactionFeeResponseProjection subProjection) {
        return onTransactionFee(null, subProjection);
    }

    public NodeResponseProjection onTransactionFee(String alias, TransactionFeeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TransactionFee").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection typename() {
        return typename(null);
    }

    public NodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
