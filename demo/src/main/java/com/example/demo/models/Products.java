package com.example.demo.models;


import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "producer_id" ,referencedColumnName = "id") //this is the foreign key to relate product and its producer

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

    public Products( String name, Producers producer) {
        this.name = name;
        this.producer = producer;
    }
}
