package com.example.laboratorio3.controller;


import com.example.laboratorio3.repository.DepartmentsRepository;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobsRepository;
import com.example.laboratorio3.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//COMPLETAR
@Controller
@RequestMapping("/History")
public class HistoryController {
//COMPLETAR
@Autowired
EmployeesRepository employeesRepository;
    @Autowired
    JobsRepository jobsRepository;
    @Autowired
    DepartmentsRepository departmentsRepository;
    @Autowired
    LocationsRepository locationsRepository;

    @GetMapping(value = {"", "/"})
    public String listaHistory( Model model  ){
        //COMPLETAR
        model.addAttribute("listaEmployees", employeesRepository.findAll());
        return "employee/lista";
    }

}
