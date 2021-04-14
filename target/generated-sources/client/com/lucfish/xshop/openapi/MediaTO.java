package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class MediaTO implements java.io.Serializable {

    private String alt;
    @javax.validation.constraints.NotNull
    private MediaContentTypeTO mediaContentType;
    private ImageTO previewImage;

    public MediaTO() {
    }

    public MediaTO(String alt, MediaContentTypeTO mediaContentType, ImageTO previewImage) {
        this.alt = alt;
        this.mediaContentType = mediaContentType;
        this.previewImage = previewImage;
    }

    public String getAlt() {
        return alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }

    public MediaContentTypeTO getMediaContentType() {
        return mediaContentType;
    }
    public void setMediaContentType(MediaContentTypeTO mediaContentType) {
        this.mediaContentType = mediaContentType;
    }

    public ImageTO getPreviewImage() {
        return previewImage;
    }
    public void setPreviewImage(ImageTO previewImage) {
        this.previewImage = previewImage;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (alt != null) {
            joiner.add("alt: " + GraphQLRequestSerializer.getEntry(alt));
        }
        if (mediaContentType != null) {
            joiner.add("mediaContentType: " + GraphQLRequestSerializer.getEntry(mediaContentType));
        }
        if (previewImage != null) {
            joiner.add("previewImage: " + GraphQLRequestSerializer.getEntry(previewImage));
        }
        return joiner.toString();
    }

    public static MediaTO.Builder builder() {
        return new MediaTO.Builder();
    }

    public static class Builder {

        private String alt;
        private MediaContentTypeTO mediaContentType;
        private ImageTO previewImage;

        public Builder() {
        }

        public Builder setAlt(String alt) {
            this.alt = alt;
            return this;
        }

        public Builder setMediaContentType(MediaContentTypeTO mediaContentType) {
            this.mediaContentType = mediaContentType;
            return this;
        }

        public Builder setPreviewImage(ImageTO previewImage) {
            this.previewImage = previewImage;
            return this;
        }


        public MediaTO build() {
            return new MediaTO(alt, mediaContentType, previewImage);
        }

    }
}
