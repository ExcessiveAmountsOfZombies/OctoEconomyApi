package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.Economy;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class EconomyEvents {

    public static final Event<EconomyChange> ECONOMY_CHANGE_EVENT = EventFactory.createArrayBacked(EconomyChange.class, calls -> economy -> {
        for (EconomyChange call : calls) {
            call.onEconomyChanged(economy);
        }
    });


    public interface EconomyChange {
        void onEconomyChanged(Economy economy);
    }

}
