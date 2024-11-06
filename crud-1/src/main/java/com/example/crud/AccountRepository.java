package com.example.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}