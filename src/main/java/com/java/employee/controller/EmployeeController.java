package com.java.employee.controller;

import com.java.employee.model.Employee;
import com.java.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        return employee;
    }

}
