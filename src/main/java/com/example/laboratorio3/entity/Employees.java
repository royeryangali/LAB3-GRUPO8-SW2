package com.example.laboratorio3.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employee_id;
    @Column(nullable = false)

    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String phone_number;
    private String hire_date;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs jobs;
    private BigDecimal salary;
    private String commission_pct;
    @ManyToOne
    @JoinColumn(name="Manager_id")
    private Employees manager;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Departments departments;
    private int enabled;



}
