package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class ProductPriceRangeConnectionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<ProductPriceRangeEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public ProductPriceRangeConnectionTO() {
    }

    public ProductPriceRangeConnectionTO(java.util.List<ProductPriceRangeEdgeTO> edges, PageInfoTO pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public java.util.List<ProductPriceRangeEdgeTO> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ProductPriceRangeEdgeTO> edges) {
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

    public static ProductPriceRangeConnectionTO.Builder builder() {
        return new ProductPriceRangeConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<ProductPriceRangeEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        public Builder setEdges(java.util.List<ProductPriceRangeEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public ProductPriceRangeConnectionTO build() {
            return new ProductPriceRangeConnectionTO(edges, pageInfo);
        }

    }
}
