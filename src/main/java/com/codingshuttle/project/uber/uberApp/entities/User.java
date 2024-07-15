package com.codingshuttle.project.uber.uberApp.entities;

import com.codingshuttle.project.uber.uberApp.enums.Role;
import jakarta.persistence.*;

import java.lang.annotation.Target;
import java.util.Set;

@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
