package tech.jhipster.lite.generator.project.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.generator.project.domain.Project;
import tech.jhipster.lite.generator.project.domain.ProjectRepository;
import tech.jhipster.lite.generator.project.domain.ProjectService;
import tech.jhipster.lite.generator.project.infrastructure.primary.dto.ProjectDTO;

@Service
public class ProjectApplicationService {

  private final ProjectRepository projectRepository;
  private final ProjectService projectService;

  public ProjectApplicationService(ProjectRepository projectRepository, ProjectService projectService) {
    this.projectRepository = projectRepository;
    this.projectService = projectService;
  }

  public byte[] download(Project project) {
    return projectRepository.download(project);
  }

  public ProjectDTO getProjectDetails(String folderPath) {
    return projectService.getProjectDetails(folderPath);
  }
}
