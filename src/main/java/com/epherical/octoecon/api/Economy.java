package com.epherical.octoecon.api;

import com.epherical.octoecon.api.user.FakeUser;
import com.epherical.octoecon.api.user.UniqueUser;
import com.epherical.octoecon.api.user.User;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface Economy {

    boolean enabled();

    Set<Currency> getCurrencies();

    Currency getDefaultCurrency();

    /**
     * @param uuid the UUID of the account to get or create.
     * @return The {@link User} if it exists.
     */
    Optional<User> getOrCreateAccount(UUID uuid);

    /**
     * @param uuid the UUID of the account to get or create
     * @return The {@link UniqueUser} if it exists.
     */
    Optional<UniqueUser> getOrCreatePlayerAccount(UUID uuid);


    Collection<UniqueUser> getUniqueUsers();

    Collection<User> getAllUsers();

    Collection<FakeUser> getFakeUsers();

    boolean hasAccount(UUID uuid);

    boolean deleteAccount(UUID uuid);

}
