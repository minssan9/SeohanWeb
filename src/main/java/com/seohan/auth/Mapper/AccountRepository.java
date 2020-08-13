package com.seohan.auth.Mapper;

import com.seohan.auth.Domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
		@Query(value="SELECT * FROM tprlib.gr_insa a where a.co_gb=:companyCode and a.asabn= :asabn",
			nativeQuery=true)
    Optional<Account> findByAsabnAndCo_gb(@Param("accountId") String accountId, @Param("companyCode") String companyCode);

	Optional<Account> findByAccountId(String accountId);
		 
}
 