package com.example.demo.models;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "products")
public class Products {
    @UUID
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "producer_id") // Assuming this is the foreign key column in the products table
    private Producers producer;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }
}
