package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import org.springframework.stereotype.Service;

@Service
public interface ItemBalanceService {
    void saveBalanceNow();
    void saveBalance(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceCurrentBalance(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceOldByLot(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceOldByDate(ItemBalanceSaveQuery itemBalanceSaveQuery);
    void saveBalanceHeader(ItemBalanceSaveQuery itemBalanceSaveQuery);
}
