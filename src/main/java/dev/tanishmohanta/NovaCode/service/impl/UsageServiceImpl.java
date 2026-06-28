package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.auth.UserProfileResponse;
import dev.tanishmohanta.NovaCode.dto.usage.PlanLimitsResponse;
import dev.tanishmohanta.NovaCode.dto.usage.UsageTodayResponse;
import dev.tanishmohanta.NovaCode.service.UsageService;
import dev.tanishmohanta.NovaCode.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
