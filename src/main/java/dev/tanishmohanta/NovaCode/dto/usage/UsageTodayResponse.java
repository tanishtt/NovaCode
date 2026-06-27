package dev.tanishmohanta.NovaCode.dto.usage;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
