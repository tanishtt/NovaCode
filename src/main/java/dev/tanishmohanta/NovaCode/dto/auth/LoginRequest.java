package dev.tanishmohanta.NovaCode.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
