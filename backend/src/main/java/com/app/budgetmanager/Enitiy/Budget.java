package com.app.budgetmanager.Enitiy;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Budget {

    @Id
    private  int id;
    private double depenseLimit;
    private double montantDepense ;

    @OneToMany(mappedBy = "budget")
    private List<Transaction> transactions;


}
