package com.example.h2database.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String fullName;


    private Double salary;


}
