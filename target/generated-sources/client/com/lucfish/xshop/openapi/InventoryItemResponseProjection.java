package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for InventoryItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class InventoryItemResponseProjection extends GraphQLResponseProjection {

    public InventoryItemResponseProjection() {
    }

    @Override
    public InventoryItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public InventoryItemResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.CountryHarmonizedSystemCodeConnectionResponseProjection.countryHarmonizedSystemCodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryItemResponseProjection.CountryHarmonizedSystemCodeConnectionResponseProjection.countryHarmonizedSystemCodes", projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.CountryHarmonizedSystemCodeConnectionResponseProjection.countryHarmonizedSystemCodes", 0) + 1);
            this.countryHarmonizedSystemCodes(new CountryHarmonizedSystemCodeConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.CountryHarmonizedSystemCodeConnectionResponseProjection.countryHarmonizedSystemCodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryItemResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", 0) + 1);
            this.inventoryLevels(new InventoryLevelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.InventoryLevelConnectionResponseProjection.inventoryLevels", 0)));
        }
        this.countryCodeOfOrigin();
        this.createdAt();
        this.duplicateSkuCount();
        this.harmonizedSystemCode();
        this.id();
        this.inventoryHistoryUrl();
        if (projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.InventoryLevelResponseProjection.inventoryLevel", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryItemResponseProjection.InventoryLevelResponseProjection.inventoryLevel", projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.InventoryLevelResponseProjection.inventoryLevel", 0) + 1);
            this.inventoryLevel(new InventoryLevelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.InventoryLevelResponseProjection.inventoryLevel", 0)));
        }
        this.locationsCount();
        this.provinceCodeOfOrigin();
        this.requiresShipping();
        this.sku();
        this.tracked();
        if (projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.EditablePropertyResponseProjection.trackedEditable", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryItemResponseProjection.EditablePropertyResponseProjection.trackedEditable", projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.EditablePropertyResponseProjection.trackedEditable", 0) + 1);
            this.trackedEditable(new EditablePropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.EditablePropertyResponseProjection.trackedEditable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.MoneyResponseProjection.unitCost", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryItemResponseProjection.MoneyResponseProjection.unitCost", projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.MoneyResponseProjection.unitCost", 0) + 1);
            this.unitCost(new MoneyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.MoneyResponseProjection.unitCost", 0)));
        }
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.ProductVariantResponseProjection.variant", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryItemResponseProjection.ProductVariantResponseProjection.variant", projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.ProductVariantResponseProjection.variant", 0) + 1);
            this.variant(new ProductVariantResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryItemResponseProjection.ProductVariantResponseProjection.variant", 0)));
        }
        this.typename();
        return this;
    }

    public InventoryItemResponseProjection countryHarmonizedSystemCodes(CountryHarmonizedSystemCodeConnectionResponseProjection subProjection) {
        return countryHarmonizedSystemCodes((String)null, subProjection);
    }

    public InventoryItemResponseProjection countryHarmonizedSystemCodes(String alias, CountryHarmonizedSystemCodeConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("countryHarmonizedSystemCodes").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection countryHarmonizedSystemCodes(InventoryItemCountryHarmonizedSystemCodesParametrizedInput input, CountryHarmonizedSystemCodeConnectionResponseProjection subProjection) {
        return countryHarmonizedSystemCodes(null, input, subProjection);
    }

    public InventoryItemResponseProjection countryHarmonizedSystemCodes(String alias, InventoryItemCountryHarmonizedSystemCodesParametrizedInput input, CountryHarmonizedSystemCodeConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("countryHarmonizedSystemCodes").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection inventoryLevels(InventoryLevelConnectionResponseProjection subProjection) {
        return inventoryLevels((String)null, subProjection);
    }

    public InventoryItemResponseProjection inventoryLevels(String alias, InventoryLevelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevels").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection inventoryLevels(InventoryItemInventoryLevelsParametrizedInput input, InventoryLevelConnectionResponseProjection subProjection) {
        return inventoryLevels(null, input, subProjection);
    }

    public InventoryItemResponseProjection inventoryLevels(String alias, InventoryItemInventoryLevelsParametrizedInput input, InventoryLevelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection countryCodeOfOrigin() {
        return countryCodeOfOrigin(null);
    }

    public InventoryItemResponseProjection countryCodeOfOrigin(String alias) {
        fields.add(new GraphQLResponseField("countryCodeOfOrigin").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection createdAt() {
        return createdAt(null);
    }

    public InventoryItemResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection duplicateSkuCount() {
        return duplicateSkuCount(null);
    }

    public InventoryItemResponseProjection duplicateSkuCount(String alias) {
        fields.add(new GraphQLResponseField("duplicateSkuCount").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection harmonizedSystemCode() {
        return harmonizedSystemCode(null);
    }

    public InventoryItemResponseProjection harmonizedSystemCode(String alias) {
        fields.add(new GraphQLResponseField("harmonizedSystemCode").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection id() {
        return id(null);
    }

    public InventoryItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection inventoryHistoryUrl() {
        return inventoryHistoryUrl(null);
    }

    public InventoryItemResponseProjection inventoryHistoryUrl(String alias) {
        fields.add(new GraphQLResponseField("inventoryHistoryUrl").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection inventoryLevel(InventoryLevelResponseProjection subProjection) {
        return inventoryLevel((String)null, subProjection);
    }

    public InventoryItemResponseProjection inventoryLevel(String alias, InventoryLevelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevel").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection inventoryLevel(InventoryItemInventoryLevelParametrizedInput input, InventoryLevelResponseProjection subProjection) {
        return inventoryLevel(null, input, subProjection);
    }

    public InventoryItemResponseProjection inventoryLevel(String alias, InventoryItemInventoryLevelParametrizedInput input, InventoryLevelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryLevel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection locationsCount() {
        return locationsCount(null);
    }

    public InventoryItemResponseProjection locationsCount(String alias) {
        fields.add(new GraphQLResponseField("locationsCount").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection provinceCodeOfOrigin() {
        return provinceCodeOfOrigin(null);
    }

    public InventoryItemResponseProjection provinceCodeOfOrigin(String alias) {
        fields.add(new GraphQLResponseField("provinceCodeOfOrigin").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection requiresShipping() {
        return requiresShipping(null);
    }

    public InventoryItemResponseProjection requiresShipping(String alias) {
        fields.add(new GraphQLResponseField("requiresShipping").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection sku() {
        return sku(null);
    }

    public InventoryItemResponseProjection sku(String alias) {
        fields.add(new GraphQLResponseField("sku").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection tracked() {
        return tracked(null);
    }

    public InventoryItemResponseProjection tracked(String alias) {
        fields.add(new GraphQLResponseField("tracked").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection trackedEditable(EditablePropertyResponseProjection subProjection) {
        return trackedEditable(null, subProjection);
    }

    public InventoryItemResponseProjection trackedEditable(String alias, EditablePropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("trackedEditable").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection unitCost(MoneyResponseProjection subProjection) {
        return unitCost(null, subProjection);
    }

    public InventoryItemResponseProjection unitCost(String alias, MoneyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unitCost").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public InventoryItemResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public InventoryItemResponseProjection variant(ProductVariantResponseProjection subProjection) {
        return variant(null, subProjection);
    }

    public InventoryItemResponseProjection variant(String alias, ProductVariantResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variant").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryItemResponseProjection typename() {
        return typename(null);
    }

    public InventoryItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
