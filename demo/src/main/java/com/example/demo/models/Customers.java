package com.example.demo.models;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "customers")
public class Customers {
    @UUID
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  UUID id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "companyName")
    private String companyName;

    @Embedded
    Contacts contacts;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
}
