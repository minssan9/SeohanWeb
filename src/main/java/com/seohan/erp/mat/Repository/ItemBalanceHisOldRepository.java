package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemBalanceHisOldRepository extends JpaRepository<ItemBalanceHisOld, Long> {
	@Override
	List<ItemBalanceHisOld> findAll();

	List<ItemBalanceHisOld> findByGdateAndGtime(String gdate, String gtime);
}
