package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country_id")
    private int country_id;
    @Column(nullable = false)

    private String country_name;
    @ManyToOne
    @JoinColumn(name="region_id")
    private Regions region;
}
