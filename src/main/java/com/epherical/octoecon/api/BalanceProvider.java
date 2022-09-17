package com.epherical.octoecon.api;

import com.epherical.octoecon.api.transaction.Transaction;
import com.epherical.octoecon.api.user.User;

public interface BalanceProvider {

    double getBalance(User user);

    Transaction setBalance(User user, double amount, Currency currencyUsed);

    Transaction sendTo(User from, User to, double amount, Currency currencyUsed);

    Transaction deposit(User user, double amount, String reason, Currency currencyUsed);

    Transaction withdraw(User user, double amount, String reason, Currency currencyUsed);

}
