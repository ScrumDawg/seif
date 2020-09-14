package de.mola.seif.backend.model;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn
    private User currentAssignee;

    @ManyToOne
    @JoinColumn
    private Project project;


}
