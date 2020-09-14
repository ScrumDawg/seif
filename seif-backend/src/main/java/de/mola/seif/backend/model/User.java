package de.mola.seif.backend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String title;
    private String position;

    @OneToMany(mappedBy = "currentAssignee", cascade = CascadeType.ALL)
    private Set<Ticket> userTickets;


}
