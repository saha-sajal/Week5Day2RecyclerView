package com.week5.week5day2recyclerview;

public class Product {
    private String productName;
    private int productImgId;

    public Product(String name, int id)
    {
        this.productName = name;
        this.productImgId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(int productImgId) {
        this.productImgId = productImgId;
    }
}
