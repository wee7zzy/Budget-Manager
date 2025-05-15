package com.app.budgetmanager.controller;

import com.app.budgetmanager.Enitiy.Categorie;
import com.app.budgetmanager.service.CategorieService;
import com.app.budgetmanager.service.impl.CategorirserviceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CategorieController {
@Autowired
    private  CategorirserviceImpl categoryService;
    @PostMapping("/add")
    public ResponseEntity<Categorie> createCategory(@RequestBody Categorie category) {
        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    @GetMapping
    public ResponseEntity<List<Categorie>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

}
