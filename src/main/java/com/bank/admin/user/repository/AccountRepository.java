package com.bank.admin.user.repository;

import com.bank.admin.user.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findBySortCodeAndAccountNumber(String sortCode, String accountNumber);
}
