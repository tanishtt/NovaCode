package dev.tanishmohanta.NovaCode.dto.subscription;

public record PlanResponse(
        Long id,
         String name,
         Integer maxProjects,
         Integer maxTokensPerDay,
         Boolean unlimitedAccess,
        String price
) {
}
