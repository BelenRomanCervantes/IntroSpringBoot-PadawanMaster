package com.spring.empleados.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    //Se conecta con EmployeeRepository
    @Autowired
    private EmployeeRepository repository;

    //Registrar un nuevo empleado
    @Override
    public EmployeeEntity crearEmpleado(@RequestBody EmployeeEntity newEmployee){
        return repository.save(newEmployee);
    }

    //Listar a todos los empleados registrados
    @Override
    public List<EmployeeEntity> listado() {
        List<EmployeeEntity> listado = repository.findAll();
        return listado;
    }

}
