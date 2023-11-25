package com.problems.lld.parkingLotProblem.bean;

import com.problems.lld.parkingLotProblem.bean.ParkingSpot.impl.Compact;
import com.problems.lld.parkingLotProblem.bean.ParkingSpot.impl.Handicapped;
import com.problems.lld.parkingLotProblem.bean.ParkingSpot.impl.Large;
import com.problems.lld.parkingLotProblem.bean.Vehicle.impl.MotorCycle;

import java.util.List;

public class DisplayBoard {
    // Data members
    private int id;
    private List<Handicapped> handicappedSpot;
    private List<Compact> compactSpot;
    private List<Large> largeSpot;
    private List<MotorCycle> motorCycleSpot;

    // Member function
    public void showFreeSlot() {

    }
}

