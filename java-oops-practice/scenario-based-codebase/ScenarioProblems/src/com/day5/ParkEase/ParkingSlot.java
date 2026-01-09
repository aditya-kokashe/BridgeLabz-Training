package com.day5.ParkEase;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Internal booking record (restricted)
    private String bookingLog;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Controlled booking
    public boolean assignSlot(Vehicle vehicle) {
        if (isOccupied) {
            return false;
        }

        if (!vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {
            return false;
        }

        isOccupied = true;
        bookingLog = "Slot " + slotId + " booked for " + vehicle.getClass().getSimpleName();
        return true;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot " + slotId + " is now free";
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    // Read-only access to logs
    public void displayLog() {
        System.out.println("Log: " + bookingLog);
    }

    public void displaySlot() {
        System.out.println(
                "Slot: " + slotId +
                " | Location: " + location +
                " | Allowed: " + vehicleTypeAllowed +
                " | Available: " + !isOccupied
        );
    }
}

