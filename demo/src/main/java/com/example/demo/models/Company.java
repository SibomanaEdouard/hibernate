package com.example.demo.models;


import jakarta.persistence.*;
import java.util.UUID;
import jakarta.persistence.CascadeType;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "companyName")
    private String company_name;

    @Column(name = "CompanyPhone")
    private String company_phone;

    @Column(name = "companyEmail")
    private String company_email;

    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Employee> employees;


    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Producers> producers;

    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Transaction> transactions;

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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Company(String company_name, String company_phone, String company_email) {
//        , List<Employee> employees, List<Producers> producers
        this.company_name = company_name;
        this.company_phone = company_phone;
        this.company_email = company_email;
//        this.employees = employees;
//        this.producers = producers;
    }
    public Company( ) {
//default constructor
    }
}
