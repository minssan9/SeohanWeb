package com.seohan.mat.Mapper;

import com.seohan.general.Domain.FoodTable;
import com.seohan.mat.Domain.ItemBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemBalanceRepository extends JpaRepository<ItemBalance, Long> {
	@Override
	List<ItemBalance> findAll();

	ItemBalance findByWarhsAndItmno(String warhs, String itmno);
}
