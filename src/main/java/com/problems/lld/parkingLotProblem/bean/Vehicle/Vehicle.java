package com.problems.lld.parkingLotProblem.bean.Vehicle;

import com.problems.lld.parkingLotProblem.bean.ParkingTicket;

// Vehicle is an abstract class
public abstract class Vehicle {
    private int licenseNo;
    public abstract void assignTicket(ParkingTicket ticket);
}

