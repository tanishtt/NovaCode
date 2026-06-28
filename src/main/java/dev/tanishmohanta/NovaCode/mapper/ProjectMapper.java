package dev.tanishmohanta.NovaCode.mapper;

import dev.tanishmohanta.NovaCode.dto.project.ProjectResponse;
import dev.tanishmohanta.NovaCode.dto.project.ProjectSummaryResponse;
import dev.tanishmohanta.NovaCode.entity.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);
    ProjectSummaryResponse toProjectSummaryResponse(Project project);
}
