package com.example.h2database.service;


import com.example.h2database.model.Employee;
import com.example.h2database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {

        employeeRepository.save(employee);

    }

    public Employee findEmployeeById(Integer id) {


        return null;
    }
}
