package com.app.budgetmanager.Enitiy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String description;
    private Double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
