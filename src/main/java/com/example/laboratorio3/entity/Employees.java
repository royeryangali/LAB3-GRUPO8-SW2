package com.example.laboratorio3.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int id;
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private String email;
    private String password;
    private String phone_number;
    private Date hire_date;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs jobs;
    @Column(nullable = false)
    private BigDecimal salary;
    private BigDecimal commission_pct;
    @OneToMany
    @JoinColumn(name="employee_id")
    private Employees employees;
    @OneToMany
    @JoinColumn(name="department_id")
    private Departments departments;
    private int enable;


           //COMPLETAR
}
