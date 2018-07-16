package com.restjpa.db;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TbMasterStatusRepository extends CrudRepository<TbMasterStatus, Integer> {
	
	@Query("SELECT t FROM TbMasterStatus t WHERE LOWER(t.tbmsName) = LOWER(:tbmsName)")
	List<TbMasterStatus> findByTbmsName(@Param("tbmsName") String tbmsName);
}
