package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
