package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field image in type LineItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class LineItemImageParametrizedInput implements GraphQLParametrizedInput {

    private CropRegionTO crop;
    private Integer maxHeight;
    private Integer maxWidth;
    private Integer scale;

    public LineItemImageParametrizedInput() {
    }

    public LineItemImageParametrizedInput(CropRegionTO crop, Integer maxHeight, Integer maxWidth, Integer scale) {
        this.crop = crop;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.scale = scale;
    }

    public LineItemImageParametrizedInput crop(CropRegionTO crop) {
        this.crop = crop;
        return this;
    }

    public LineItemImageParametrizedInput maxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public LineItemImageParametrizedInput maxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public LineItemImageParametrizedInput scale(Integer scale) {
        this.scale = scale;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (crop != null) {
            joiner.add("crop: " + GraphQLRequestSerializer.getEntry(crop));
        }
        if (maxHeight != null) {
            joiner.add("maxHeight: " + GraphQLRequestSerializer.getEntry(maxHeight));
        }
        if (maxWidth != null) {
            joiner.add("maxWidth: " + GraphQLRequestSerializer.getEntry(maxWidth));
        }
        if (scale != null) {
            joiner.add("scale: " + GraphQLRequestSerializer.getEntry(scale));
        }
        return joiner.toString();
    }

}
