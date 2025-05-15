package com.app.budgetmanager.service;

import com.app.budgetmanager.Enitiy.Categorie;


import java.util.List;

public interface CategorieService {
    Categorie createCategory(Categorie category);
    List<Categorie> getAllCategories();
    Categorie updateCategory(Long id, Categorie category);
    void deleteCategory(Long id);
}
