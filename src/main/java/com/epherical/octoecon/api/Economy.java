package com.epherical.octoecon.api;

import com.epherical.octoecon.api.user.FakeUser;
import com.epherical.octoecon.api.user.UniqueUser;
import com.epherical.octoecon.api.user.User;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;

public interface Economy {

    boolean enabled();

    Collection<Currency> getCurrencies();

    Currency getDefaultCurrency();

    @Nullable
    Currency getCurrency(ResourceLocation identifier);

    /**
     * @param identifier the identifier of the account to get or create.
     * @return The {@link User} if it exists or was successfully created.
     */
    @Nullable
    FakeUser getOrCreateAccount(ResourceLocation identifier);

    /**
     * @param identifier the identifier of the account to get or create.
     * @return The {@link UniqueUser} if it exists or was successfully created.
     */
    @Nullable
    UniqueUser getOrCreatePlayerAccount(UUID identifier);

    /**
     * A method to grab a {@link UniqueUser UniqueUser's} account, if it exists by the name.
     * The account should not be created if it doesn't exist, as player accounts should always be identifiable with UUIDs.
     * @param name The name of the account.
     * @return A {@link UniqueUser} if the account exists.
     */
    @Nullable
    UniqueUser getPlayerAccountByName(String name);

    Collection<UniqueUser> getUniqueUsers();

    Collection<User> getAllUsers();

    Collection<FakeUser> getFakeUsers();

    boolean hasAccount(UUID identifier);

    boolean hasAccount(ResourceLocation identifier);

    boolean deleteAccount(UUID identifier);

    boolean deleteAccount(ResourceLocation identifier);

}
