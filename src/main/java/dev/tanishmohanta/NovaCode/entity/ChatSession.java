package dev.tanishmohanta.NovaCode.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
public class ChatSession {
    private Project project;
    private User user;

    private String title;

    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private Instant deletedAt;
}
