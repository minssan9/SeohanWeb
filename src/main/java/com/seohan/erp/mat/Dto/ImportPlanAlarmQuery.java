
package com.seohan.erp.mat.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ImportPlanAlarmQuery {
    private String      userid;
    private String      workdate;
    private String      fromdate;
    private String      todate;

}
