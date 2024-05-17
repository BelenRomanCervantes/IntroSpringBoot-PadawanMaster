package com.spring.empleados.employee;

import org.springframework.data.jpa.repository.JpaRepository;

//Este archivo crea una conexión entre EmployeeEntity y la base de datos
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
