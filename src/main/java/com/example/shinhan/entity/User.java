package com.example.shinhan.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "User")
public class User implements Serializable {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private int totalPoints;
    private int dailyPoints;
    private int monthlyPoints;

}
