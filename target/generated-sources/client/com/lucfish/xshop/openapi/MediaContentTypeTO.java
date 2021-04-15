package com.lucfish.xshop.openapi;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public enum MediaContentTypeTO {

    EXTERNAL_VIDEO("EXTERNAL_VIDEO"),
    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    MODEL_3D("MODEL_3D");

    private final String graphqlName;

    private MediaContentTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
