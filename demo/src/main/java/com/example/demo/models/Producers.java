//package com.example.demo.models;
//
//import jakarta.persistence.*;
//import java.util.UUID;
//
//import java.util.List;
//
//@Entity
//@Table(name = "producers")
//public class Producers {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private UUID id;
//
//    @Embedded
//    Contacts contacts;
//
//
//
//
//    @OneToMany(mappedBy = "producer" ,cascade = CascadeType.ALL)
//    private List<Products> products;
//
//
//
//    @ManyToOne
//    @JoinColumn(name = "company_id")
//    private Company company;
//
//
//
//
//
//    public List<Products> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Products> products) {
//        this.products = products;
//    }
//
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public Contacts getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(Contacts contacts) {
//        this.contacts = contacts;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }
//
//    public Producers( Contacts contacts, Company company) {
//        this.contacts = contacts;
//        this.company = company;
//    }
//
//    public Producers(){
//        //this is default constructors
//    }
//}
