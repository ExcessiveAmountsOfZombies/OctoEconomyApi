package com.epherical.octoecon;

import com.epherical.octoecon.api.Economy;
import com.epherical.octoecon.api.event.EconomyChangeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("octo_economy_api")
public class OctoEconomyApiForge {

    private Economy currentEconomy;
    private static OctoEconomyApiForge instance;

    public OctoEconomyApiForge() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void setEconomy(EconomyChangeEvent event) {
        this.currentEconomy = event.getEconomy();
    }

    public Economy getCurrentEconomy() {
        return currentEconomy;
    }

    public static OctoEconomyApiForge getInstance() {
        return instance;
    }
}
