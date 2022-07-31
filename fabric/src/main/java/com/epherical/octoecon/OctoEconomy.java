package com.epherical.octoecon;

import com.epherical.octoecon.api.Economy;
import com.epherical.octoecon.api.event.EconomyEvents;
import net.fabricmc.api.ModInitializer;

public class OctoEconomy implements ModInitializer {


    private Economy currentEconomy;
    private static OctoEconomy instance;

    @Override
    public void onInitialize() {
        instance = this;
        EconomyEvents.ECONOMY_CHANGE_EVENT.register(economy -> this.currentEconomy = economy);
    }

    public static OctoEconomy getInstance() {
        return instance;
    }

    public Economy getCurrentEconomy() {
        return currentEconomy;
    }
}
