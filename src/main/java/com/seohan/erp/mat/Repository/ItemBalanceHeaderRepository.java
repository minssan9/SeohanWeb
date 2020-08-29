package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.ItemBalance;
import com.seohan.erp.mat.Domain.ItemBalanceHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemBalanceHeaderRepository extends JpaRepository<ItemBalanceHeader, Long> {
	@Override
	List<ItemBalanceHeader> findAll();

//	ItemBalanceHeader findByWarhsAndItmno(String warhs, String itmno);

	List<ItemBalanceHeader> findByGdateAndGtimeAndBltype(String gdate, String gtime, String bltype);

	List<ItemBalanceHeader> findByGdateAndGtime(String gdate, String gtime);
}
