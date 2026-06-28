package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.auth.UserProfileResponse;
import dev.tanishmohanta.NovaCode.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
