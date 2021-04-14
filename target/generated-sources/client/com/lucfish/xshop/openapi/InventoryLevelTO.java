package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class InventoryLevelTO implements java.io.Serializable, NodeTO {

    private int available;
    private boolean canDeactivate;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String deactivationAlert;
    private String deactivationAlertHtml;
    @javax.validation.constraints.NotNull
    private String id;
    private int incoming;
    @javax.validation.constraints.NotNull
    private InventoryItemTO item;
    @javax.validation.constraints.NotNull
    private LocationTO location;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public InventoryLevelTO() {
    }

    public InventoryLevelTO(int available, boolean canDeactivate, java.util.Date createdAt, String deactivationAlert, String deactivationAlertHtml, String id, int incoming, InventoryItemTO item, LocationTO location, java.util.Date updatedAt) {
        this.available = available;
        this.canDeactivate = canDeactivate;
        this.createdAt = createdAt;
        this.deactivationAlert = deactivationAlert;
        this.deactivationAlertHtml = deactivationAlertHtml;
        this.id = id;
        this.incoming = incoming;
        this.item = item;
        this.location = location;
        this.updatedAt = updatedAt;
    }

    public int getAvailable() {
        return available;
    }
    public void setAvailable(int available) {
        this.available = available;
    }

    public boolean getCanDeactivate() {
        return canDeactivate;
    }
    public void setCanDeactivate(boolean canDeactivate) {
        this.canDeactivate = canDeactivate;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeactivationAlert() {
        return deactivationAlert;
    }
    public void setDeactivationAlert(String deactivationAlert) {
        this.deactivationAlert = deactivationAlert;
    }

    public String getDeactivationAlertHtml() {
        return deactivationAlertHtml;
    }
    public void setDeactivationAlertHtml(String deactivationAlertHtml) {
        this.deactivationAlertHtml = deactivationAlertHtml;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getIncoming() {
        return incoming;
    }
    public void setIncoming(int incoming) {
        this.incoming = incoming;
    }

    public InventoryItemTO getItem() {
        return item;
    }
    public void setItem(InventoryItemTO item) {
        this.item = item;
    }

    public LocationTO getLocation() {
        return location;
    }
    public void setLocation(LocationTO location) {
        this.location = location;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("available: " + GraphQLRequestSerializer.getEntry(available));
        joiner.add("canDeactivate: " + GraphQLRequestSerializer.getEntry(canDeactivate));
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (deactivationAlert != null) {
            joiner.add("deactivationAlert: " + GraphQLRequestSerializer.getEntry(deactivationAlert));
        }
        if (deactivationAlertHtml != null) {
            joiner.add("deactivationAlertHtml: " + GraphQLRequestSerializer.getEntry(deactivationAlertHtml));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("incoming: " + GraphQLRequestSerializer.getEntry(incoming));
        if (item != null) {
            joiner.add("item: " + GraphQLRequestSerializer.getEntry(item));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static InventoryLevelTO.Builder builder() {
        return new InventoryLevelTO.Builder();
    }

    public static class Builder {

        private int available;
        private boolean canDeactivate;
        private java.util.Date createdAt;
        private String deactivationAlert;
        private String deactivationAlertHtml;
        private String id;
        private int incoming;
        private InventoryItemTO item;
        private LocationTO location;
        private java.util.Date updatedAt;

        public Builder() {
        }

        public Builder setAvailable(int available) {
            this.available = available;
            return this;
        }

        public Builder setCanDeactivate(boolean canDeactivate) {
            this.canDeactivate = canDeactivate;
            return this;
        }

        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDeactivationAlert(String deactivationAlert) {
            this.deactivationAlert = deactivationAlert;
            return this;
        }

        public Builder setDeactivationAlertHtml(String deactivationAlertHtml) {
            this.deactivationAlertHtml = deactivationAlertHtml;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIncoming(int incoming) {
            this.incoming = incoming;
            return this;
        }

        public Builder setItem(InventoryItemTO item) {
            this.item = item;
            return this;
        }

        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        public Builder setUpdatedAt(java.util.Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public InventoryLevelTO build() {
            return new InventoryLevelTO(available, canDeactivate, createdAt, deactivationAlert, deactivationAlertHtml, id, incoming, item, location, updatedAt);
        }

    }
}
