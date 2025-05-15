package com.app.budgetmanager.respository;

import com.app.budgetmanager.Enitiy.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository  extends JpaRepository<Budget, Integer> {
}
