package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name="jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private int job_history_id;

    public int getJob_history_id() {
        return job_history_id;
    }

    public void setJob_history_id(int job_history_id) {
        this.job_history_id = job_history_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Integer getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Integer min_salary) {
        this.min_salary = min_salary;
    }

    public Integer getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Integer max_salary) {
        this.max_salary = max_salary;
    }

    @Column(nullable = false)
    private String job_title;
    private Integer min_salary;
    private Integer max_salary;
}
