package com.app.budgetmanager.DTO;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TransactionDTO {
    private double montant;
    private long categorieId;
    private LocalDateTime date;
    private String description;
}