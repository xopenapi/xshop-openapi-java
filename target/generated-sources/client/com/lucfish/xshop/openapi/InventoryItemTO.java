package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class InventoryItemTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private CountryHarmonizedSystemCodeConnectionTO countryHarmonizedSystemCodes;
    @javax.validation.constraints.NotNull
    private InventoryLevelConnectionTO inventoryLevels;
    private CountryCodeTO countryCodeOfOrigin;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private int duplicateSkuCount;
    private String harmonizedSystemCode;
    @javax.validation.constraints.NotNull
    private String id;
    private String inventoryHistoryUrl;
    private InventoryLevelTO inventoryLevel;
    private int locationsCount;
    private String provinceCodeOfOrigin;
    private boolean requiresShipping;
    private String sku;
    private boolean tracked;
    @javax.validation.constraints.NotNull
    private EditablePropertyTO trackedEditable;
    private MoneyTO unitCost;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private ProductVariantTO variant;

    public InventoryItemTO() {
    }

    public InventoryItemTO(CountryHarmonizedSystemCodeConnectionTO countryHarmonizedSystemCodes, InventoryLevelConnectionTO inventoryLevels, CountryCodeTO countryCodeOfOrigin, java.util.Date createdAt, int duplicateSkuCount, String harmonizedSystemCode, String id, String inventoryHistoryUrl, InventoryLevelTO inventoryLevel, int locationsCount, String provinceCodeOfOrigin, boolean requiresShipping, String sku, boolean tracked, EditablePropertyTO trackedEditable, MoneyTO unitCost, java.util.Date updatedAt, ProductVariantTO variant) {
        this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
        this.inventoryLevels = inventoryLevels;
        this.countryCodeOfOrigin = countryCodeOfOrigin;
        this.createdAt = createdAt;
        this.duplicateSkuCount = duplicateSkuCount;
        this.harmonizedSystemCode = harmonizedSystemCode;
        this.id = id;
        this.inventoryHistoryUrl = inventoryHistoryUrl;
        this.inventoryLevel = inventoryLevel;
        this.locationsCount = locationsCount;
        this.provinceCodeOfOrigin = provinceCodeOfOrigin;
        this.requiresShipping = requiresShipping;
        this.sku = sku;
        this.tracked = tracked;
        this.trackedEditable = trackedEditable;
        this.unitCost = unitCost;
        this.updatedAt = updatedAt;
        this.variant = variant;
    }

    public CountryHarmonizedSystemCodeConnectionTO getCountryHarmonizedSystemCodes() {
        return countryHarmonizedSystemCodes;
    }
    public void setCountryHarmonizedSystemCodes(CountryHarmonizedSystemCodeConnectionTO countryHarmonizedSystemCodes) {
        this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
    }

    public InventoryLevelConnectionTO getInventoryLevels() {
        return inventoryLevels;
    }
    public void setInventoryLevels(InventoryLevelConnectionTO inventoryLevels) {
        this.inventoryLevels = inventoryLevels;
    }

    public CountryCodeTO getCountryCodeOfOrigin() {
        return countryCodeOfOrigin;
    }
    public void setCountryCodeOfOrigin(CountryCodeTO countryCodeOfOrigin) {
        this.countryCodeOfOrigin = countryCodeOfOrigin;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getDuplicateSkuCount() {
        return duplicateSkuCount;
    }
    public void setDuplicateSkuCount(int duplicateSkuCount) {
        this.duplicateSkuCount = duplicateSkuCount;
    }

    public String getHarmonizedSystemCode() {
        return harmonizedSystemCode;
    }
    public void setHarmonizedSystemCode(String harmonizedSystemCode) {
        this.harmonizedSystemCode = harmonizedSystemCode;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getInventoryHistoryUrl() {
        return inventoryHistoryUrl;
    }
    public void setInventoryHistoryUrl(String inventoryHistoryUrl) {
        this.inventoryHistoryUrl = inventoryHistoryUrl;
    }

    public InventoryLevelTO getInventoryLevel() {
        return inventoryLevel;
    }
    public void setInventoryLevel(InventoryLevelTO inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public int getLocationsCount() {
        return locationsCount;
    }
    public void setLocationsCount(int locationsCount) {
        this.locationsCount = locationsCount;
    }

    public String getProvinceCodeOfOrigin() {
        return provinceCodeOfOrigin;
    }
    public void setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
        this.provinceCodeOfOrigin = provinceCodeOfOrigin;
    }

    public boolean getRequiresShipping() {
        return requiresShipping;
    }
    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean getTracked() {
        return tracked;
    }
    public void setTracked(boolean tracked) {
        this.tracked = tracked;
    }

    public EditablePropertyTO getTrackedEditable() {
        return trackedEditable;
    }
    public void setTrackedEditable(EditablePropertyTO trackedEditable) {
        this.trackedEditable = trackedEditable;
    }

    public MoneyTO getUnitCost() {
        return unitCost;
    }
    public void setUnitCost(MoneyTO unitCost) {
        this.unitCost = unitCost;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProductVariantTO getVariant() {
        return variant;
    }
    public void setVariant(ProductVariantTO variant) {
        this.variant = variant;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (countryHarmonizedSystemCodes != null) {
            joiner.add("countryHarmonizedSystemCodes: " + GraphQLRequestSerializer.getEntry(countryHarmonizedSystemCodes));
        }
        if (inventoryLevels != null) {
            joiner.add("inventoryLevels: " + GraphQLRequestSerializer.getEntry(inventoryLevels));
        }
        if (countryCodeOfOrigin != null) {
            joiner.add("countryCodeOfOrigin: " + GraphQLRequestSerializer.getEntry(countryCodeOfOrigin));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        joiner.add("duplicateSkuCount: " + GraphQLRequestSerializer.getEntry(duplicateSkuCount));
        if (harmonizedSystemCode != null) {
            joiner.add("harmonizedSystemCode: " + GraphQLRequestSerializer.getEntry(harmonizedSystemCode));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (inventoryHistoryUrl != null) {
            joiner.add("inventoryHistoryUrl: " + GraphQLRequestSerializer.getEntry(inventoryHistoryUrl));
        }
        if (inventoryLevel != null) {
            joiner.add("inventoryLevel: " + GraphQLRequestSerializer.getEntry(inventoryLevel));
        }
        joiner.add("locationsCount: " + GraphQLRequestSerializer.getEntry(locationsCount));
        if (provinceCodeOfOrigin != null) {
            joiner.add("provinceCodeOfOrigin: " + GraphQLRequestSerializer.getEntry(provinceCodeOfOrigin));
        }
        joiner.add("requiresShipping: " + GraphQLRequestSerializer.getEntry(requiresShipping));
        if (sku != null) {
            joiner.add("sku: " + GraphQLRequestSerializer.getEntry(sku));
        }
        joiner.add("tracked: " + GraphQLRequestSerializer.getEntry(tracked));
        if (trackedEditable != null) {
            joiner.add("trackedEditable: " + GraphQLRequestSerializer.getEntry(trackedEditable));
        }
        if (unitCost != null) {
            joiner.add("unitCost: " + GraphQLRequestSerializer.getEntry(unitCost));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (variant != null) {
            joiner.add("variant: " + GraphQLRequestSerializer.getEntry(variant));
        }
        return joiner.toString();
    }

    public static InventoryItemTO.Builder builder() {
        return new InventoryItemTO.Builder();
    }

    public static class Builder {

        private CountryHarmonizedSystemCodeConnectionTO countryHarmonizedSystemCodes;
        private InventoryLevelConnectionTO inventoryLevels;
        private CountryCodeTO countryCodeOfOrigin;
        private java.util.Date createdAt;
        private int duplicateSkuCount;
        private String harmonizedSystemCode;
        private String id;
        private String inventoryHistoryUrl;
        private InventoryLevelTO inventoryLevel;
        private int locationsCount;
        private String provinceCodeOfOrigin;
        private boolean requiresShipping;
        private String sku;
        private boolean tracked;
        private EditablePropertyTO trackedEditable;
        private MoneyTO unitCost;
        private java.util.Date updatedAt;
        private ProductVariantTO variant;

        public Builder() {
        }

        public Builder setCountryHarmonizedSystemCodes(CountryHarmonizedSystemCodeConnectionTO countryHarmonizedSystemCodes) {
            this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
            return this;
        }

        public Builder setInventoryLevels(InventoryLevelConnectionTO inventoryLevels) {
            this.inventoryLevels = inventoryLevels;
            return this;
        }

        public Builder setCountryCodeOfOrigin(CountryCodeTO countryCodeOfOrigin) {
            this.countryCodeOfOrigin = countryCodeOfOrigin;
            return this;
        }

        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDuplicateSkuCount(int duplicateSkuCount) {
            this.duplicateSkuCount = duplicateSkuCount;
            return this;
        }

        public Builder setHarmonizedSystemCode(String harmonizedSystemCode) {
            this.harmonizedSystemCode = harmonizedSystemCode;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInventoryHistoryUrl(String inventoryHistoryUrl) {
            this.inventoryHistoryUrl = inventoryHistoryUrl;
            return this;
        }

        public Builder setInventoryLevel(InventoryLevelTO inventoryLevel) {
            this.inventoryLevel = inventoryLevel;
            return this;
        }

        public Builder setLocationsCount(int locationsCount) {
            this.locationsCount = locationsCount;
            return this;
        }

        public Builder setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
            this.provinceCodeOfOrigin = provinceCodeOfOrigin;
            return this;
        }

        public Builder setRequiresShipping(boolean requiresShipping) {
            this.requiresShipping = requiresShipping;
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTracked(boolean tracked) {
            this.tracked = tracked;
            return this;
        }

        public Builder setTrackedEditable(EditablePropertyTO trackedEditable) {
            this.trackedEditable = trackedEditable;
            return this;
        }

        public Builder setUnitCost(MoneyTO unitCost) {
            this.unitCost = unitCost;
            return this;
        }

        public Builder setUpdatedAt(java.util.Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setVariant(ProductVariantTO variant) {
            this.variant = variant;
            return this;
        }


        public InventoryItemTO build() {
            return new InventoryItemTO(countryHarmonizedSystemCodes, inventoryLevels, countryCodeOfOrigin, createdAt, duplicateSkuCount, harmonizedSystemCode, id, inventoryHistoryUrl, inventoryLevel, locationsCount, provinceCodeOfOrigin, requiresShipping, sku, tracked, trackedEditable, unitCost, updatedAt, variant);
        }

    }
}
