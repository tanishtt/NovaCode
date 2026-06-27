package dev.tanishmohanta.NovaCode.dto.usage;

public record PlanLimitsResponse(
      String planName,
      int maxTokensPerDay,
      int maxProjects,
      boolean unlimitedAccess
) {
}
