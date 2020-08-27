package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import org.springframework.stereotype.Service;

@Service
public interface ItemBalanceService {
    void saveBalance();
    void saveBalanceNow(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceOldByLot(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceOldByDate(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceHeader(ItemBalanceSaveQuery itemBalanceSaveQuery);
}
