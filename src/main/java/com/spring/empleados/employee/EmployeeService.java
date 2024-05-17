package com.spring.empleados.employee;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeService {

    //Registrar un nuevo empleado
    EmployeeEntity crearEmpleado(@RequestBody EmployeeEntity newEmployee);

    //Listar a todos los empleados registrados
    List<EmployeeEntity> listado();
}
