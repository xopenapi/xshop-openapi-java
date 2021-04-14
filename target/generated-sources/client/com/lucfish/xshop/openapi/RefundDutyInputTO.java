package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public class RefundDutyInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String dutyId;
    private RefundDutyRefundTypeTO refundType;

    public RefundDutyInputTO() {
    }

    public RefundDutyInputTO(String dutyId, RefundDutyRefundTypeTO refundType) {
        this.dutyId = dutyId;
        this.refundType = refundType;
    }

    public String getDutyId() {
        return dutyId;
    }
    public void setDutyId(String dutyId) {
        this.dutyId = dutyId;
    }

    public RefundDutyRefundTypeTO getRefundType() {
        return refundType;
    }
    public void setRefundType(RefundDutyRefundTypeTO refundType) {
        this.refundType = refundType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (dutyId != null) {
            joiner.add("dutyId: " + GraphQLRequestSerializer.getEntry(dutyId));
        }
        if (refundType != null) {
            joiner.add("refundType: " + GraphQLRequestSerializer.getEntry(refundType));
        }
        return joiner.toString();
    }

    public static RefundDutyInputTO.Builder builder() {
        return new RefundDutyInputTO.Builder();
    }

    public static class Builder {

        private String dutyId;
        private RefundDutyRefundTypeTO refundType;

        public Builder() {
        }

        public Builder setDutyId(String dutyId) {
            this.dutyId = dutyId;
            return this;
        }

        public Builder setRefundType(RefundDutyRefundTypeTO refundType) {
            this.refundType = refundType;
            return this;
        }


        public RefundDutyInputTO build() {
            return new RefundDutyInputTO(dutyId, refundType);
        }

    }
}
