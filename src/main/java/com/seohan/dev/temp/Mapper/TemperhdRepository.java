package com.seohan.dev.temp.Mapper;

import com.seohan.dev.temp.Domain.TemperhdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperhdRepository extends JpaRepository<TemperhdEntity, Long> {

    TemperhdEntity findByIpAddress(String ipAddress);
}
