package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.transaction.Transaction;
import com.epherical.octoecon.api.user.User;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

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

    public static final Event<BalanceCheck> BALANCE_CHECK_EVENT = EventFactory.createArrayBacked(BalanceCheck.class, calls -> (user, checkForAmount) -> {
        for (BalanceCheck call : calls) {
            call.onBalanceCheck(user, checkForAmount);
        }
    });


    public interface BalanceAdd {
        void onBalanceAdd(User user, Transaction transaction);
    }

    public interface BalanceRemove {
        void onBalanceRemove(User user, Transaction transaction);
    }

    public interface BalanceCheck {
        void onBalanceCheck(User user, double checkForAmount);
    }


}
