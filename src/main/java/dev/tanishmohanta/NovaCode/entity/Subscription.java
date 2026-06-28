package dev.tanishmohanta.NovaCode.entity;

import dev.tanishmohanta.NovaCode.enums.SubscriptionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Table(name = "subscriptions")
public class Subscription {
    private Long id;

    private User user;

    private Plan plan;

    private String stripeCustomerId;

    private String stripeSubscriptionId;

    private SubscriptionStatus status;

    private Instant currentPeriodStart;

    private Instant currentPeriodEnd;

    private Boolean cancelAtPeriodEnd;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;
}
