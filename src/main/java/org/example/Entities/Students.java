package org.example.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter

@Entity

@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;
    @Column(name = "School")
    private String school;
    @Column(name = "email")
    private String email;
    @Column(name = "student_id")
    private int studentId;

}
