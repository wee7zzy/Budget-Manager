package com.app.budgetmanager.Enitiy;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Budget {

    @Id
    private  int id;
    private double depenseLimit;
    private double montantDepense ;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie ;



}
