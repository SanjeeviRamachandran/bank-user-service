package com.bank.admin.user.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

public class TransactionRequest {

    private AccountRequest sourceAccount;

    private AccountRequest targetAccount;

    @Positive(message = "Transfer amount must be positive")
    @Min(value = 1, message = "Amount must be larger than 1")
    private double amount;

    private String reference;

    @Min(value = -90, message = "Latitude must be between -90 and 90")
    @Max(value = 90, message = "Latitude must be between -90 and 90")
    private Double latitude;

    @Min(value = -180, message = "Longitude must be between -180 and 180")
    @Max(value = 180, message = "Longitude must be between -180 and 180")
    private Double longitude;

    public TransactionRequest() {}

    public AccountRequest getSourceAccount() {
        return sourceAccount;
    }
    public void setSourceAccount(AccountRequest sourceAccount) {
        this.sourceAccount = sourceAccount;
    }
    public AccountRequest getTargetAccount() {
        return targetAccount;
    }
    public void setTargetAccount(AccountRequest targetAccount) {
        this.targetAccount = targetAccount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "TransactionInput{" +
                "sourceAccount=" + sourceAccount +
                ", targetAccount=" + targetAccount +
                ", amount=" + amount +
                ", reference='" + reference + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
