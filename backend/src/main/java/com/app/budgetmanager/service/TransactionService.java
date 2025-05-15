package com.app.budgetmanager.service;

import com.app.budgetmanager.DTO.TransactionDTO;
import com.app.budgetmanager.Enitiy.Transaction;
import com.app.budgetmanager.respository.CategorierRepository;
import com.app.budgetmanager.respository.TransactionRepository;
import com.app.budgetmanager.MAPPER.TransactionMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final CategorierRepository categorieRepository;
    private final TransactionMapper transactionMapper;

    public Transaction createTransaction(TransactionDTO dto) {
        Transaction transaction = transactionMapper.toEntity(dto);

        // Valider que la catégorie existe
        categorieRepository.findById(dto.getCategorieId())
                .orElseThrow(() -> new IllegalArgumentException("Catégorie non trouvée"));

        return transactionRepository.save(transaction);
    }
}
