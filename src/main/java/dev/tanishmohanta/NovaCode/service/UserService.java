package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
