package com.epherical.octoecon.api.user;

import com.epherical.octoecon.api.Currency;
import com.epherical.octoecon.api.transaction.Transaction;
import net.minecraft.network.chat.Component;

import java.util.Map;
import java.util.UUID;

public interface User {

    UUID getUserID();

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

}
