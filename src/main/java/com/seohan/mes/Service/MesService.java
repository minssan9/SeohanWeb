package com.seohan.mes.Service;

import com.seohan.mes.Domain.Trans;

import java.util.List;

public interface MesService {
	public List<Trans> TransList(Trans trans) throws Exception;
}
