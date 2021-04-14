package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class EditablePropertyTO implements java.io.Serializable {

    private boolean locked;
    private String reason;

    public EditablePropertyTO() {
    }

    public EditablePropertyTO(boolean locked, String reason) {
        this.locked = locked;
        this.reason = reason;
    }

    public boolean getLocked() {
        return locked;
    }
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked));
        if (reason != null) {
            joiner.add("reason: " + GraphQLRequestSerializer.getEntry(reason));
        }
        return joiner.toString();
    }

    public static EditablePropertyTO.Builder builder() {
        return new EditablePropertyTO.Builder();
    }

    public static class Builder {

        private boolean locked;
        private String reason;

        public Builder() {
        }

        public Builder setLocked(boolean locked) {
            this.locked = locked;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }


        public EditablePropertyTO build() {
            return new EditablePropertyTO(locked, reason);
        }

    }
}
