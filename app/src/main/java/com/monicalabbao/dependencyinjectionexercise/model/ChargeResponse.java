package com.monicalabbao.dependencyinjectionexercise.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class ChargeResponse implements Serializable{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("amount_refunded")
    @Expose
    private Integer amountRefunded;
    @SerializedName("application")
    @Expose
    private Object application;
    @SerializedName("application_fee")
    @Expose
    private Object applicationFee;
    @SerializedName("balance_transaction")
    @Expose
    private String balanceTransaction;
    @SerializedName("captured")
    @Expose
    private Boolean captured;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("customer")
    @Expose
    private Object customer;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("destination")
    @Expose
    private Object destination;
    @SerializedName("dispute")
    @Expose
    private Object dispute;
    @SerializedName("failure_code")
    @Expose
    private Object failureCode;
    @SerializedName("failure_message")
    @Expose
    private Object failureMessage;
    @SerializedName("fraud_details")
    @Expose
    private FraudDetails fraudDetails;
    @SerializedName("invoice")
    @Expose
    private Object invoice;
    @SerializedName("livemode")
    @Expose
    private Boolean livemode;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("on_behalf_of")
    @Expose
    private Object onBehalfOf;
    @SerializedName("order")
    @Expose
    private Object order;
    @SerializedName("outcome")
    @Expose
    private Outcome outcome;
    @SerializedName("paid")
    @Expose
    private Boolean paid;
    @SerializedName("receipt_email")
    @Expose
    private Object receiptEmail;
    @SerializedName("receipt_number")
    @Expose
    private Object receiptNumber;
    @SerializedName("refunded")
    @Expose
    private Boolean refunded;
    @SerializedName("refunds")
    @Expose
    private Refunds refunds;
    @SerializedName("review")
    @Expose
    private Object review;
    @SerializedName("shipping")
    @Expose
    private Object shipping;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("source_transfer")
    @Expose
    private Object sourceTransfer;
    @SerializedName("statement_descriptor")
    @Expose
    private Object statementDescriptor;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("transfer_group")
    @Expose
    private Object transferGroup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(Integer amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Object getApplication() {
        return application;
    }

    public void setApplication(Object application) {
        this.application = application;
    }

    public Object getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Object applicationFee) {
        this.applicationFee = applicationFee;
    }

    public String getBalanceTransaction() {
        return balanceTransaction;
    }

    public void setBalanceTransaction(String balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
    }

    public Boolean getCaptured() {
        return captured;
    }

    public void setCaptured(Boolean captured) {
        this.captured = captured;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Object customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getDestination() {
        return destination;
    }

    public void setDestination(Object destination) {
        this.destination = destination;
    }

    public Object getDispute() {
        return dispute;
    }

    public void setDispute(Object dispute) {
        this.dispute = dispute;
    }

    public Object getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(Object failureCode) {
        this.failureCode = failureCode;
    }

    public Object getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(Object failureMessage) {
        this.failureMessage = failureMessage;
    }

    public FraudDetails getFraudDetails() {
        return fraudDetails;
    }

    public void setFraudDetails(FraudDetails fraudDetails) {
        this.fraudDetails = fraudDetails;
    }

    public Object getInvoice() {
        return invoice;
    }

    public void setInvoice(Object invoice) {
        this.invoice = invoice;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Object getOnBehalfOf() {
        return onBehalfOf;
    }

    public void setOnBehalfOf(Object onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Object getReceiptEmail() {
        return receiptEmail;
    }

    public void setReceiptEmail(Object receiptEmail) {
        this.receiptEmail = receiptEmail;
    }

    public Object getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(Object receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public Refunds getRefunds() {
        return refunds;
    }

    public void setRefunds(Refunds refunds) {
        this.refunds = refunds;
    }

    public Object getReview() {
        return review;
    }

    public void setReview(Object review) {
        this.review = review;
    }

    public Object getShipping() {
        return shipping;
    }

    public void setShipping(Object shipping) {
        this.shipping = shipping;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Object getSourceTransfer() {
        return sourceTransfer;
    }

    public void setSourceTransfer(Object sourceTransfer) {
        this.sourceTransfer = sourceTransfer;
    }

    public Object getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(Object statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getTransferGroup() {
        return transferGroup;
    }

    public void setTransferGroup(Object transferGroup) {
        this.transferGroup = transferGroup;
    }

    public static class FraudDetails {


    }

    public static class Metadata {


    }

    public static class Outcome {

        @SerializedName("network_status")
        @Expose
        private String networkStatus;
        @SerializedName("reason")
        @Expose
        private Object reason;
        @SerializedName("risk_level")
        @Expose
        private String riskLevel;
        @SerializedName("seller_message")
        @Expose
        private String sellerMessage;
        @SerializedName("type")
        @Expose
        private String type;

        public String getNetworkStatus() {
            return networkStatus;
        }

        public void setNetworkStatus(String networkStatus) {
            this.networkStatus = networkStatus;
        }

        public Object getReason() {
            return reason;
        }

        public void setReason(Object reason) {
            this.reason = reason;
        }

        public String getRiskLevel() {
            return riskLevel;
        }

        public void setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
        }

        public String getSellerMessage() {
            return sellerMessage;
        }

        public void setSellerMessage(String sellerMessage) {
            this.sellerMessage = sellerMessage;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }

    public static class Refunds {

        @SerializedName("object")
        @Expose
        private String object;
        @SerializedName("data")
        @Expose
        private List<Object> data = null;
        @SerializedName("has_more")
        @Expose
        private Boolean hasMore;
        @SerializedName("total_count")
        @Expose
        private Integer totalCount;
        @SerializedName("url")
        @Expose
        private String url;

        public String getObject() {
            return object;
        }

        public void setObject(String object) {
            this.object = object;
        }

        public List<Object> getData() {
            return data;
        }

        public void setData(List<Object> data) {
            this.data = data;
        }

        public Boolean getHasMore() {
            return hasMore;
        }

        public void setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public static class Source {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("object")
        @Expose
        private String object;
        @SerializedName("address_city")
        @Expose
        private Object addressCity;
        @SerializedName("address_country")
        @Expose
        private Object addressCountry;
        @SerializedName("address_line1")
        @Expose
        private Object addressLine1;
        @SerializedName("address_line1_check")
        @Expose
        private Object addressLine1Check;
        @SerializedName("address_line2")
        @Expose
        private Object addressLine2;
        @SerializedName("address_state")
        @Expose
        private Object addressState;
        @SerializedName("address_zip")
        @Expose
        private Object addressZip;
        @SerializedName("address_zip_check")
        @Expose
        private Object addressZipCheck;
        @SerializedName("brand")
        @Expose
        private String brand;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("customer")
        @Expose
        private Object customer;
        @SerializedName("cvc_check")
        @Expose
        private String cvcCheck;
        @SerializedName("dynamic_last4")
        @Expose
        private Object dynamicLast4;
        @SerializedName("exp_month")
        @Expose
        private Integer expMonth;
        @SerializedName("exp_year")
        @Expose
        private Integer expYear;
        @SerializedName("fingerprint")
        @Expose
        private String fingerprint;
        @SerializedName("funding")
        @Expose
        private String funding;
        @SerializedName("last4")
        @Expose
        private String last4;
        @SerializedName("metadata")
        @Expose
        private Metadata metadata;
        @SerializedName("name")
        @Expose
        private Object name;
        @SerializedName("tokenization_method")
        @Expose
        private Object tokenizationMethod;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getObject() {
            return object;
        }

        public void setObject(String object) {
            this.object = object;
        }

        public Object getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(Object addressCity) {
            this.addressCity = addressCity;
        }

        public Object getAddressCountry() {
            return addressCountry;
        }

        public void setAddressCountry(Object addressCountry) {
            this.addressCountry = addressCountry;
        }

        public Object getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(Object addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public Object getAddressLine1Check() {
            return addressLine1Check;
        }

        public void setAddressLine1Check(Object addressLine1Check) {
            this.addressLine1Check = addressLine1Check;
        }

        public Object getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(Object addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public Object getAddressState() {
            return addressState;
        }

        public void setAddressState(Object addressState) {
            this.addressState = addressState;
        }

        public Object getAddressZip() {
            return addressZip;
        }

        public void setAddressZip(Object addressZip) {
            this.addressZip = addressZip;
        }

        public Object getAddressZipCheck() {
            return addressZipCheck;
        }

        public void setAddressZipCheck(Object addressZipCheck) {
            this.addressZipCheck = addressZipCheck;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Object getCustomer() {
            return customer;
        }

        public void setCustomer(Object customer) {
            this.customer = customer;
        }

        public String getCvcCheck() {
            return cvcCheck;
        }

        public void setCvcCheck(String cvcCheck) {
            this.cvcCheck = cvcCheck;
        }

        public Object getDynamicLast4() {
            return dynamicLast4;
        }

        public void setDynamicLast4(Object dynamicLast4) {
            this.dynamicLast4 = dynamicLast4;
        }

        public Integer getExpMonth() {
            return expMonth;
        }

        public void setExpMonth(Integer expMonth) {
            this.expMonth = expMonth;
        }

        public Integer getExpYear() {
            return expYear;
        }

        public void setExpYear(Integer expYear) {
            this.expYear = expYear;
        }

        public String getFingerprint() {
            return fingerprint;
        }

        public void setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
        }

        public String getFunding() {
            return funding;
        }

        public void setFunding(String funding) {
            this.funding = funding;
        }

        public String getLast4() {
            return last4;
        }

        public void setLast4(String last4) {
            this.last4 = last4;
        }

        public Metadata getMetadata() {
            return metadata;
        }

        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public Object getTokenizationMethod() {
            return tokenizationMethod;
        }

        public void setTokenizationMethod(Object tokenizationMethod) {
            this.tokenizationMethod = tokenizationMethod;
        }

    }
}

