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
    <T extends Number> T getBalance(Currency<T> currency);

    Map<Currency<? extends Number>, ? extends Number> getAllBalances();

    <T extends Number> boolean hasAmount(Currency<T> currency, T amount);

    <T extends Number> Transaction<T> resetBalance(Currency<T> currency);

    Map<Currency<? extends Number>, Transaction<?>> resetAllBalances();

    <T extends Number> Transaction<T> setBalance(Currency<T> currency, T amount);

    <T extends Number> Transaction<T> sendTo(User user, Currency<T> currency, T amount);

    <T extends Number> Transaction<T> depositMoney(Currency<T> currency, T amount, String reason);

    <T extends Number> Transaction<T> withdrawMoney(Currency<T> currency, T amount, String reason);

    /**
     * For implementations that with to add a transaction through other methods directly to the user.
     */
    <T extends Number> void addTransaction(Transaction<T> transaction);

}
