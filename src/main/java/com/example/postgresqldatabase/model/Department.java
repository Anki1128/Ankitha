package com.example.postgresqldatabase.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;

    @Column(name = "department_name")
    private String department_Name;


}

