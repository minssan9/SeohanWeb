package com.seohan.dev.temp.Repository;

import com.seohan.dev.temp.Domain.TemperhdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemperhdRepository extends JpaRepository<TemperhdEntity, Long> {

    Optional<TemperhdEntity> findByIpAddress(String ipAddress);
}
