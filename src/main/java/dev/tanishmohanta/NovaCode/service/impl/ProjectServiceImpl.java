package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.project.ProjectRequest;
import dev.tanishmohanta.NovaCode.dto.project.ProjectResponse;
import dev.tanishmohanta.NovaCode.dto.project.ProjectSummaryResponse;
import dev.tanishmohanta.NovaCode.entity.Project;
import dev.tanishmohanta.NovaCode.entity.User;
import dev.tanishmohanta.NovaCode.mapper.ProjectMapper;
import dev.tanishmohanta.NovaCode.repository.ProjectRepository;
import dev.tanishmohanta.NovaCode.repository.UserRepository;
import dev.tanishmohanta.NovaCode.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private final ProjectMapper projectMapper;

    @Override
    //get all the projects user is owner of and all the projects which user is member.
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

        return projectRepository.findAllAccessibleProjectsByUser(userId)
                .stream()
                .map(projectMapper::toProjectSummaryResponse)
                .toList();
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
                .owner(owner)
                .isPublic(false)
                .build();

        project= projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDeleteProject(Long id, Long userId) {

    }
}
