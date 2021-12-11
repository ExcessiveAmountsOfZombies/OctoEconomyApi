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

    Collection<UniqueUser> getUniqueUsers();

    Collection<User> getAllUsers();

    Collection<FakeUser> getFakeUsers();

    boolean hasAccount(UUID identifier);

    boolean hasAccount(ResourceLocation identifier);

    boolean deleteAccount(UUID identifier);

    boolean deleteAccount(ResourceLocation identifier);

}
