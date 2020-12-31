package com.seohan.auth.Repository;

import com.seohan.auth.Domain.InAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InAccountRepository extends JpaRepository<InAccount, String> {

	Optional<InAccount> findByAccountId(String asabn);

	Page<InAccount> findByKname(String name, Pageable pageable);

}
