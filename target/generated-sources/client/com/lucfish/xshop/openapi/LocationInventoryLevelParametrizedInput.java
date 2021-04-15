package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field inventoryLevel in type Location
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class LocationInventoryLevelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String inventoryItemId;

    public LocationInventoryLevelParametrizedInput() {
    }

    public LocationInventoryLevelParametrizedInput(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public LocationInventoryLevelParametrizedInput inventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (inventoryItemId != null) {
            joiner.add("inventoryItemId: " + GraphQLRequestSerializer.getEntry(inventoryItemId));
        }
        return joiner.toString();
    }

}
