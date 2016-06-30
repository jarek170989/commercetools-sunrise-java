package com.commercetools.sunrise.shoppingcart.checkout.address;

import io.sphere.sdk.models.Address;

import javax.annotation.Nullable;

public interface CheckoutAddressFormData {
    Address toShippingAddress();

    @Nullable Address toBillingAddress();
}
