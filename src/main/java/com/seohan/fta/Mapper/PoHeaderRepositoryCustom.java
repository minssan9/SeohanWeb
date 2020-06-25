package com.seohan.fta.Mapper;

import com.seohan.fta.Domain.PoHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PoHeaderRepositoryCustom {
    public List<PoHeader> poList(String cogb, String pono);
}
