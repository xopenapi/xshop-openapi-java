package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum CropRegionTO {

    BOTTOM("BOTTOM"),
    CENTER("CENTER"),
    LEFT("LEFT"),
    RIGHT("RIGHT"),
    TOP("TOP");

    private final String graphqlName;

    private CropRegionTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
