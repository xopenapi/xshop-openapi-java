package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field inventoryLevel in type InventoryItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class InventoryItemInventoryLevelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String locationId;

    public InventoryItemInventoryLevelParametrizedInput() {
    }

    public InventoryItemInventoryLevelParametrizedInput(String locationId) {
        this.locationId = locationId;
    }

    public InventoryItemInventoryLevelParametrizedInput locationId(String locationId) {
        this.locationId = locationId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (locationId != null) {
            joiner.add("locationId: " + GraphQLRequestSerializer.getEntry(locationId));
        }
        return joiner.toString();
    }

}
