package com.example.h2database.controller;

import com.example.h2database.model.Employee;
import com.example.h2database.repository.EmployeeRepository;
import com.example.h2database.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class DemoController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
        return "Add new employee to repo!";
    }

    @GetMapping("/find/{id}")
    public Employee findEmployeeById(@PathVariable Integer id) {
        return employeeService.findEmployeeById(id);
    }

    @PutMapping("/find/{id}")
    public Employee editEmployeeById(@PathVariable Integer id) {
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping("/find/{id}")
    public Employee deleteEmployeeById(@PathVariable Integer id) {
        return employeeService.findEmployeeById(id);
    }


}