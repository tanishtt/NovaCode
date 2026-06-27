package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.subscription.CheckoutRequest;
import dev.tanishmohanta.NovaCode.dto.subscription.CheckoutResponse;
import dev.tanishmohanta.NovaCode.dto.subscription.PortalResponse;
import dev.tanishmohanta.NovaCode.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
     SubscriptionResponse getCurrentSubscription(Long userId);

     CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

     PortalResponse openCustomerPortal(Long userId);
}
