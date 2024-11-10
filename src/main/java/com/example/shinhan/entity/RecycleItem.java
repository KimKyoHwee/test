package com.example.shinhan.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "RecycleItem")
public class RecycleItem implements Serializable {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recycleItemId;

    private String itemName;
    private double pricePerKg;

}
