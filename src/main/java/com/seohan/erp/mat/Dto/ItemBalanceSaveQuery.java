
package com.seohan.erp.mat.Dto;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ItemBalanceSaveQuery {
    private String      savingDate;
    private String      savingTime;
    private String      oldDate;

}
