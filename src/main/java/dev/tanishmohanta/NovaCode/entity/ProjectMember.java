package dev.tanishmohanta.NovaCode.entity;

import dev.tanishmohanta.NovaCode.enums.ProjectRole;
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
//@Table(name = "project_members")
public class ProjectMember {
    private ProjectMemberId id;

    private Project project;

    private User user;

    private ProjectRole projectRole;

    private Instant invitedAt;

    private Instant acceptedAt;

}
