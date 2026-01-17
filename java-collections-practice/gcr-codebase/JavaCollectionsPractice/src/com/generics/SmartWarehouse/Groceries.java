package com.generics.SmartWarehouse;

public class Groceries extends WarehouseItem {

    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
