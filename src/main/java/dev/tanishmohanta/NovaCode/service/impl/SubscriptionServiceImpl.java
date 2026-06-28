package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.subscription.CheckoutRequest;
import dev.tanishmohanta.NovaCode.dto.subscription.CheckoutResponse;
import dev.tanishmohanta.NovaCode.dto.subscription.PortalResponse;
import dev.tanishmohanta.NovaCode.dto.subscription.SubscriptionResponse;
import dev.tanishmohanta.NovaCode.service.SubscriptionService;
import org.springframework.stereotype.Service;


@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
