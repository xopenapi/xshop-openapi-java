package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class LocationTO implements java.io.Serializable {

    private boolean activatable;
    @javax.validation.constraints.NotNull
    private LocationAddressTO address;
    private boolean addressVerified;
    private boolean deactivatable;
    private java.util.Date deactivatedAt;
    private boolean deletable;
    private FulfillmentServiceTO fulfillmentService;
    private boolean fulfillsOnlineOrders;
    private boolean hasActiveInventory;
    private boolean hasUnfulfilledOrders;
    @javax.validation.constraints.NotNull
    private String id;
    private InventoryLevelTO inventoryLevel;
    @javax.validation.constraints.NotNull
    private InventoryLevelConnectionTO inventoryLevels;
    private boolean isActive;
    @javax.validation.constraints.NotNull
    private String name;
    private boolean shipsInventory;
    @javax.validation.constraints.NotNull
    private java.util.List<LocationAddressTO> suggestedAddresses;

    public LocationTO() {
    }

    public LocationTO(boolean activatable, LocationAddressTO address, boolean addressVerified, boolean deactivatable, java.util.Date deactivatedAt, boolean deletable, FulfillmentServiceTO fulfillmentService, boolean fulfillsOnlineOrders, boolean hasActiveInventory, boolean hasUnfulfilledOrders, String id, InventoryLevelTO inventoryLevel, InventoryLevelConnectionTO inventoryLevels, boolean isActive, String name, boolean shipsInventory, java.util.List<LocationAddressTO> suggestedAddresses) {
        this.activatable = activatable;
        this.address = address;
        this.addressVerified = addressVerified;
        this.deactivatable = deactivatable;
        this.deactivatedAt = deactivatedAt;
        this.deletable = deletable;
        this.fulfillmentService = fulfillmentService;
        this.fulfillsOnlineOrders = fulfillsOnlineOrders;
        this.hasActiveInventory = hasActiveInventory;
        this.hasUnfulfilledOrders = hasUnfulfilledOrders;
        this.id = id;
        this.inventoryLevel = inventoryLevel;
        this.inventoryLevels = inventoryLevels;
        this.isActive = isActive;
        this.name = name;
        this.shipsInventory = shipsInventory;
        this.suggestedAddresses = suggestedAddresses;
    }

    public boolean getActivatable() {
        return activatable;
    }
    public void setActivatable(boolean activatable) {
        this.activatable = activatable;
    }

    public LocationAddressTO getAddress() {
        return address;
    }
    public void setAddress(LocationAddressTO address) {
        this.address = address;
    }

    public boolean getAddressVerified() {
        return addressVerified;
    }
    public void setAddressVerified(boolean addressVerified) {
        this.addressVerified = addressVerified;
    }

    public boolean getDeactivatable() {
        return deactivatable;
    }
    public void setDeactivatable(boolean deactivatable) {
        this.deactivatable = deactivatable;
    }

    public java.util.Date getDeactivatedAt() {
        return deactivatedAt;
    }
    public void setDeactivatedAt(java.util.Date deactivatedAt) {
        this.deactivatedAt = deactivatedAt;
    }

    public boolean getDeletable() {
        return deletable;
    }
    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    public FulfillmentServiceTO getFulfillmentService() {
        return fulfillmentService;
    }
    public void setFulfillmentService(FulfillmentServiceTO fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public boolean getFulfillsOnlineOrders() {
        return fulfillsOnlineOrders;
    }
    public void setFulfillsOnlineOrders(boolean fulfillsOnlineOrders) {
        this.fulfillsOnlineOrders = fulfillsOnlineOrders;
    }

    public boolean getHasActiveInventory() {
        return hasActiveInventory;
    }
    public void setHasActiveInventory(boolean hasActiveInventory) {
        this.hasActiveInventory = hasActiveInventory;
    }

    public boolean getHasUnfulfilledOrders() {
        return hasUnfulfilledOrders;
    }
    public void setHasUnfulfilledOrders(boolean hasUnfulfilledOrders) {
        this.hasUnfulfilledOrders = hasUnfulfilledOrders;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public InventoryLevelTO getInventoryLevel() {
        return inventoryLevel;
    }
    public void setInventoryLevel(InventoryLevelTO inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public InventoryLevelConnectionTO getInventoryLevels() {
        return inventoryLevels;
    }
    public void setInventoryLevels(InventoryLevelConnectionTO inventoryLevels) {
        this.inventoryLevels = inventoryLevels;
    }

    public boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getShipsInventory() {
        return shipsInventory;
    }
    public void setShipsInventory(boolean shipsInventory) {
        this.shipsInventory = shipsInventory;
    }

    public java.util.List<LocationAddressTO> getSuggestedAddresses() {
        return suggestedAddresses;
    }
    public void setSuggestedAddresses(java.util.List<LocationAddressTO> suggestedAddresses) {
        this.suggestedAddresses = suggestedAddresses;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("activatable: " + GraphQLRequestSerializer.getEntry(activatable));
        if (address != null) {
            joiner.add("address: " + GraphQLRequestSerializer.getEntry(address));
        }
        joiner.add("addressVerified: " + GraphQLRequestSerializer.getEntry(addressVerified));
        joiner.add("deactivatable: " + GraphQLRequestSerializer.getEntry(deactivatable));
        if (deactivatedAt != null) {
            joiner.add("deactivatedAt: " + GraphQLRequestSerializer.getEntry(deactivatedAt));
        }
        joiner.add("deletable: " + GraphQLRequestSerializer.getEntry(deletable));
        if (fulfillmentService != null) {
            joiner.add("fulfillmentService: " + GraphQLRequestSerializer.getEntry(fulfillmentService));
        }
        joiner.add("fulfillsOnlineOrders: " + GraphQLRequestSerializer.getEntry(fulfillsOnlineOrders));
        joiner.add("hasActiveInventory: " + GraphQLRequestSerializer.getEntry(hasActiveInventory));
        joiner.add("hasUnfulfilledOrders: " + GraphQLRequestSerializer.getEntry(hasUnfulfilledOrders));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (inventoryLevel != null) {
            joiner.add("inventoryLevel: " + GraphQLRequestSerializer.getEntry(inventoryLevel));
        }
        if (inventoryLevels != null) {
            joiner.add("inventoryLevels: " + GraphQLRequestSerializer.getEntry(inventoryLevels));
        }
        joiner.add("isActive: " + GraphQLRequestSerializer.getEntry(isActive));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("shipsInventory: " + GraphQLRequestSerializer.getEntry(shipsInventory));
        if (suggestedAddresses != null) {
            joiner.add("suggestedAddresses: " + GraphQLRequestSerializer.getEntry(suggestedAddresses));
        }
        return joiner.toString();
    }

    public static LocationTO.Builder builder() {
        return new LocationTO.Builder();
    }

    public static class Builder {

        private boolean activatable;
        private LocationAddressTO address;
        private boolean addressVerified;
        private boolean deactivatable;
        private java.util.Date deactivatedAt;
        private boolean deletable;
        private FulfillmentServiceTO fulfillmentService;
        private boolean fulfillsOnlineOrders;
        private boolean hasActiveInventory;
        private boolean hasUnfulfilledOrders;
        private String id;
        private InventoryLevelTO inventoryLevel;
        private InventoryLevelConnectionTO inventoryLevels;
        private boolean isActive;
        private String name;
        private boolean shipsInventory;
        private java.util.List<LocationAddressTO> suggestedAddresses;

        public Builder() {
        }

        public Builder setActivatable(boolean activatable) {
            this.activatable = activatable;
            return this;
        }

        public Builder setAddress(LocationAddressTO address) {
            this.address = address;
            return this;
        }

        public Builder setAddressVerified(boolean addressVerified) {
            this.addressVerified = addressVerified;
            return this;
        }

        public Builder setDeactivatable(boolean deactivatable) {
            this.deactivatable = deactivatable;
            return this;
        }

        public Builder setDeactivatedAt(java.util.Date deactivatedAt) {
            this.deactivatedAt = deactivatedAt;
            return this;
        }

        public Builder setDeletable(boolean deletable) {
            this.deletable = deletable;
            return this;
        }

        public Builder setFulfillmentService(FulfillmentServiceTO fulfillmentService) {
            this.fulfillmentService = fulfillmentService;
            return this;
        }

        public Builder setFulfillsOnlineOrders(boolean fulfillsOnlineOrders) {
            this.fulfillsOnlineOrders = fulfillsOnlineOrders;
            return this;
        }

        public Builder setHasActiveInventory(boolean hasActiveInventory) {
            this.hasActiveInventory = hasActiveInventory;
            return this;
        }

        public Builder setHasUnfulfilledOrders(boolean hasUnfulfilledOrders) {
            this.hasUnfulfilledOrders = hasUnfulfilledOrders;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInventoryLevel(InventoryLevelTO inventoryLevel) {
            this.inventoryLevel = inventoryLevel;
            return this;
        }

        public Builder setInventoryLevels(InventoryLevelConnectionTO inventoryLevels) {
            this.inventoryLevels = inventoryLevels;
            return this;
        }

        public Builder setIsActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setShipsInventory(boolean shipsInventory) {
            this.shipsInventory = shipsInventory;
            return this;
        }

        public Builder setSuggestedAddresses(java.util.List<LocationAddressTO> suggestedAddresses) {
            this.suggestedAddresses = suggestedAddresses;
            return this;
        }


        public LocationTO build() {
            return new LocationTO(activatable, address, addressVerified, deactivatable, deactivatedAt, deletable, fulfillmentService, fulfillsOnlineOrders, hasActiveInventory, hasUnfulfilledOrders, id, inventoryLevel, inventoryLevels, isActive, name, shipsInventory, suggestedAddresses);
        }

    }
}
