package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float riskFactor;

    @Column(nullable = false)
    private long total;

    @Column(nullable = false)
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String name, float riskFactor, long total, Client client) {
        this.name = name;
        this.riskFactor = riskFactor;
        this.total = total;
        this.client = client;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRiskFactor() {
        return this.riskFactor;
    }

    public void setRiskFactor(float riskFactor) {
        this.riskFactor = riskFactor;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
