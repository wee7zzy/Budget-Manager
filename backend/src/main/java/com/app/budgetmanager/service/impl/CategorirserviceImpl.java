package com.app.budgetmanager.service.impl;

import com.app.budgetmanager.Enitiy.Categorie;
import com.app.budgetmanager.respository.CategoryRepository;
import com.app.budgetmanager.service.CategorieService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategorirserviceImpl implements CategorieService {

    private final CategoryRepository categoryRepository;

    public CategorirserviceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Categorie createCategory(Categorie category) {
        if (categoryRepository.existsByName(category.getName())) {
            throw new IllegalArgumentException("Category with name '" + category.getName() + "' already exists.");
        }
        return categoryRepository.save(category);
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Categorie updateCategory(Long id, Categorie category) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }


}

