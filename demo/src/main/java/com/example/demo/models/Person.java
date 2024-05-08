package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    public Person(String firstname, String lastname, String email) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id")
    private long id ;

    @Column(name = "firstname")
    private  String firstname;
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private  String email;



}
