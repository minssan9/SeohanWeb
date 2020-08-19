package com.seohan.erp.general.Mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.erp.general.Domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
		@Query(value="SELECT * FROM tprlib.gr_insa a where a.co_gb=:companyCode and a.asabn= :asabn",
			nativeQuery=true)
    User findByAsabnAndCo_gb(@Param("asabn") String asabn, @Param("companyCode") String companyCode);
	
	User findByAsabn(String asabn); 
		 
}
 