package com.dvyne.parkinglotsst.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> parkingSpots;
    private int florrNumber;
    private ParkingSpot parkingSpot;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFlorrNumber() {
        return florrNumber;
    }

    public void setFlorrNumber(int florrNumber) {
        this.florrNumber = florrNumber;
    }
}
