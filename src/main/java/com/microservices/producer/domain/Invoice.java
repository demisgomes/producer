package com.microservices.producer.domain;

import java.math.BigDecimal;

public class Invoice {
    private String provider;
    private String purchaseDate;
    private BigDecimal purchaseAmount;

    public String getProvider() {
        return provider;
    }

    public Invoice(){}

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Invoice(String provider, String purchaseDate, BigDecimal purchaseAmount) {
        this.provider = provider;
        this.purchaseDate = purchaseDate;
        this.purchaseAmount = purchaseAmount;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
