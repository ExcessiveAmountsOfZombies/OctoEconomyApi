package com.epherical.octoecon.api;

import net.minecraft.network.chat.Component;

public interface Currency {


    Component getCurrencySingularName();

    Component getCurrencyPluralName();

    Component getCurrencySymbol();

    default int decimalPlaces() {
        return 2;
    }

    Component format(double value);

    Component format(double value, int decimalPlaces);

}
