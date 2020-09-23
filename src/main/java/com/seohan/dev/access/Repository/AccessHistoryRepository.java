package com.seohan.dev.access.Repository;

import com.seohan.dev.access.Domain.AccessHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessHistoryRepository extends JpaRepository<AccessHistory, Long> {
	Page<AccessHistory> findAll(Pageable pageable);
}