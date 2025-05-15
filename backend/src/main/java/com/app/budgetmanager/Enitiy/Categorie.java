package com.app.budgetmanager.Enitiy;


import jakarta.persistence.*;

@Entity
public class Categorie {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  int id;


}
