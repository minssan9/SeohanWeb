package com.seohan.dev.temp.Service;

import com.seohan.dev.temp.Dto.TemperdtDto;
import com.seohan.dev.temp.Domain.TemperdtEntity;
import com.seohan.dev.temp.Domain.TemperhdEntity;
import com.seohan.dev.temp.Repository.TemperdtRepository;
import com.seohan.dev.temp.Repository.TemperhdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class TemperdtServiceImpl implements TemperdtService {
    @Autowired
    TemperhdRepository temperhdRepository;

    @Autowired
    TemperdtRepository temperdtRepository;

    public TemperdtEntity save(TemperdtDto temperdtDto) throws NullPointerException{
        TemperdtEntity saveTemperdtEntity = null;
        TemperdtEntity temperdtEntity;

        String savingDateString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        Optional<TemperhdEntity> optionalTemperhdEntity = temperhdRepository.findByIpAddress(temperdtDto.getIpaddress());
        TemperhdEntity temperhdEntity = optionalTemperhdEntity.get();
        if (optionalTemperhdEntity.isPresent()) {
            temperdtEntity = TemperdtEntity.builder()
                    .co_gb(temperhdEntity.getCoGb())
                    .line(temperhdEntity.getLine())
                    .warhs(temperhdEntity.getWarhs())
                    .humidity(temperdtDto.getHumidity())
                    .temper(temperdtDto.getTemper())
                    .dtime(savingDateString)
                    .build();

            saveTemperdtEntity = temperdtRepository.save(temperdtEntity);
        }
        return saveTemperdtEntity ;
    }
}



