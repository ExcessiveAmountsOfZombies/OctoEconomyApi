package com.epherical.octoecon.api;

import com.epherical.octoecon.api.user.FakeUser;
import com.epherical.octoecon.api.user.UniqueUser;
import com.epherical.octoecon.api.user.User;
import net.minecraft.resources.ResourceLocation;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface Economy {

    boolean enabled();

    Set<Currency> getCurrencies();

    Currency getDefaultCurrency();

    Currency getCurrency(String identifier);

    /**
     * @param identifier the identifier of the account to get or create.
     * @return The {@link User} if it exists.
     */
    Optional<FakeUser> getOrCreateAccount(ResourceLocation identifier);

    /**
     * @param identifier the identifier of the account to get or create
     * @return The {@link UniqueUser} if it exists.
     */
    Optional<UniqueUser> getOrCreatePlayerAccount(UUID identifier);

    /**
     * @param identifier the identifier of the account to get or create
     * @return The {@link User} if it exists.
     */
    Optional<User> getOrCreatePlayerAccount(String identifier);

    Collection<UniqueUser> getUniqueUsers();

    Collection<User> getAllUsers();

    Collection<FakeUser> getFakeUsers();

    boolean hasAccount(UUID identifier);

    boolean hasAccount(String identifier);

    boolean deleteAccount(UUID identifier);

    boolean deleteAccount(String identifier);

}
