package com.app.budgetmanager.MAPPER;

import com.app.budgetmanager.DTO.TransactionDTO;
import com.app.budgetmanager.Enitiy.Transaction;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

@Component

public interface TransactionMapper {

    Transaction toEntity(TransactionDTO dto);
}