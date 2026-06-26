package dev.tanishmohanta.NovaCode.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plan {
    private Long id;
    private String name;
    private String stripePriceId;
    private Integer maxProjects;
    private Integer maxTokensPerDay;
    private Integer maxPreviews;
    private Boolean unlimitedAccess;
    private Boolean active;
}
