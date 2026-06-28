package dev.tanishmohanta.NovaCode.dto.usage;

public record PlanLimitsResponse(
      String planName,
      Integer maxTokensPerDay,
      Integer maxProjects,
      Boolean unlimitedAccess
) {
}
