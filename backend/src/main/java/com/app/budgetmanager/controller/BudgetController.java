package com.app.budgetmanager.controller;


import com.app.budgetmanager.Enitiy.Budget;
import com.app.budgetmanager.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budget")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;


    @GetMapping("/list")
    public List<Budget> getBudgetList() {
        return budgetService.GetAllBudget();
    }


    @PostMapping("/ajouter")
    public Budget ajoutBudget(@RequestBody Budget budget) {
        return budgetService.AddBudget(budget);

    }

    @PutMapping("/update")
    public Budget updateBudget(@RequestBody Budget budget) {
        return budgetService.UpdateBudget(budget);
    }


    @DeleteMapping
    public void deleteBudget(@PathVariable int id) {
        budgetService.DeleteBudgetById(id);
    }

}