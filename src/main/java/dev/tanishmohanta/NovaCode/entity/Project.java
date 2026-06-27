package dev.tanishmohanta.NovaCode.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
public class Project {
    private Long id;
    private String name;
    private User user;
    private Boolean isPublic=false;

    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private Instant deletedAt;
}
