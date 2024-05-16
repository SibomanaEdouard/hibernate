package com.example.demo.models;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Embedded
    Contacts contacts;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
    @Column(name = "salary")
    private double salary;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompanyId(Company company) {
        this.company = company;
    }


    public Employee(Contacts contacts, Company company, double salary) {
        this.contacts = contacts;
        this.company = company;
        this.salary = salary;

    }

    public Employee() {
    }
}
