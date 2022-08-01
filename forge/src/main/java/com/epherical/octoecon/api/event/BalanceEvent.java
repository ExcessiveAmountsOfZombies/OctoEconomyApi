package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.transaction.Transaction;
import com.epherical.octoecon.api.user.User;
import net.minecraftforge.eventbus.api.Event;

public abstract class BalanceEvent extends Event {

    private final User user;
    private final Transaction transaction;

    public BalanceEvent(User user, Transaction transaction) {
        this.user = user;
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public User getUser() {
        return user;
    }

    public static class Add extends BalanceEvent {

        public Add(User user, Transaction transaction) {
            super(user, transaction);
        }
    }

    public static class Remove extends BalanceEvent {

        public Remove(User user, Transaction transaction) {
            super(user, transaction);
        }
    }

}
