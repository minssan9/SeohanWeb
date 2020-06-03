package com.seohan.mes.Mapper;

import com.seohan.mes.Domain.Trans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdPlanRepository extends JpaRepository<Trans, Long> {

}
