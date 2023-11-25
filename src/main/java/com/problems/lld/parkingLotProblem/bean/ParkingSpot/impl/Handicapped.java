package com.problems.lld.parkingLotProblem.bean.ParkingSpot.impl;

import com.problems.lld.parkingLotProblem.bean.ParkingSpot.ParkingSpot;
import com.problems.lld.parkingLotProblem.bean.Vehicle.Vehicle;

public class Handicapped extends ParkingSpot {
    public boolean assignVehicle(Vehicle vehicle) {
        // definition
        System.out.println("assigning vehicle");
        return false;
    }
}
