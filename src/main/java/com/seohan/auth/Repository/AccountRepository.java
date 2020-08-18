//package com.seohan.auth.Repository;
//
//import com.seohan.auth.Dto.Account;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface AccountRepository extends JpaRepository<Account, String> {
//		@Query(value="SELECT * FROM TSILIB.EMP_MST a where a.rco_gb=:companyCode and a.asabn= :accountId",
//			nativeQuery=true)
//    Optional<Account> findByAsabnAndCo_gb(@Param("accountId") String accountId, @Param("companyCode") String companyCode);
//
//	@Override
//	List<Account> findAll();
//
//	@Query(value="select a.*, b.roles from TSILIB.EMP_MST a left outer join TSILIB.EMP_MST_ROLES b on a.asabn=b.asabn " +
//				" where a.asabn= :accountId", nativeQuery=true)
//	Optional<Account> findByAccountIdWithRoles(String accountId);
//
//	Optional<Account> findByAccountId(String accountid);
//}
//