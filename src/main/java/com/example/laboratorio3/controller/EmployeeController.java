package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.DepartmentsRepository;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobsRepository;
import com.example.laboratorio3.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

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
    public String listaEmployee( Model model  ){
        //COMPLETAR
        model.addAttribute("listaEmployees", employeesRepository.findAll());
        //////USANDO DTO//////////////////////////
        List<EmpleadosRegionDto> lista = categoryRepository.obtenerEmpleadosPorRegion();
        ////LUEGO YA LO PODEMOS ENVIAR A LA VISTA////
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
            model.addAttribute("listaJobs",jobsRepository.findAll());
            model.addAttribute("listaDepartments",departmentsRepository.findAll());
            model.addAttribute("listaLocations",locationsRepository.findAll());
            return "employee/editFrm";
        } else {
            return "redirect:/Employee";
        }
    }

    @GetMapping("/delete")
    public String borrarEmpleado(Model model,
                                 @RequestParam("id") int id,
                                 RedirectAttributes attr) {

       //COMPLETAR
        Optional<Employees> optEmployees = employeesRepository.findById(id);

        if (optEmployees.isPresent()) {
            employeesRepository.deleteById(id);
            attr.addFlashAttribute("msg","Empleado borrado exitosamente");
        }
        return "redirect:/Employee";
    }

    //COMPLETAR

}
