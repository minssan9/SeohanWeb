package com.seohan.general.Mapper;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	@Query(value="SELECT asabn username, passwd password, '' email, 'USER' role FROM tsilib.EMP_MST a where a.asabn= :asabn",
			nativeQuery=true)
    User findByUsername(@Param("asabn") String asabn);
}
 