package de.mola.seif.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Propertie {
    @Id
    private long id;

    private String propertieName;


}
