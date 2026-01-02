package com.encapsulationandpolymorphism.fooddelivery;

public abstract class FoodItem {

    private String itemName;
    protected double price;
    protected int quantity;

    //Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //Encapsulation
    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
    }

    //Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    //Abstract method
    public abstract double calculateTotalPrice();
}
