package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.ItmblpfsubDto;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItmblpfsubService {
    ItmblpfsubEntity moveLocation(ItmblpfsubDto itmblpfsubDto) throws Exception;

    boolean validCheckLocationCode(String warehouse, String location);
}