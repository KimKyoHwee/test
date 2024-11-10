package com.example.shinhan.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "LostDataBackup")
@Getter
@Setter
public class LostDataBackup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long backupId;

    @ManyToOne
    @JoinColumn(name = "kioskId", nullable = false)
    private Kiosk kiosk;

    @Lob
    private String transactionData;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    private boolean isRecovered;


    public boolean isRecovered() {
        return isRecovered;
    }
}
