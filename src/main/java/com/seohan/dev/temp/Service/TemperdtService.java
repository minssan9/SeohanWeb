package com.seohan.dev.temp.Service;

import com.seohan.dev.temp.Dto.TemperdtDto;
import com.seohan.dev.temp.Domain.TemperdtEntity;
import org.springframework.stereotype.Service;

@Service
public interface TemperdtService {
    public TemperdtEntity save(TemperdtDto temperdtDto);
}