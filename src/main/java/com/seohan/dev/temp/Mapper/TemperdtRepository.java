package com.seohan.dev.temp.Mapper;

import com.seohan.dev.temp.Domain.TemperdtEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperdtRepository extends JpaRepository<TemperdtEntity, Long> {

}
