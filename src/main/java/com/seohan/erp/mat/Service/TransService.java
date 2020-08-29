package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Domain.Trans;

import java.util.List;

public interface TransService {
	List<Trans> TransListByTrsdt(String transDate);
}
