package com.seohan.erp.fta.Mapper;

import com.seohan.erp.fta.Domain.PoHeader;

import java.util.List;


public interface PoHeaderRepositoryCustom {
    public List<PoHeader> poList(String cogb, String pono);
}
