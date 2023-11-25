package com.problems.lld.parkingLotProblem.bean.ParkingSpot;

import com.problems.lld.parkingLotProblem.bean.Vehicle.Vehicle;

// ParkingSpot is an abstract class
public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree() {
        return false;
    }

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        // definition
        return false;
    }
}

