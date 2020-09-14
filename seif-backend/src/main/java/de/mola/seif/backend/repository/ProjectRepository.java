package de.mola.seif.backend.repository;

import de.mola.seif.backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Optional<Project> findById(Long id);
}
