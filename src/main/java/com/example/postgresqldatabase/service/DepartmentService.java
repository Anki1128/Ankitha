package com.example.postgresqldatabase.service;


import com.example.postgresqldatabase.model.Department;
import com.example.postgresqldatabase.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {

        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Long department_id) {

        return departmentRepository.findById(department_id);
    }

    public Department addDepartment(Department department) {

        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long department_id, Department updatedDepartment) {
        if (departmentRepository.existsById(department_id)) {
            updatedDepartment.setDepartment_id(department_id);
            return departmentRepository.save(updatedDepartment);
        }
        return null;

    }

    public void deleteDepartment(Long department_id) {

        departmentRepository.deleteById(department_id);
    }
}
