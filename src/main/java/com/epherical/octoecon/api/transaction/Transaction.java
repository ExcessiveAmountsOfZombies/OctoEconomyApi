package com.epherical.octoecon.api.transaction;

import com.epherical.octoecon.api.user.User;
import net.minecraft.world.entity.player.Player;

public interface Transaction {

    /**
     * How much the transaction is worth. This does not return the entire value of the {@link User} just the delta of their value.
     * @return the amount of money that the {@link User} will change by.
     */
    double getTransactionDelta();

    /**
     * @return The {@link User} involved in the transaction
     */
    User getUser();

    /**
     * @return A message that can either be sent to the {@link Player} or used for logging purposes.
     */
    String getMessage();

    /**
     * @return return the {@link Response} of the transaction. Implementations can further add their own Responses.
     */
    Response getTransactionResponse();

    /**
     * @return return the {@link Type} of transaction. Implementations can further add their own Types.
     */
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
