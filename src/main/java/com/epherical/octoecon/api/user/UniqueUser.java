package com.epherical.octoecon.api.user;

import java.util.UUID;

/**
 * Should be used to define Player based accounts.
 */
public interface UniqueUser extends User {

    UUID getUserID();
}
