package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class ImageInputTO implements java.io.Serializable {

    private String alt;

    public ImageInputTO() {
    }

    public ImageInputTO(String alt) {
        this.alt = alt;
    }

    public String getAlt() {
        return alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (alt != null) {
            joiner.add("alt: " + GraphQLRequestSerializer.getEntry(alt));
        }
        return joiner.toString();
    }

    public static ImageInputTO.Builder builder() {
        return new ImageInputTO.Builder();
    }

    public static class Builder {

        private String alt;

        public Builder() {
        }

        public Builder setAlt(String alt) {
            this.alt = alt;
            return this;
        }


        public ImageInputTO build() {
            return new ImageInputTO(alt);
        }

    }
}
