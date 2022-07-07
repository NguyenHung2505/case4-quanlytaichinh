package com.example.keymodum4.repository;

import com.example.keymodum4.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction , Long> {
}
