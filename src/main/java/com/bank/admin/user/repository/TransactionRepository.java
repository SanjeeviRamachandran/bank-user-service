package com.bank.admin.user.repository;

import com.bank.admin.user.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findBySourceAccountIdOrderByInitiationDate(long id);
}
