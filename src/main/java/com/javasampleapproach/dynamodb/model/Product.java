package com.javasampleapproach.dynamodb.model;

public class Product {

    private String productId;
    private String productShortName;
    private String productLongName;
    private String originalPrice;
    private String salesPrice;
    private String productStatus;

    public Product(String productId, String productShortName, String productLongName, String originalPrice, String salesPrice, String productStatus) {
        this.productId = productId;
        this.productShortName = productShortName;
        this.productLongName = productLongName;
        this.originalPrice = originalPrice;
        this.salesPrice = salesPrice;
        this.productStatus = productStatus;
    }

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getProductLongName() {
        return productLongName;
    }

    public void setProductLongName(String productLongName) {
        this.productLongName = productLongName;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
}
