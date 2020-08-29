
package com.seohan.erp.mat.Dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ImportPlanAlarmQuery {
    private String      userid;
    private String      workdate;
    private String      fromdate;
    private String      todate;

    public String getWorkdate(){
        return this.workdate;
    }

    public ImportPlanAlarmQuery(String userid, String workdate, String fromdate, String todate) {
        this.userid = userid;
        this.workdate = workdate;
        this.fromdate = fromdate;
        this.todate = todate;
    }
}
