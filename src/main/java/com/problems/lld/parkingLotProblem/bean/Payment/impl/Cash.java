package com.problems.lld.parkingLotProblem.bean.Payment.impl;

import com.problems.lld.parkingLotProblem.bean.Payment.Payment;

public class Cash extends Payment {
    public boolean initiateTransaction() {
        // definition
        System.out.println("initiating transaction");
        return false;
    }
}
