package com.epherical.octoecon.api;

import com.epherical.octoecon.api.transaction.Transaction;
import com.epherical.octoecon.api.user.User;

public interface BalanceProvider<T extends Number> {

    T getBalance(User user);

    Transaction<T> setBalance(User user, T amount, Currency<T> currencyUsed);

    Transaction<T> sendTo(User from, User to, T amount, Currency<T> currencyUsed);

    Transaction<T> deposit(User user, T amount, String reason, Currency<T> currencyUsed);

    Transaction<T> withdraw(User user, T amount, String reason, Currency<T> currencyUsed);

}
