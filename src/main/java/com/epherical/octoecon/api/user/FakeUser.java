package com.epherical.octoecon.api.user;

import net.minecraft.resources.ResourceLocation;

/**
 * Anyone that isn't a player is a FakeUser. Banks, global accounts, taxes, void accounts, prize pools.
 * All can be considered fake users.
 * Fake users should be given a {@link ResourceLocation} to identify them in a non-conflicting way.
 */
public interface FakeUser extends User {

    /**
     * The ID for a {@link FakeUser}
     * @return the {@link ResourceLocation} for this user.
     */
    ResourceLocation getResourceLocation();
}
