package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ProductVariantConnectionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<ProductVariantEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public ProductVariantConnectionTO() {
    }

    public ProductVariantConnectionTO(java.util.List<ProductVariantEdgeTO> edges, PageInfoTO pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public java.util.List<ProductVariantEdgeTO> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ProductVariantEdgeTO> edges) {
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

    public static ProductVariantConnectionTO.Builder builder() {
        return new ProductVariantConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<ProductVariantEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        public Builder setEdges(java.util.List<ProductVariantEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public ProductVariantConnectionTO build() {
            return new ProductVariantConnectionTO(edges, pageInfo);
        }

    }
}
