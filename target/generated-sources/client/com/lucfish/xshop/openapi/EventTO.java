package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class EventTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String appTitle;
    private boolean attributeToApp;
    private boolean attributeToUser;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private boolean criticalAlert;
    @javax.validation.constraints.NotNull
    private String message;

    public EventTO() {
    }

    public EventTO(String id, String appTitle, boolean attributeToApp, boolean attributeToUser, java.util.Date createdAt, boolean criticalAlert, String message) {
        this.id = id;
        this.appTitle = appTitle;
        this.attributeToApp = attributeToApp;
        this.attributeToUser = attributeToUser;
        this.createdAt = createdAt;
        this.criticalAlert = criticalAlert;
        this.message = message;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAppTitle() {
        return appTitle;
    }
    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public boolean getAttributeToApp() {
        return attributeToApp;
    }
    public void setAttributeToApp(boolean attributeToApp) {
        this.attributeToApp = attributeToApp;
    }

    public boolean getAttributeToUser() {
        return attributeToUser;
    }
    public void setAttributeToUser(boolean attributeToUser) {
        this.attributeToUser = attributeToUser;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean getCriticalAlert() {
        return criticalAlert;
    }
    public void setCriticalAlert(boolean criticalAlert) {
        this.criticalAlert = criticalAlert;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (appTitle != null) {
            joiner.add("appTitle: " + GraphQLRequestSerializer.getEntry(appTitle));
        }
        joiner.add("attributeToApp: " + GraphQLRequestSerializer.getEntry(attributeToApp));
        joiner.add("attributeToUser: " + GraphQLRequestSerializer.getEntry(attributeToUser));
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        joiner.add("criticalAlert: " + GraphQLRequestSerializer.getEntry(criticalAlert));
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static EventTO.Builder builder() {
        return new EventTO.Builder();
    }

    public static class Builder {

        private String id;
        private String appTitle;
        private boolean attributeToApp;
        private boolean attributeToUser;
        private java.util.Date createdAt;
        private boolean criticalAlert;
        private String message;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAppTitle(String appTitle) {
            this.appTitle = appTitle;
            return this;
        }

        public Builder setAttributeToApp(boolean attributeToApp) {
            this.attributeToApp = attributeToApp;
            return this;
        }

        public Builder setAttributeToUser(boolean attributeToUser) {
            this.attributeToUser = attributeToUser;
            return this;
        }

        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCriticalAlert(boolean criticalAlert) {
            this.criticalAlert = criticalAlert;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public EventTO build() {
            return new EventTO(id, appTitle, attributeToApp, attributeToUser, createdAt, criticalAlert, message);
        }

    }
}
