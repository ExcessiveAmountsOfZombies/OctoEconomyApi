package com.epherical.octoecon.api;

import com.epherical.octoecon.api.user.EconomyIdentity;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

/**
 * Best practice would be to use an {@link ResourceLocation} as the identity key.
 */
public interface Currency extends EconomyIdentity {

    Component getCurrencySingularName();

    Component getCurrencyPluralName();

    Component getCurrencySymbol();

    default int decimalPlaces() {
        return 2;
    }

    Component format(double value);

    Component format(double value, int decimalPlaces);

    @Nullable
    BalanceProvider balanceProvider();

}
