package dev.tanishmohanta.NovaCode.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UsageLog {
    private Long id;
    private User user;
    private Project project;

    private String action;
    private Integer tokenUsed;
    private Integer durationMs;
    private String metaData;//json of metadata like model_used, prompt_used

    private Instant createdAt;

}
