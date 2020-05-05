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

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Employees getManager() {
        return Manager;
    }

    public void setManager(Employees manager) {
        Manager = manager;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    @ManyToOne
    @JoinColumn(name="manager_id")
    private Locations locations;


}
