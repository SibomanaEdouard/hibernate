package org.example.Entities;

import jakarta.persistence.*;

import java.util.UUID;



@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue
    UUID

    private UUID id;
    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;
    @Column(name = "School")
    private String school;

}
