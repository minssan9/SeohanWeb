package com.seohan.base.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.base.Domain.Code;
import com.seohan.base.Domain.OrgUser; 

@Repository
public interface OrgUserRepository extends JpaRepository<OrgUser, Long> {
	List<Code> findByCompanycode(String companycode);
}
