package com.day9.MedWarehouse;

public class MedWarehouseMain {

    public static void main(String[] args) {

        Medicine[] medicines = {
                new Medicine("Paracetamol", 120),
                new Medicine("Insulin", 30),
                new Medicine("Antibiotic", 90),
                new Medicine("Vaccine", 15)
        };

        MedWarehouse warehouse = new MedWarehouse();
        warehouse.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("Medicines sorted by expiry:\n");
        warehouse.displayMedicines(medicines);
    }
}