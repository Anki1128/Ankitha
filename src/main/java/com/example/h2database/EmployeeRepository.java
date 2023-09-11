package com.example.h2database;


import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee findEmployeeById(Integer id);
}