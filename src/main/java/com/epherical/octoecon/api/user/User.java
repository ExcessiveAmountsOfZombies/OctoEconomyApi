package com.epherical.octoecon.api.user;

import com.epherical.octoecon.api.Currency;
import com.epherical.octoecon.api.transaction.Transaction;
import net.minecraft.network.chat.Component;

import java.util.Map;

/**
 * The base user.
 */
public interface User extends EconomyIdentity {

    /**
     * Should return a display name that is meant for end-user viewing.
     * @return A display name for the User.
     */
    Component getDisplayName();

    /**
     * Depending on implementation will get the balance of a {@link Currency} as it is, or it will get the balance after processing
     * pending {@link Transaction transactions}.
     * @param currency The currency to get the balance of
     * @return the value in that currency
     */
    double getBalance(Currency currency);

    Map<Currency, Double> getAllBalances();

    boolean hasAmount(Currency currency, double amount);

    Transaction resetBalance(Currency currency);

    Map<Currency, Transaction> resetAllBalances();

    Transaction setBalance(Currency currency, double amount);

    Transaction sendTo(User user, Currency currency, double amount);

    Transaction depositMoney(Currency currency, double amount, String reason);

    Transaction withdrawMoney(Currency currency, double amount, String reason);

    /**
     * For implementations that with to add a transaction through other methods directly to the user.
     */
    void addTransaction(Transaction transaction);

}
