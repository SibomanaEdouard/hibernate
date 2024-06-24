//package com.example.demo.models;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import org.hibernate.validator.constraints.UUID;
//
//@Embeddable
//public class Contacts {
//    @Column(name = "firstname")
//    private String firstname;
//    @Column(name = "lastname")
//    private String lastname;
//    @Column(name = "email",unique = true)
//    private String email;
//    @Column(name = "phone",unique = true)
//    private String phone;
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public Contacts(String firstname, String lastname, String email, String phone) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.email = email;
//        this.phone = phone;
//    }
//    public Contacts() {
//        // Default constructor
//    }
//}
