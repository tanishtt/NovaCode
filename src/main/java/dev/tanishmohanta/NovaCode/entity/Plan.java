package dev.tanishmohanta.NovaCode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter

//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Table(name = "plans")
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
