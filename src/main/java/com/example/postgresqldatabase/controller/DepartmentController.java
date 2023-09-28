package com.example.postgresqldatabase.controller;


import com.example.postgresqldatabase.model.Department;
import com.example.postgresqldatabase.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartments() {

        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long department_id) {
        return departmentService.getDepartmentById(department_id);
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long department_id, @RequestBody Department department) {
        return departmentService.updateDepartment(department_id, department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long department_id) {

        departmentService.deleteDepartment(department_id);
    }
}
