package com.seohan.auth.Repository;

import com.seohan.auth.Domain.ExtAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExtAccountRepository extends JpaRepository<ExtAccount, String> {
	Page<ExtAccount> findByAccountId(String accountId, Pageable pageable);
	Page<ExtAccount> findByName(String name, Pageable pageable);

	Optional<ExtAccount> findByAccountId(String asabn);

}
