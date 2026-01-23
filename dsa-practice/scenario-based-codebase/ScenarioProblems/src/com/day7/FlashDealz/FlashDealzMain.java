package com.day7.FlashDealz;

public class FlashDealzMain {

    public static void main(String[] args) {

        Product[] products = {
                new Product("TV", 40),
                new Product("Smart Watch", 60),
                new Product("Torch", 30),
                new Product("Laptop", 50)
        };

        FlashDealz fd = new FlashDealz();
        fd.quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products: \n");
        for (Product p : products)
            System.out.println(p);
    }
}