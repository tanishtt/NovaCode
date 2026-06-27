package dev.tanishmohanta.NovaCode.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
public class User {
    private Long id;
    private String email;
    private String passwordHash;
    private String name;
    private String avatarUrl;
    private String provider;
    private String providerId;
    private Boolean emailVerified;
    private String stripeCustomerId;

    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private Instant deletedAt;
}
