package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.ItemBalanceHis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemBalanceHisRepository extends JpaRepository<ItemBalanceHis, Long> {
	ItemBalanceHis findByGdateAndGtimeAndWarhsAndItmno(String gdate, String gtime, String warhs, String itmno);

	List<ItemBalanceHis> findByGdateAndGtime(String gdate, String gtime);
	List<ItemBalanceHis> save(List<ItemBalanceHis> itemBalanceHis);
}
