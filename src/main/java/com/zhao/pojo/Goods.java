package com.zhao.pojo;

public class Goods {
    private Byte id;

    private String goodName;

    private Double goodPrice;

    private String goodAddress;

    private Integer goodNumber;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodAddress() {
        return goodAddress;
    }

    public void setGoodAddress(String goodAddress) {
        this.goodAddress = goodAddress == null ? null : goodAddress.trim();
    }

    public Integer getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(Integer goodNumber) {
        this.goodNumber = goodNumber;
    }
}