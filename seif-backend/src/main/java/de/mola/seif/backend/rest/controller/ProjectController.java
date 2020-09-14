package de.mola.seif.backend.rest.controller;

import de.mola.seif.backend.model.Project;
import de.mola.seif.backend.rest.dto.ProjectDTO;
import de.mola.seif.backend.rest.payload.request.CreateProjectRequest;
import de.mola.seif.backend.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("")
    public ResponseEntity<ProjectDTO> createProject(@Valid @RequestBody CreateProjectRequest requestBody){
        Project project = Project.builder()
                .name(requestBody.getName())
                .key(requestBody.getKey())
                .description(requestBody.getDescription())
                .build();
        ProjectDTO projectDTO = modelMapper.map(projectService.saveOrUpdateProject(project), ProjectDTO.class);
        return ResponseEntity.ok(projectDTO);
    }


    @GetMapping("/{projectId}")
    public ResponseEntity<ProjectDTO> getProjectById(@PathVariable Long projectId){
        Project projectById = projectService.findProjectById(projectId);
        ProjectDTO projectDTO = modelMapper.map(projectById, ProjectDTO.class);
        return ResponseEntity.ok(projectDTO);
    }




}
