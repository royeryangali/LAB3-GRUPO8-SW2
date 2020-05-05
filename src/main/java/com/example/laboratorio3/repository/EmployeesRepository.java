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
    @Query(value ="SELECT * FROM employees e WHERE e.salary >15000",nativeQuery = true)
    List <EmployeeDto> obtenerempleadosSueldoMayor();

}
