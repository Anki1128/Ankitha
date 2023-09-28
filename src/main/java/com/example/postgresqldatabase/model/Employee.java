package com.example.postgresqldatabase.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name  = "first_name")
    private String first_name;

    @JoinColumn(name = "last_name")
    private String last_name;

    @JoinColumn(name = "salary")
    private Long salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department_id;

}