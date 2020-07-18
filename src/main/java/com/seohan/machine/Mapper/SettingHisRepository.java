package com.seohan.machine.Mapper;

import com.seohan.machine.Domain.SettingHis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettingHisRepository extends JpaRepository<SettingHis, Long> {
	@Override
	List<SettingHis> findAll();

	SettingHis findSettingHisById(long id);

	List<SettingHis> findSettingHisByStat(String stat);

	List<SettingHis> findSettingHisByTestemp(String testemp);

	List<SettingHis> findSettingHisByConfirmemp(String confirmemp);
}
