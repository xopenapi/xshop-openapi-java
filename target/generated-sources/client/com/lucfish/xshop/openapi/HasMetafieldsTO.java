package com.lucfish.xshop.openapi;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public interface HasMetafieldsTO {

    MetafieldTO getMetafield();

    @javax.validation.constraints.NotNull
    MetafieldConnectionTO getMetafields();

    MetafieldTO getPrivateMetafield();

    @javax.validation.constraints.NotNull
    MetafieldConnectionTO getPrivateMetafields();

}
