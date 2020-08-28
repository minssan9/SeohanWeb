package com.seohan.dev.temp.Service;

import com.seohan.dev.Dto.TemperdtDto;
import com.seohan.dev.temp.Domain.TemperdtEntity;
import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import com.seohan.erp.prod.Dto.ProdPlanDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TemperdtService {
    public TemperdtEntity save(TemperdtDto temperdtDto);
}