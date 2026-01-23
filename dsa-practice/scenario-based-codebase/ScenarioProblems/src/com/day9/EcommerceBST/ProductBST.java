package com.day9.EcommerceBST;

public class ProductBST {

    ProductNode root;

    public void insert(int sku, String name) {
        root = insertRec(root, sku, name);
    }

    private ProductNode insertRec(ProductNode root, int sku, String name) {
        if (root == null) return new ProductNode(sku, name);

        if (sku < root.sku)
            root.left = insertRec(root.left, sku, name);
        else if (sku > root.sku)
            root.right = insertRec(root.right, sku, name);

        return root;
    }

    public void search(int sku) {
        ProductNode res = searchRec(root, sku);
        System.out.println(res == null ? "Product not found" :
                "\nFound: " + res.sku + " | " + res.productName);
    }

    private ProductNode searchRec(ProductNode root, int sku) {
        if (root == null || root.sku == sku) return root;
        return sku < root.sku ?
                searchRec(root.left, sku) :
                searchRec(root.right, sku);
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(ProductNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.sku + " ");
            inorderRec(root.right);
        }
    }
}