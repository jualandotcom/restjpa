package com.restjpa.db.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restjpa.db.entity.TbMasterStatus;

public interface TbMasterStatusRepository extends CrudRepository<TbMasterStatus, Integer> {
	
	@Query("SELECT t FROM TbMasterStatus t WHERE LOWER(t.tbmsName) = LOWER(:tbmsName)")
	List<TbMasterStatus> findByTbmsName(@Param("tbmsName") String tbmsName);
	
	@Query("SELECT t FROM TbMasterStatus t JOIN TbMasterMember m ON t.tbmsId = m.tbMasterStatus2 WHERE LOWER(m.tbmmFirstName) = LOWER(:tbmmFirstName)")
	List<TbMasterStatus> findByTbmmName(@Param("tbmmFirstName") String tbmmFirstName);
}
