package com.epherical.octoecon.api.transaction;

import com.epherical.octoecon.api.user.User;

public interface Transaction {

    double getTransactionValue();

    User getUser();

    String getMessage();

    Response getTransactionResponse();

    Type getTransactionType();

    interface Response {
        Response SUCCESS = () -> "success";
        Response FAIL = () -> "fail";
        Response NO_IMPLEMENTATION = () -> "no_implementation";

        String type();
    }

    interface Type {
        Type DEPOSIT = () -> "deposit";
        Type WITHDRAW = () -> "withdraw";


        String type();
    }
}
