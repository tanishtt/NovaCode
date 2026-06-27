package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.usage.PlanLimitsResponse;
import dev.tanishmohanta.NovaCode.dto.usage.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

     PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);

}
