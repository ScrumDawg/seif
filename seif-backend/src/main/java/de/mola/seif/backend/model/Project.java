package de.mola.seif.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Project name is required")
    private String name;
    @NotBlank(message = "Project key is required")
    @Size(min = 2, max = 8, message = "Key needs at least 2 up to 8 characters")
    @Column(unique = true)
    private String key;
    @NotBlank(message = "Project description is required")
    private String description;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private Set<Ticket> tickets;

    private LocalDateTime createdDate;

    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDateTime.now();
    }



}
