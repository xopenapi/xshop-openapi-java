package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field images in type Product
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class ProductImagesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private CropRegionTO crop;
    private Integer first;
    private Integer last;
    private Integer maxHeight;
    private Integer maxWidth;
    private Boolean reverse;
    private Integer scale;
    private ProductImageSortKeysTO sortKey;

    public ProductImagesParametrizedInput() {
    }

    public ProductImagesParametrizedInput(String after, String before, CropRegionTO crop, Integer first, Integer last, Integer maxHeight, Integer maxWidth, Boolean reverse, Integer scale, ProductImageSortKeysTO sortKey) {
        this.after = after;
        this.before = before;
        this.crop = crop;
        this.first = first;
        this.last = last;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.reverse = reverse;
        this.scale = scale;
        this.sortKey = sortKey;
    }

    public ProductImagesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ProductImagesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ProductImagesParametrizedInput crop(CropRegionTO crop) {
        this.crop = crop;
        return this;
    }

    public ProductImagesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ProductImagesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ProductImagesParametrizedInput maxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public ProductImagesParametrizedInput maxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public ProductImagesParametrizedInput reverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    public ProductImagesParametrizedInput scale(Integer scale) {
        this.scale = scale;
        return this;
    }

    public ProductImagesParametrizedInput sortKey(ProductImageSortKeysTO sortKey) {
        this.sortKey = sortKey;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (crop != null) {
            joiner.add("crop: " + GraphQLRequestSerializer.getEntry(crop));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (maxHeight != null) {
            joiner.add("maxHeight: " + GraphQLRequestSerializer.getEntry(maxHeight));
        }
        if (maxWidth != null) {
            joiner.add("maxWidth: " + GraphQLRequestSerializer.getEntry(maxWidth));
        }
        if (reverse != null) {
            joiner.add("reverse: " + GraphQLRequestSerializer.getEntry(reverse));
        }
        if (scale != null) {
            joiner.add("scale: " + GraphQLRequestSerializer.getEntry(scale));
        }
        if (sortKey != null) {
            joiner.add("sortKey: " + GraphQLRequestSerializer.getEntry(sortKey));
        }
        return joiner.toString();
    }

}
