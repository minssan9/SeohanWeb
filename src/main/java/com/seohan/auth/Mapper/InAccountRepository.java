//package com.seohan.auth.Mapper;
//
//import com.seohan.auth.Domain.InAccount;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.seohan.auth.Domain.Account;
//
//import java.util.Optional;
//
//@Repository
//public interface InAccountRepository extends JpaRepository<Account, String> {
//		@Query(value="SELECT * FROM tprlib.gr_insa a where a.co_gb=:companyCode and a.asabn= :asabn",
//			nativeQuery=true)
//    Optional<Ａｃｃｏｕｎｔ> findByAsabnAndCo_gb(@Param("asabn") String asabn, @Param("companyCode") String companyCode);
//
//
//	Page<Ａｃｃｏｕｎｔ> findByAccountId(String accountId, Pageable pageable);
//	Page<Ａｃｃｏｕｎｔ> findByName(String name, Pageable pageable);
//
//	Optional<Ａｃｃｏｕｎｔ> findByAccountId(String asabn);
//
//}
//