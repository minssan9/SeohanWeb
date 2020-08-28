package com.seohan.dev.temp.Service;

import com.seohan.dev.Dto.TemperdtDto;
import com.seohan.dev.temp.Domain.TemperdtEntity;
import com.seohan.dev.temp.Domain.TemperhdEntity;
import com.seohan.dev.temp.Mapper.TemperdtRepository;
import com.seohan.dev.temp.Mapper.TemperhdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TemperdtServiceImpl implements TemperdtService {
    @Autowired
    TemperhdRepository temperhdRepository;

    @Autowired
    TemperdtRepository temperdtRepository;

    public TemperdtEntity save(TemperdtDto temperdtDto){
        String savingDateString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        TemperhdEntity temperhdEntity = temperhdRepository.findByIpAddress(temperdtDto.getIpaddress());
        TemperdtEntity temperdtEntity =  TemperdtEntity.builder()
                .co_gb(temperhdEntity.getCoGb())
                .line(temperhdEntity.getLine())
                .warhs(temperhdEntity.getWarhs())
                .humidity(temperdtDto.getHumidity())
                .temper(temperdtDto.getTemper())
                .dtime(savingDateString)
                .build();
        return temperdtRepository.save(temperdtEntity);
    }
}



