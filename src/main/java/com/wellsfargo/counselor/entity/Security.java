package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private float quantity;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private float total;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date purchaseDate;

    @ManyToOne
    private Portfolio portfolio;

    protected Security() {
    }

    public Security(String symbol, String type, float quantity, float price, float total, Date purchaseDate, Portfolio portfolio) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
