package com.app.budgetmanager.service;

import com.app.budgetmanager.Enitiy.Budget;
import com.app.budgetmanager.respository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public Budget AddBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> GetAllBudget() {
        return budgetRepository.findAll();
    }

    public Budget GetBudgetById(int id) {
        return budgetRepository.getReferenceById(id);
    }


    public Budget UpdateBudget(Budget budget) {
        if (budgetRepository.existsById(budget.getId())) {
            return budgetRepository.save(budget);

        }
        return null;
    }


    public void DeleteBudgetById(int id) {
        budgetRepository.deleteById(id);
    }


}
