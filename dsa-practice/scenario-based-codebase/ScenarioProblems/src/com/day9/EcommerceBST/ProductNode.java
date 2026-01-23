package com.day9.EcommerceBST;

public class ProductNode {
    int sku;
    String productName;
    ProductNode left, right;

    public ProductNode(int sku, String productName) {
        this.sku = sku;
        this.productName = productName;
    }
}