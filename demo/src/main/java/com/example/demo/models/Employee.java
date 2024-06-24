package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "firstname",nullable = false)
    private String firstname;
    @Column(name = "lastname", nullable=false)
    private String lastname;
    @Column(nullable=false)
    private  String institution;
    @Column(nullable=false)
    private String position;

}
