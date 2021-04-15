package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T17:20:09+0800"
)
public class OrderTransactionTO implements java.io.Serializable, NodeTO {

    private String accountNumber;
    @javax.validation.constraints.NotNull
    private MoneyBagTO amountSet;
    private String authorizationCode;
    private java.util.Date authorizationExpiresAt;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private OrderTransactionErrorCodeTO errorCode;
    @javax.validation.constraints.NotNull
    private java.util.List<TransactionFeeTO> fees;
    private String formattedGateway;
    private String gateway;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private OrderTransactionKindTO kind;
    private boolean manuallyCapturable;
    private MoneyTO maximumRefundableV2;
    private OrderTO order;
    private OrderTransactionTO parentTransaction;
    private ImageTO paymentIcon;
    private java.util.Date processedAt;
    private CurrencyCodeTO settlementCurrency;
    private Double settlementCurrencyRate;
    @javax.validation.constraints.NotNull
    private OrderTransactionStatusTO status;
    private boolean test;
    private MoneyBagTO totalUnsettledSet;

    public OrderTransactionTO() {
    }

    public OrderTransactionTO(String accountNumber, MoneyBagTO amountSet, String authorizationCode, java.util.Date authorizationExpiresAt, java.util.Date createdAt, OrderTransactionErrorCodeTO errorCode, java.util.List<TransactionFeeTO> fees, String formattedGateway, String gateway, String id, OrderTransactionKindTO kind, boolean manuallyCapturable, MoneyTO maximumRefundableV2, OrderTO order, OrderTransactionTO parentTransaction, ImageTO paymentIcon, java.util.Date processedAt, CurrencyCodeTO settlementCurrency, Double settlementCurrencyRate, OrderTransactionStatusTO status, boolean test, MoneyBagTO totalUnsettledSet) {
        this.accountNumber = accountNumber;
        this.amountSet = amountSet;
        this.authorizationCode = authorizationCode;
        this.authorizationExpiresAt = authorizationExpiresAt;
        this.createdAt = createdAt;
        this.errorCode = errorCode;
        this.fees = fees;
        this.formattedGateway = formattedGateway;
        this.gateway = gateway;
        this.id = id;
        this.kind = kind;
        this.manuallyCapturable = manuallyCapturable;
        this.maximumRefundableV2 = maximumRefundableV2;
        this.order = order;
        this.parentTransaction = parentTransaction;
        this.paymentIcon = paymentIcon;
        this.processedAt = processedAt;
        this.settlementCurrency = settlementCurrency;
        this.settlementCurrencyRate = settlementCurrencyRate;
        this.status = status;
        this.test = test;
        this.totalUnsettledSet = totalUnsettledSet;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * The masked account number associated with the payment method.
     */
    public MoneyBagTO getAmountSet() {
        return amountSet;
    }
    /**
     * The masked account number associated with the payment method.
     */
    public void setAmountSet(MoneyBagTO amountSet) {
        this.amountSet = amountSet;
    }

    /**
     * The amount and currency of the transaction in shop and presentment currencies.
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }
    /**
     * The amount and currency of the transaction in shop and presentment currencies.
     */
    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * Authorization code associated with the transaction.
     */
    public java.util.Date getAuthorizationExpiresAt() {
        return authorizationExpiresAt;
    }
    /**
     * Authorization code associated with the transaction.
     */
    public void setAuthorizationExpiresAt(java.util.Date authorizationExpiresAt) {
        this.authorizationExpiresAt = authorizationExpiresAt;
    }

    /**
     * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan and is populated only for Shopify Payments authorizations.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    /**
     * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan and is populated only for Shopify Payments authorizations.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Date and time when the transaction was created.
     */
    public OrderTransactionErrorCodeTO getErrorCode() {
        return errorCode;
    }
    /**
     * Date and time when the transaction was created.
     */
    public void setErrorCode(OrderTransactionErrorCodeTO errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * A standardized error code, independent of the payment provider.
     */
    public java.util.List<TransactionFeeTO> getFees() {
        return fees;
    }
    /**
     * A standardized error code, independent of the payment provider.
     */
    public void setFees(java.util.List<TransactionFeeTO> fees) {
        this.fees = fees;
    }

    /**
     * The transaction fees charged on the order transaction.
     */
    public String getFormattedGateway() {
        return formattedGateway;
    }
    /**
     * The transaction fees charged on the order transaction.
     */
    public void setFormattedGateway(String formattedGateway) {
        this.formattedGateway = formattedGateway;
    }

    /**
     * The human-readable payment gateway name used to process the transaction.
     */
    public String getGateway() {
        return gateway;
    }
    /**
     * The human-readable payment gateway name used to process the transaction.
     */
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * The payment gateway used to process the transaction.
     */
    public String getId() {
        return id;
    }
    /**
     * The payment gateway used to process the transaction.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Globally unique identifier.
     */
    public OrderTransactionKindTO getKind() {
        return kind;
    }
    /**
     * Globally unique identifier.
     */
    public void setKind(OrderTransactionKindTO kind) {
        this.kind = kind;
    }

    /**
     * The kind of transaction.
     */
    public boolean getManuallyCapturable() {
        return manuallyCapturable;
    }
    /**
     * The kind of transaction.
     */
    public void setManuallyCapturable(boolean manuallyCapturable) {
        this.manuallyCapturable = manuallyCapturable;
    }

    /**
     * Whether the transaction can be manually captured.
     */
    public MoneyTO getMaximumRefundableV2() {
        return maximumRefundableV2;
    }
    /**
     * Whether the transaction can be manually captured.
     */
    public void setMaximumRefundableV2(MoneyTO maximumRefundableV2) {
        this.maximumRefundableV2 = maximumRefundableV2;
    }

    /**
     * Specifies the available amount with currency to refund on the gateway. Only available within SuggestedRefund.
     */
    public OrderTO getOrder() {
        return order;
    }
    /**
     * Specifies the available amount with currency to refund on the gateway. Only available within SuggestedRefund.
     */
    public void setOrder(OrderTO order) {
        this.order = order;
    }

    /**
     * 关联的订单
     */
    public OrderTransactionTO getParentTransaction() {
        return parentTransaction;
    }
    /**
     * 关联的订单
     */
    public void setParentTransaction(OrderTransactionTO parentTransaction) {
        this.parentTransaction = parentTransaction;
    }

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    public ImageTO getPaymentIcon() {
        return paymentIcon;
    }
    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    public void setPaymentIcon(ImageTO paymentIcon) {
        this.paymentIcon = paymentIcon;
    }

    /**
     * Specifies the payment icon to display for this transaction.
     */
    public java.util.Date getProcessedAt() {
        return processedAt;
    }
    /**
     * Specifies the payment icon to display for this transaction.
     */
    public void setProcessedAt(java.util.Date processedAt) {
        this.processedAt = processedAt;
    }

    /**
     * Date and time when the transaction was processed.
     */
    public CurrencyCodeTO getSettlementCurrency() {
        return settlementCurrency;
    }
    /**
     * Date and time when the transaction was processed.
     */
    public void setSettlementCurrency(CurrencyCodeTO settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    /**
     * The settlement currency
     */
    public Double getSettlementCurrencyRate() {
        return settlementCurrencyRate;
    }
    /**
     * The settlement currency
     */
    public void setSettlementCurrencyRate(Double settlementCurrencyRate) {
        this.settlementCurrencyRate = settlementCurrencyRate;
    }

    /**
     * The rate used when converting the transaction amount to settlement currency.
     * shopifyPaymentsSet: ShopifyPaymentsTransactionSet # Contains all Shopify Payments information related to an order transaction. This field is available only to stores on a Shopify Plus plan.
     */
    public OrderTransactionStatusTO getStatus() {
        return status;
    }
    /**
     * The rate used when converting the transaction amount to settlement currency.
     * shopifyPaymentsSet: ShopifyPaymentsTransactionSet # Contains all Shopify Payments information related to an order transaction. This field is available only to stores on a Shopify Plus plan.
     */
    public void setStatus(OrderTransactionStatusTO status) {
        this.status = status;
    }

    /**
     * The status of this transaction.
     */
    public boolean getTest() {
        return test;
    }
    /**
     * The status of this transaction.
     */
    public void setTest(boolean test) {
        this.test = test;
    }

    /**
     * Whether the transaction is a test transaction.
     */
    public MoneyBagTO getTotalUnsettledSet() {
        return totalUnsettledSet;
    }
    /**
     * Whether the transaction is a test transaction.
     */
    public void setTotalUnsettledSet(MoneyBagTO totalUnsettledSet) {
        this.totalUnsettledSet = totalUnsettledSet;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (accountNumber != null) {
            joiner.add("accountNumber: " + GraphQLRequestSerializer.getEntry(accountNumber));
        }
        if (amountSet != null) {
            joiner.add("amountSet: " + GraphQLRequestSerializer.getEntry(amountSet));
        }
        if (authorizationCode != null) {
            joiner.add("authorizationCode: " + GraphQLRequestSerializer.getEntry(authorizationCode));
        }
        if (authorizationExpiresAt != null) {
            joiner.add("authorizationExpiresAt: " + GraphQLRequestSerializer.getEntry(authorizationExpiresAt));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (errorCode != null) {
            joiner.add("errorCode: " + GraphQLRequestSerializer.getEntry(errorCode));
        }
        if (fees != null) {
            joiner.add("fees: " + GraphQLRequestSerializer.getEntry(fees));
        }
        if (formattedGateway != null) {
            joiner.add("formattedGateway: " + GraphQLRequestSerializer.getEntry(formattedGateway));
        }
        if (gateway != null) {
            joiner.add("gateway: " + GraphQLRequestSerializer.getEntry(gateway));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (kind != null) {
            joiner.add("kind: " + GraphQLRequestSerializer.getEntry(kind));
        }
        joiner.add("manuallyCapturable: " + GraphQLRequestSerializer.getEntry(manuallyCapturable));
        if (maximumRefundableV2 != null) {
            joiner.add("maximumRefundableV2: " + GraphQLRequestSerializer.getEntry(maximumRefundableV2));
        }
        if (order != null) {
            joiner.add("order: " + GraphQLRequestSerializer.getEntry(order));
        }
        if (parentTransaction != null) {
            joiner.add("parentTransaction: " + GraphQLRequestSerializer.getEntry(parentTransaction));
        }
        if (paymentIcon != null) {
            joiner.add("paymentIcon: " + GraphQLRequestSerializer.getEntry(paymentIcon));
        }
        if (processedAt != null) {
            joiner.add("processedAt: " + GraphQLRequestSerializer.getEntry(processedAt));
        }
        if (settlementCurrency != null) {
            joiner.add("settlementCurrency: " + GraphQLRequestSerializer.getEntry(settlementCurrency));
        }
        if (settlementCurrencyRate != null) {
            joiner.add("settlementCurrencyRate: " + GraphQLRequestSerializer.getEntry(settlementCurrencyRate));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        joiner.add("test: " + GraphQLRequestSerializer.getEntry(test));
        if (totalUnsettledSet != null) {
            joiner.add("totalUnsettledSet: " + GraphQLRequestSerializer.getEntry(totalUnsettledSet));
        }
        return joiner.toString();
    }

    public static OrderTransactionTO.Builder builder() {
        return new OrderTransactionTO.Builder();
    }

    public static class Builder {

        private String accountNumber;
        private MoneyBagTO amountSet;
        private String authorizationCode;
        private java.util.Date authorizationExpiresAt;
        private java.util.Date createdAt;
        private OrderTransactionErrorCodeTO errorCode;
        private java.util.List<TransactionFeeTO> fees;
        private String formattedGateway;
        private String gateway;
        private String id;
        private OrderTransactionKindTO kind;
        private boolean manuallyCapturable;
        private MoneyTO maximumRefundableV2;
        private OrderTO order;
        private OrderTransactionTO parentTransaction;
        private ImageTO paymentIcon;
        private java.util.Date processedAt;
        private CurrencyCodeTO settlementCurrency;
        private Double settlementCurrencyRate;
        private OrderTransactionStatusTO status;
        private boolean test;
        private MoneyBagTO totalUnsettledSet;

        public Builder() {
        }

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * The masked account number associated with the payment method.
         */
        public Builder setAmountSet(MoneyBagTO amountSet) {
            this.amountSet = amountSet;
            return this;
        }

        /**
         * The amount and currency of the transaction in shop and presentment currencies.
         */
        public Builder setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }

        /**
         * Authorization code associated with the transaction.
         */
        public Builder setAuthorizationExpiresAt(java.util.Date authorizationExpiresAt) {
            this.authorizationExpiresAt = authorizationExpiresAt;
            return this;
        }

        /**
         * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan and is populated only for Shopify Payments authorizations.
         */
        public Builder setCreatedAt(java.util.Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Date and time when the transaction was created.
         */
        public Builder setErrorCode(OrderTransactionErrorCodeTO errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * A standardized error code, independent of the payment provider.
         */
        public Builder setFees(java.util.List<TransactionFeeTO> fees) {
            this.fees = fees;
            return this;
        }

        /**
         * The transaction fees charged on the order transaction.
         */
        public Builder setFormattedGateway(String formattedGateway) {
            this.formattedGateway = formattedGateway;
            return this;
        }

        /**
         * The human-readable payment gateway name used to process the transaction.
         */
        public Builder setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * The payment gateway used to process the transaction.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Globally unique identifier.
         */
        public Builder setKind(OrderTransactionKindTO kind) {
            this.kind = kind;
            return this;
        }

        /**
         * The kind of transaction.
         */
        public Builder setManuallyCapturable(boolean manuallyCapturable) {
            this.manuallyCapturable = manuallyCapturable;
            return this;
        }

        /**
         * Whether the transaction can be manually captured.
         */
        public Builder setMaximumRefundableV2(MoneyTO maximumRefundableV2) {
            this.maximumRefundableV2 = maximumRefundableV2;
            return this;
        }

        /**
         * Specifies the available amount with currency to refund on the gateway. Only available within SuggestedRefund.
         */
        public Builder setOrder(OrderTO order) {
            this.order = order;
            return this;
        }

        /**
         * 关联的订单
         */
        public Builder setParentTransaction(OrderTransactionTO parentTransaction) {
            this.parentTransaction = parentTransaction;
            return this;
        }

        /**
         * The associated parent transaction, for example the authorization of a capture.
         */
        public Builder setPaymentIcon(ImageTO paymentIcon) {
            this.paymentIcon = paymentIcon;
            return this;
        }

        /**
         * Specifies the payment icon to display for this transaction.
         */
        public Builder setProcessedAt(java.util.Date processedAt) {
            this.processedAt = processedAt;
            return this;
        }

        /**
         * Date and time when the transaction was processed.
         */
        public Builder setSettlementCurrency(CurrencyCodeTO settlementCurrency) {
            this.settlementCurrency = settlementCurrency;
            return this;
        }

        /**
         * The settlement currency
         */
        public Builder setSettlementCurrencyRate(Double settlementCurrencyRate) {
            this.settlementCurrencyRate = settlementCurrencyRate;
            return this;
        }

        /**
         * The rate used when converting the transaction amount to settlement currency.
         * shopifyPaymentsSet: ShopifyPaymentsTransactionSet # Contains all Shopify Payments information related to an order transaction. This field is available only to stores on a Shopify Plus plan.
         */
        public Builder setStatus(OrderTransactionStatusTO status) {
            this.status = status;
            return this;
        }

        /**
         * The status of this transaction.
         */
        public Builder setTest(boolean test) {
            this.test = test;
            return this;
        }

        /**
         * Whether the transaction is a test transaction.
         */
        public Builder setTotalUnsettledSet(MoneyBagTO totalUnsettledSet) {
            this.totalUnsettledSet = totalUnsettledSet;
            return this;
        }


        public OrderTransactionTO build() {
            return new OrderTransactionTO(accountNumber, amountSet, authorizationCode, authorizationExpiresAt, createdAt, errorCode, fees, formattedGateway, gateway, id, kind, manuallyCapturable, maximumRefundableV2, order, parentTransaction, paymentIcon, processedAt, settlementCurrency, settlementCurrencyRate, status, test, totalUnsettledSet);
        }

    }
}
