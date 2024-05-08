package com.example.demo.models;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @UUID
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "companyName")
    private String company_name;

    @Column(name = "CompanyPhone")
    private String company_phone;

    @Column(name = "companyEmail")
    private String company_email;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;


    @OneToMany(mappedBy = "company")
    private List<Producers> producers;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Producers> getProducers() {
        return producers;
    }

    public void setProducers(List<Producers> producers) {
        this.producers = producers;
    }
}
