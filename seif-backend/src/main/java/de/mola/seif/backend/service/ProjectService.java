package de.mola.seif.backend.service;

import de.mola.seif.backend.exception.ResourceNotFoundException;
import de.mola.seif.backend.model.Project;
import de.mola.seif.backend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository  = projectRepository;
    }

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }

    public Project findProjectById(Long id){
        return projectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Couldnt find any Project for id: %d", id)));
    }

}
