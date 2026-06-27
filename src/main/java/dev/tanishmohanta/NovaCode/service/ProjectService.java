package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.project.ProjectRequest;
import dev.tanishmohanta.NovaCode.dto.project.ProjectResponse;
import dev.tanishmohanta.NovaCode.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDeleteProject(Long id, Long userId);

}
