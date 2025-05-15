package com.app.budgetmanager.controller;

import com.app.budgetmanager.DTO.TransactionDTO;
import com.app.budgetmanager.Enitiy.Transaction;
import com.app.budgetmanager.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody TransactionDTO dto) {
        return transactionService.createTransaction(dto);
    }
}
