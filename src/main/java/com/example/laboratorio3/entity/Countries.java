package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Countries {

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Regions getRegion() {
        return region;
    }

    public void setRegion(Regions region) {
        this.region = region;
    }

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
