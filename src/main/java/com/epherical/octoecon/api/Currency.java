package com.epherical.octoecon.api;

import com.epherical.octoecon.api.transaction.Transaction;
import com.epherical.octoecon.api.user.EconomyIdentity;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

/**
 * Best practice would be to use an {@link ResourceLocation} as the identity key.
 */
public interface Currency<T extends Number> extends EconomyIdentity {

    Component getCurrencySingularName();

    Component getCurrencyPluralName();

    Component getCurrencySymbol();

    default int decimalPlaces() {
        return 2;
    }

    Component format(T value);

    Component format(T value, int decimalPlaces);

    @Nullable
    BalanceProvider<T> balanceProvider();

    /**
     * @param baseValue The value we wish to manipulate using a made transaction.
     * @param transaction The transaction that will change the value of the baseValue using the {@link com.epherical.octoecon.api.transaction.Transaction.Type}
     *                    that was involved to decide how to change the value.
     * @return The new value after it has been changed.
     */
    T manipulateValue(T baseValue, Transaction<T> transaction);

    T manipulateValue(T baseValue, T deltaValue);

    T defaultValue();

    /**
     *
     * @param compare the first number to compare
     * @param compareWith the second number to compare
     * @return Returns: 0 if compare is the same as compareWith;
     * Less than 0 if compare is less than compareWith;
     * Greater than 0 if compare is greater than compareWith.
     * @since 2.0.0
     */
    int compareValues(T compare, T compareWith);

    T convertPrimitive(Number number);

}
