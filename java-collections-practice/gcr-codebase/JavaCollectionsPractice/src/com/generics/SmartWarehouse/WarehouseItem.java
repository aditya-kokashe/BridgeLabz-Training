package com.generics.SmartWarehouse;

public abstract class WarehouseItem {

    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Each item will describe itself
    public abstract String getCategory();
}
