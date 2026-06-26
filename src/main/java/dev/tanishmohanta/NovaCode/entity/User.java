package dev.tanishmohanta.NovaCode.entity;

import java.time.Instant;

public class User {
    Long id;
    String email;
    String passwordHash;
    String name;
    String avatarUrl;
    String provider;
    String providerId;
    boolean emailVerified;
    String stripeCustomerId;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
