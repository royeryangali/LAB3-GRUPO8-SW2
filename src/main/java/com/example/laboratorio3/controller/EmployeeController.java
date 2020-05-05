package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

    //COMPLETAR
    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = {"", "/"})
    public String listaEmployee(   ){
        //COMPLETAR
        return "employee/lista";
    }

    @GetMapping("/new")
    public String nuevoEmployeeForm( ) {
        //COMPLETAR
        return "employee/newFrm";
    }

    @PostMapping("/save")
    public String guardarEmployee(Employees employee, RedirectAttributes attr) {
        //COMPLETAR
        if (employee.getId() == 0) {
            attr.addFlashAttribute("msg", "Empleado creado exitosamente");
        } else {
            attr.addFlashAttribute("msg", "Empleado actualizado exitosamente");
        }
        employeesRepository.save(employee);
        return "redirect:/Employee";
    }

    @GetMapping("/edit")
    public String editarEmployee(Model model, @RequestParam("id") int id) {
        //COMPLETAR
        Optional<Employees> optEmployees = employeesRepository.findById(id);

        if (optEmployees.isPresent()) {
            Employees employee = optEmployees.get();
            model.addAttribute("employee", employee);
            model.addAttribute("listaEmpleados", employeesRepository.findAll());
            model.addAttribute("listaJobs",supplierRepository.findAll());
            model.addAttribute("listaDepartments",supplierRepository.findAll());
            model.addAttribute("listaLocations",supplierRepository.findAll());
            return "employee/editFrm";
        } else {
            return "redirect:/Employee";
        }
    }

    @GetMapping("/delete")
    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
