package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name="departments")
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private int employee_id;
    @Column(nullable = false)

    private String department_name;
    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employees Manager;

    @ManyToOne
    @JoinColumn(name="manager_id")
    private Locations locations;


}
