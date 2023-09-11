package com.example.h2database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public String addEmployee(@RequestParam String name) {
        Employee employee = new Employee();
        employee.setName(name);
        employeeRepository.save(employee);
        return "Add new employee to repo!";
    }

    @GetMapping("/find/{id}")
    public Employee findEmployeeById(@PathVariable Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    @PutMapping("/find/{id}")
    public Employee editEmployeeById(@PathVariable Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    @DeleteMapping("/find/{id}")
    public Employee deleteEmployeeById(@PathVariable Integer id) {
        return employeeRepository.findEmployeeById(id);
    }


}