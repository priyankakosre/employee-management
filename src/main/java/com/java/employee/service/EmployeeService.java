package com.java.employee.service;

import com.java.employee.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    public Employee createEmployee (Employee employee){
        Employee updatedEmployee = updateEmployeeDetails(employee);
        return updatedEmployee;
    }


    private Employee updateEmployeeDetails(Employee employee) {
        employee.setName(employee.getName().toUpperCase());
        employee.setId(employee.getId() + 100);
        employee.setSalary(employee.getSalary() + 20000);
        return employee;
    }

}
