package com.rohithdev.TikiHutInventory.services;

import com.rohithdev.TikiHutInventory.dtos.Response;
import com.rohithdev.TikiHutInventory.dtos.TransactionRequest;
import com.rohithdev.TikiHutInventory.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}

