package com.seohan.mat.Mapper;

import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Domain.ItemBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImportPlanRepository extends JpaRepository<ImportPlan, Long> {
	@Override
	List<ImportPlan> findAll();

	ItemBalance findByWarhsAndItmno(String warhs, String itmno);

	List<ImportPlan> findByStat(String stat);
	List<ImportPlan> importPlanListbyUdate(String udate);
}
