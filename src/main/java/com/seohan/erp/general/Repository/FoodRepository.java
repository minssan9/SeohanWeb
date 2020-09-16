package com.seohan.erp.general.Repository;

import com.seohan.erp.general.Domain.MngFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<MngFood, Long> {

	List<MngFood> findByCompanycodeAndGdate(String companycode, String gdate);
}
