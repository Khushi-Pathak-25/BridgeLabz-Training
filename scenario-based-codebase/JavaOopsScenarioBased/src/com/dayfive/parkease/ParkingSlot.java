package com.dayfive.parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Constructor
    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Controlled access
    public boolean isAvailable() {
        return !isOccupied;
    }

    public void bookSlot() {
        isOccupied = true;
    }

    public void freeSlot() {
        isOccupied = false;
    }

    public String getSlotInfo() {
        return "Slot ID: " + slotId +
               ", Location: " + location +
               ", Allowed: " + vehicleTypeAllowed +
               ", Available: " + isAvailable();
    }
}

