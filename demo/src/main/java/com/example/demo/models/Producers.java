package com.example.demo.models;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

@Entity
@Table(name = "producers")
public class Producers {
    @UUID
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Embedded
    Contacts contacts;


    @OneToMany(mappedBy = "producer")
    private List<Products> products;



    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;





    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }


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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
