package com.example.laboratorio3.repository;


import com.example.laboratorio3.dto.EmployeeDto;
import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

//COMPLETAR
    @Query(value ="SELECT e.first_name, e.last_name, e.hire_date,j.job_title FROM employees e INNER JOIN jobs j on (e.job_id=j.job_id) INNER JOIN departments d on (e.department_id=d.department_id)\n" +
            "WHERE e.salary >15000",nativeQuery = true)
    List <EmployeeDto> obtenerempleadosSueldoMayor();

    @Query("SELECT e.first_name, e.last_name, e.hire_date,j.job_title FROM employees e INNER JOIN jobs j on (e.job_id=j.job_id) INNER JOIN departments d on (e.department_id=d.department_id)

    ORDER BY e.salary GROUP BY d.department_id", nativeQuery=tru)
}
