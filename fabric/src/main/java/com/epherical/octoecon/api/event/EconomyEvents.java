package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.Currency;
import com.epherical.octoecon.api.Economy;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

import java.util.ArrayList;
import java.util.List;

public final class EconomyEvents {

    public static final Event<EconomyChange> ECONOMY_CHANGE_EVENT = EventFactory.createArrayBacked(EconomyChange.class, calls -> economy -> {
        for (EconomyChange call : calls) {
            call.onEconomyChanged(economy);
        }
    });

    public static final Event<CurrencyAdd> CURRENCY_ADD_EVENT = EventFactory.createArrayBacked(CurrencyAdd.class, calls -> () -> {
        List<Currency> currencyList = new ArrayList<>();
        for (CurrencyAdd call : calls) {
            currencyList.addAll(call.addCurrency());
        }
        return currencyList;
    });


    public interface EconomyChange {
        /**
         * Called whenever an implementation forces the economy to change.
         * Any mods that are planning on using this API should listen for this event to keep the most up to date
         * {@link Economy} implementation.
         * @param economy
         */
        void onEconomyChanged(Economy economy);
    }

    /**
     * This event MUST be called by an implementation that wishes to add additional currency support.
     */
    public interface CurrencyAdd {
        /**
         * Called by an implementation that wishes to allow other mods to add additional currencies.
         */
        List<Currency> addCurrency();
    }

}
