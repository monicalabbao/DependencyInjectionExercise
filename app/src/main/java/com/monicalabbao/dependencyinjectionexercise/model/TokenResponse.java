package com.monicalabbao.dependencyinjectionexercise.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TokenResponse implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("card")
    @Expose
    private Card card;
    @SerializedName("client_ip")
    @Expose
    private String clientIp;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("livemode")
    @Expose
    private Boolean livemode;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("used")
    @Expose
    private Boolean used;

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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public static class Card {

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

    public static class Metadata {


    }

}