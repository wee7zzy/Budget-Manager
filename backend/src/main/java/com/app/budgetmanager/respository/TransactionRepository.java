package com.app.budgetmanager.respository;

import com.app.budgetmanager.Enitiy.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
