package com.restjpa.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.restjpa.db.entity.ViewStatusMember;

public interface ViewStatusRepository extends CrudRepository<ViewStatusMember, Integer> {
	
}
