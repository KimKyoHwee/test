package com.example.shinhan.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "RecycleTransactionItem")
public class RecycleTransactionItem implements Serializable {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "transactionId", nullable = false)
    private RecycleTransaction transaction;

    @ManyToOne
    @JoinColumn(name = "recycleItemId", nullable = false)
    private RecycleItem recycleItem;

    private double weight;
    private int points;

}
