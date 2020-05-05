package com.example.laboratorio3.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="job_history")
public class Job_history {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_history_id")
    private int job_history_id;
    @Column(nullable = false)

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employees employees;

    public int getJob_history_id() {
        return job_history_id;
    }

    public void setJob_history_id(int job_history_id) {
        this.job_history_id = job_history_id;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    private Date start_date;
    private Date end_date;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs job;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Departments department;






}
