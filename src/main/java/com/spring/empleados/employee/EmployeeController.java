package com.spring.empleados.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/empleados")
public class EmployeeController {

    //Se conecta con el archivo EmployeeService
    @Autowired
    private EmployeeService service;

    //Se conecta con el archivo de EmployeeRepository
    @Autowired
    private EmployeeRepository repository;

    //Registrar de un nuevo empleado
    @PostMapping("/nuevo-empleado")
    public EmployeeEntity nuevoEmpleado(@RequestBody EmployeeEntity newEmployee){
        return service.crearEmpleado(newEmployee);
    }

    //Listar a todos los empleados registrados
    @GetMapping("/lista-empleados")
    public List<EmployeeEntity> listado() {
        return repository.findAll();
    }
}
