package com.encapsulationandpolymorphism.fooddelivery;

public class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    //Abstract method override
    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }

    //Override interface methods
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; 	//10% off
    }
    @Override
    public String getDiscountDetails() {
        return "Veg Discount: 10%";
    }
}
