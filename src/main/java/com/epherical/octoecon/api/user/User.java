package com.epherical.octoecon.api.user;

import com.epherical.octoecon.api.Currency;
import com.epherical.octoecon.api.transaction.Transaction;
import net.minecraft.network.chat.Component;

import java.util.Map;

/**
 * The base user.
 */
public interface User {

    /**
     * Should return a display name that is meant for end-user viewing.
     * @return A display name for the User.
     */
    Component getDisplayName();

    double getBalance(Currency currency);

    Map<Currency, Double> getAllBalances();

    boolean hasAmount(Currency currency, double amount);

    Transaction resetBalance(Currency currency);

    Map<Currency, Transaction> resetAllBalances();

    Transaction setBalance(Currency currency, double amount);

    Transaction sendTo(User user, Currency currency, double amount);

    Transaction depositMoney(double amount);

    Transaction withdrawMoney(double amount);

    /**
     * A method to identify a user, not always meant for end-user viewing.
     * @return The string identification for the {@link User}
     */
    String getIdentifier();

}
