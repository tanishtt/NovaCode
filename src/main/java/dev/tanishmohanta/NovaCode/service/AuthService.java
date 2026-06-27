package dev.tanishmohanta.NovaCode.service;


import dev.tanishmohanta.NovaCode.dto.auth.AuthResponse;
import dev.tanishmohanta.NovaCode.dto.auth.LoginRequest;
import dev.tanishmohanta.NovaCode.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
