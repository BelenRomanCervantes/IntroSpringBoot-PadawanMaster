package com.spring.empleados.employee;

import jakarta.persistence.*;

import java.time.LocalDate;

/*
Aquí metemos todos los atributos del objeto Employee.
Contiene la información de la tabla Empleado de la base de datos
*/

@Entity
@Table(name= "empleado")//Nombre que se verá en la base de datos
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String lastname;

    @Column(nullable = false,unique = true)
    private String email;


    private String job;

    @Column(nullable = false, unique = true, length = 4)
    private int employeeNumber;

    private LocalDate dateOfAdmission;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name, String lastname, String email, String job, int employeeNumber, LocalDate dateOfAdmission) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.job = job;
        this.employeeNumber = employeeNumber;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
