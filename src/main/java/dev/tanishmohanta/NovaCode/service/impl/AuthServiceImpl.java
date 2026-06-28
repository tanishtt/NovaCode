package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.auth.AuthResponse;
import dev.tanishmohanta.NovaCode.dto.auth.LoginRequest;
import dev.tanishmohanta.NovaCode.dto.auth.SignupRequest;
import dev.tanishmohanta.NovaCode.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
