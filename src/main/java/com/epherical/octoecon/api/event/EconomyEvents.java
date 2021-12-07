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
        /**
         * Called whenever an implementation forces the economy to change.
         * Any mods that are planning on using this API should listen for this event to keep the most up to date
         * {@link Economy} implementation.
         * @param economy
         */
        void onEconomyChanged(Economy economy);
    }

}
