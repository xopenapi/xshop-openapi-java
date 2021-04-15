package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ImageTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String alt;
    private Integer width;
    private Integer height;
    @javax.validation.constraints.NotNull
    private String originalSrc;
    @javax.validation.constraints.NotNull
    private String transformedSrc;

    public ImageTO() {
    }

    public ImageTO(String id, String alt, Integer width, Integer height, String originalSrc, String transformedSrc) {
        this.id = id;
        this.alt = alt;
        this.width = width;
        this.height = height;
        this.originalSrc = originalSrc;
        this.transformedSrc = transformedSrc;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAlt() {
        return alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getOriginalSrc() {
        return originalSrc;
    }
    public void setOriginalSrc(String originalSrc) {
        this.originalSrc = originalSrc;
    }

    public String getTransformedSrc() {
        return transformedSrc;
    }
    public void setTransformedSrc(String transformedSrc) {
        this.transformedSrc = transformedSrc;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (alt != null) {
            joiner.add("alt: " + GraphQLRequestSerializer.getEntry(alt));
        }
        if (width != null) {
            joiner.add("width: " + GraphQLRequestSerializer.getEntry(width));
        }
        if (height != null) {
            joiner.add("height: " + GraphQLRequestSerializer.getEntry(height));
        }
        if (originalSrc != null) {
            joiner.add("originalSrc: " + GraphQLRequestSerializer.getEntry(originalSrc));
        }
        if (transformedSrc != null) {
            joiner.add("transformedSrc: " + GraphQLRequestSerializer.getEntry(transformedSrc));
        }
        return joiner.toString();
    }

    public static ImageTO.Builder builder() {
        return new ImageTO.Builder();
    }

    public static class Builder {

        private String id;
        private String alt;
        private Integer width;
        private Integer height;
        private String originalSrc;
        private String transformedSrc;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAlt(String alt) {
            this.alt = alt;
            return this;
        }

        public Builder setWidth(Integer width) {
            this.width = width;
            return this;
        }

        public Builder setHeight(Integer height) {
            this.height = height;
            return this;
        }

        public Builder setOriginalSrc(String originalSrc) {
            this.originalSrc = originalSrc;
            return this;
        }

        public Builder setTransformedSrc(String transformedSrc) {
            this.transformedSrc = transformedSrc;
            return this;
        }


        public ImageTO build() {
            return new ImageTO(id, alt, width, height, originalSrc, transformedSrc);
        }

    }
}
