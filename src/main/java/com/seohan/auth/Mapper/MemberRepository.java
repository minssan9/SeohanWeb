package com.seohan.auth.Mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.auth.Domain.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
		@Query(value="SELECT * FROM tprlib.gr_insa a where a.co_gb=:companyCode and a.asabn= :asabn",
			nativeQuery=true)
    Optional<Member> findByAsabnAndCo_gb(@Param("asabn") String asabn, @Param("companyCode") String companyCode);

	Optional<Member> findByAsabn(String asabn);
		 
}
 