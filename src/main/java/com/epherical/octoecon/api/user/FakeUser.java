package com.epherical.octoecon.api.user;

/**
 * Anyone that isn't a player is a FakeUser. Banks, global accounts, taxes, void accounts, prize pools.
 * All can be considered fake users.
 */
public interface FakeUser extends User {

}
