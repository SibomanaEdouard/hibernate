package com.example.demo.Repositories;

import com.example.demo.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository <Transaction, UUID> {
}
