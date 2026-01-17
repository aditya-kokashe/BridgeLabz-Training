package com.generics.SmartWarehouse;

public class WarehouseApp {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
