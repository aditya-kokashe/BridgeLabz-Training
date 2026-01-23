package com.day9.EcommerceBST;

public class EcommerceMain {

    public static void main(String[] args) {

        ProductBST bst = new ProductBST();

        bst.insert(500, "Laptop");
        bst.insert(300, "Phone");
        bst.insert(700, "Headphones");

        System.out.print("Sorted SKU: ");
        bst.inorder();

        bst.search(700);
    }
}