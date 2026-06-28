package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.project.ProjectRequest;
import dev.tanishmohanta.NovaCode.dto.project.ProjectResponse;
import dev.tanishmohanta.NovaCode.dto.project.ProjectSummaryResponse;
import dev.tanishmohanta.NovaCode.entity.Project;
import dev.tanishmohanta.NovaCode.entity.User;
import dev.tanishmohanta.NovaCode.repository.ProjectRepository;
import dev.tanishmohanta.NovaCode.repository.UserRepository;
import dev.tanishmohanta.NovaCode.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        Project project=Project.builder()
                .name(request.name())
                .user(owner)
                .build();

        projectRepository.save(project);

        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDeleteProject(Long id, Long userId) {

    }
}
