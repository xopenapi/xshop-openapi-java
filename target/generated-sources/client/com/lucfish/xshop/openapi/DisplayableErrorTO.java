package com.lucfish.xshop.openapi;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public interface DisplayableErrorTO {

    @javax.validation.constraints.NotNull
    java.util.List<String> getField();

    @javax.validation.constraints.NotNull
    String getMessage();

}
