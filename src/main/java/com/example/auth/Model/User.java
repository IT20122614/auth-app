package com.example.auth.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Table(name = "users")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true, length = 100, nullable = false)
    private String email;

    @ToString.Exclude
    @Column(nullable = false)
    private String password;


}
