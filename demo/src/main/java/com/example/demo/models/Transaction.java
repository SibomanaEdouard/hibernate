//package com.example.demo.models;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//@Entity
//@Table(name = "transactions")
//public class Transaction {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private UUID id;
//
//    @ManyToOne
//    @JoinColumn(name = "company_id", referencedColumnName = "id")
//    private Company company;
//
//    @Column(name = "user_id")
//    private String userId;
//
//    @Column(name = "date")
//    private LocalDateTime date;
//
//
//    //this is for the  default date
//    @PrePersist
//    public void prePersist() {
//        // Set the default value for date if not already set
//        if (this.date == null) {
//            this.date = LocalDateTime.now();
//        }
//    }
//
//    //getters and setters
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
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
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
//    //constructors
//
//
//    public Transaction( Company company, String userId) {
////        this.id = id;
//        this.company = company;
//        this.userId = userId;
////        this.date = date;
//    }
//}
