package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Event
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class EventResponseProjection extends GraphQLResponseProjection {

    public EventResponseProjection() {
    }

    @Override
    public EventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventResponseProjection all$(int maxDepth) {
        this.id();
        this.appTitle();
        this.attributeToApp();
        this.attributeToUser();
        this.createdAt();
        this.criticalAlert();
        this.message();
        this.typename();
        return this;
    }

    public EventResponseProjection id() {
        return id(null);
    }

    public EventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EventResponseProjection appTitle() {
        return appTitle(null);
    }

    public EventResponseProjection appTitle(String alias) {
        fields.add(new GraphQLResponseField("appTitle").alias(alias));
        return this;
    }

    public EventResponseProjection attributeToApp() {
        return attributeToApp(null);
    }

    public EventResponseProjection attributeToApp(String alias) {
        fields.add(new GraphQLResponseField("attributeToApp").alias(alias));
        return this;
    }

    public EventResponseProjection attributeToUser() {
        return attributeToUser(null);
    }

    public EventResponseProjection attributeToUser(String alias) {
        fields.add(new GraphQLResponseField("attributeToUser").alias(alias));
        return this;
    }

    public EventResponseProjection createdAt() {
        return createdAt(null);
    }

    public EventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public EventResponseProjection criticalAlert() {
        return criticalAlert(null);
    }

    public EventResponseProjection criticalAlert(String alias) {
        fields.add(new GraphQLResponseField("criticalAlert").alias(alias));
        return this;
    }

    public EventResponseProjection message() {
        return message(null);
    }

    public EventResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public EventResponseProjection typename() {
        return typename(null);
    }

    public EventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
