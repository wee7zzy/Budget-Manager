package com.app.budgetmanager.respository;

import com.app.budgetmanager.Enitiy.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categorie, Long> {
    boolean existsByName(String name);
}