package com.epherical.octoecon.api.event;

import com.epherical.octoecon.api.Economy;
import net.minecraftforge.eventbus.api.Event;

public class EconomyChangeEvent extends Event {

    private final Economy economy;

    public EconomyChangeEvent(Economy economy) {
        this.economy = economy;
    }

    public Economy getEconomy() {
        return economy;
    }
}
