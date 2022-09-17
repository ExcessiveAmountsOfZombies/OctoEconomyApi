package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.Currency;
import net.minecraftforge.eventbus.api.Event;

import java.util.List;

public class CurrencyAddEvent extends Event {

    private List<Currency> currencyList;

    public CurrencyAddEvent(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void addCurrency(Currency... currencies) {
        this.currencyList.addAll(List.of(currencies));
    }
}
