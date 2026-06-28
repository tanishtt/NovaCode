package dev.tanishmohanta.NovaCode.entity;


import dev.tanishmohanta.NovaCode.enums.PreviewStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Table(name = "previews")
public class Preview {
    private Long id;

    private Project project;

    private String namespace;

    private String podName;

    private String previewUrl;

    private PreviewStatus status;

    private Instant startedAt;

    private Instant terminatedAt;

    private Instant createdAt;
}
