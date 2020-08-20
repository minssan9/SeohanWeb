
package com.seohan.erp.mat.Dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ItemBalanceSaveQuery {
    private String      nowdate;
    private String      savingtime;
    private String      olddate;

    public ItemBalanceSaveQuery(String nowdate, String savingtime, String olddate) {
        this.nowdate = nowdate;
        this.savingtime = savingtime;
        this.olddate = olddate;
    }
}
