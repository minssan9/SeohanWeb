package com.seohan.general.Mapper;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seohan.general.Domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUserName(String username);
}
 