package com.problems.lld.parkingLotProblem.bean.Account;

import com.problems.lld.parkingLotProblem.bean.custom.Person;
import com.problems.lld.parkingLotProblem.enums.AccountStatus;

public abstract class Account {
    // Data members
    private String userName;
    private String password;
    private Person person; // Refers to an instance of the Person class
    private AccountStatus status; // Refers to the AccountStatus enum

    public abstract boolean resetPassword();
}

