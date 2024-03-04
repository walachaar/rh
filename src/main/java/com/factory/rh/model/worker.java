package com.factory.rh.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private String salary;

    public worker(String name, String phone, String address, String role, String salary) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.salary = salary;
    }

    public worker() {

    }
}
