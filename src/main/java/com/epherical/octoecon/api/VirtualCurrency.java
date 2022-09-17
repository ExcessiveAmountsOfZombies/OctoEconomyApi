package com.epherical.octoecon.api;

/**
 * a VirtualCurrency represents a {@link Currency} that does not need to be saved by the economy implementation.
 * This type of currency likely comes from elsewhere and just needs a form of interaction within the API.
 */
public interface VirtualCurrency extends Currency {
}
