package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class CheckoutLineItemConnectionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<CheckoutLineItemEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public CheckoutLineItemConnectionTO() {
    }

    public CheckoutLineItemConnectionTO(java.util.List<CheckoutLineItemEdgeTO> edges, PageInfoTO pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public java.util.List<CheckoutLineItemEdgeTO> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<CheckoutLineItemEdgeTO> edges) {
        this.edges = edges;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoTO pageInfo) {
        this.pageInfo = pageInfo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        return joiner.toString();
    }

    public static CheckoutLineItemConnectionTO.Builder builder() {
        return new CheckoutLineItemConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<CheckoutLineItemEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        public Builder setEdges(java.util.List<CheckoutLineItemEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public CheckoutLineItemConnectionTO build() {
            return new CheckoutLineItemConnectionTO(edges, pageInfo);
        }

    }
}
