package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Customer
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class CustomerResponseProjection extends GraphQLResponseProjection {

    public CustomerResponseProjection() {
    }

    @Override
    public CustomerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomerResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.EventConnectionResponseProjection.events", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.EventConnectionResponseProjection.events", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.EventConnectionResponseProjection.events", 0) + 1);
            this.events(new EventConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.EventConnectionResponseProjection.events", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.MetafieldConnectionResponseProjection.metafields", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) + 1);
            this.metafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldConnectionResponseProjection.metafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldResponseProjection.metafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.MetafieldResponseProjection.metafield", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldResponseProjection.metafield", 0) + 1);
            this.metafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldResponseProjection.metafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) + 1);
            this.privateMetafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldResponseProjection.privateMetafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.MetafieldResponseProjection.privateMetafield", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldResponseProjection.privateMetafield", 0) + 1);
            this.privateMetafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.MetafieldResponseProjection.privateMetafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.OrderConnectionResponseProjection.orders", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.OrderConnectionResponseProjection.orders", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.OrderConnectionResponseProjection.orders", 0) + 1);
            this.orders(new OrderConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.OrderConnectionResponseProjection.orders", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.CustomerPaymentMethodConnectionResponseProjection.paymentMethods", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.CustomerPaymentMethodConnectionResponseProjection.paymentMethods", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.CustomerPaymentMethodConnectionResponseProjection.paymentMethods", 0) + 1);
            this.paymentMethods(new CustomerPaymentMethodConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.CustomerPaymentMethodConnectionResponseProjection.paymentMethods", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.TagResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.TagResponseProjection.tags", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.TagResponseProjection.tags", 0) + 1);
            this.tags(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.TagResponseProjection.tags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerResponseProjection.OrderResponseProjection.lastOrder", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerResponseProjection.OrderResponseProjection.lastOrder", projectionDepthOnFields.getOrDefault("CustomerResponseProjection.OrderResponseProjection.lastOrder", 0) + 1);
            this.lastOrder(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerResponseProjection.OrderResponseProjection.lastOrder", 0)));
        }
        this.note();
        this.ordersCount();
        this.createdAt();
        this.updatedAt();
        this.typename();
        return this;
    }

    public CustomerResponseProjection id() {
        return id(null);
    }

    public CustomerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CustomerResponseProjection events(EventConnectionResponseProjection subProjection) {
        return events((String)null, subProjection);
    }

    public CustomerResponseProjection events(String alias, EventConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("events").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection events(CustomerEventsParametrizedInput input, EventConnectionResponseProjection subProjection) {
        return events(null, input, subProjection);
    }

    public CustomerResponseProjection events(String alias, CustomerEventsParametrizedInput input, EventConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("events").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection metafields(MetafieldConnectionResponseProjection subProjection) {
        return metafields((String)null, subProjection);
    }

    public CustomerResponseProjection metafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection metafields(CustomerMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return metafields(null, input, subProjection);
    }

    public CustomerResponseProjection metafields(String alias, CustomerMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection metafield(MetafieldResponseProjection subProjection) {
        return metafield((String)null, subProjection);
    }

    public CustomerResponseProjection metafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection metafield(CustomerMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return metafield(null, input, subProjection);
    }

    public CustomerResponseProjection metafield(String alias, CustomerMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection privateMetafields(MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields((String)null, subProjection);
    }

    public CustomerResponseProjection privateMetafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection privateMetafields(CustomerPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields(null, input, subProjection);
    }

    public CustomerResponseProjection privateMetafields(String alias, CustomerPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection privateMetafield(MetafieldResponseProjection subProjection) {
        return privateMetafield((String)null, subProjection);
    }

    public CustomerResponseProjection privateMetafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection privateMetafield(CustomerPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return privateMetafield(null, input, subProjection);
    }

    public CustomerResponseProjection privateMetafield(String alias, CustomerPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection orders(OrderConnectionResponseProjection subProjection) {
        return orders((String)null, subProjection);
    }

    public CustomerResponseProjection orders(String alias, OrderConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("orders").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection orders(CustomerOrdersParametrizedInput input, OrderConnectionResponseProjection subProjection) {
        return orders(null, input, subProjection);
    }

    public CustomerResponseProjection orders(String alias, CustomerOrdersParametrizedInput input, OrderConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("orders").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection paymentMethods(CustomerPaymentMethodConnectionResponseProjection subProjection) {
        return paymentMethods((String)null, subProjection);
    }

    public CustomerResponseProjection paymentMethods(String alias, CustomerPaymentMethodConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("paymentMethods").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection paymentMethods(CustomerPaymentMethodsParametrizedInput input, CustomerPaymentMethodConnectionResponseProjection subProjection) {
        return paymentMethods(null, input, subProjection);
    }

    public CustomerResponseProjection paymentMethods(String alias, CustomerPaymentMethodsParametrizedInput input, CustomerPaymentMethodConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("paymentMethods").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection tags(TagResponseProjection subProjection) {
        return tags(null, subProjection);
    }

    public CustomerResponseProjection tags(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection lastOrder(OrderResponseProjection subProjection) {
        return lastOrder(null, subProjection);
    }

    public CustomerResponseProjection lastOrder(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lastOrder").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerResponseProjection note() {
        return note(null);
    }

    public CustomerResponseProjection note(String alias) {
        fields.add(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public CustomerResponseProjection ordersCount() {
        return ordersCount(null);
    }

    public CustomerResponseProjection ordersCount(String alias) {
        fields.add(new GraphQLResponseField("ordersCount").alias(alias));
        return this;
    }

    public CustomerResponseProjection createdAt() {
        return createdAt(null);
    }

    public CustomerResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public CustomerResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public CustomerResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public CustomerResponseProjection typename() {
        return typename(null);
    }

    public CustomerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
