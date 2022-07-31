package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.transaction.Transaction;
import com.epherical.octoecon.api.user.User;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

/**
 * All events related to a users balance.
 */
public final class BalanceEvents {

    public static final Event<BalanceAdd> BALANCE_ADD_EVENT = EventFactory.createArrayBacked(BalanceAdd.class, calls -> (user, transaction) -> {
        for (BalanceAdd call : calls) {
            call.onBalanceAdd(user, transaction);
        }
    });

    public static final Event<BalanceRemove> BALANCE_REMOVE_EVENT = EventFactory.createArrayBacked(BalanceRemove.class, calls -> (user, transaction) -> {
        for (BalanceRemove call : calls) {
            call.onBalanceRemove(user, transaction);
        }
    });

    /**
     * Should be called when an action leads to the users balance increasing
     */
    public interface BalanceAdd {
        /**
         * Called whenever there is an action that leads to the users balance increasing.
         * @param user {@link User} involved in the balance addition
         * @param transaction the {@link Transaction} involved.
         */
        void onBalanceAdd(User user, Transaction transaction);
    }

    public interface BalanceRemove {
        /**
         * Called whenever there is an action that leads to the users balance decreasing
         * @param user {@link User} involved in the balance removal
         * @param transaction the {@link Transaction} involved.
         */
        void onBalanceRemove(User user, Transaction transaction);
    }

}
