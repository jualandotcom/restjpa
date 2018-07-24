package com.restjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restjpa.db.repository.TbMasterMemberRepository;
import com.restjpa.db.repository.TbMasterStatusRepository;
import com.restjpa.db.repository.ViewStatusRepository;

@RestController
public class TestController {

	@Autowired
	private TbMasterStatusRepository tbMasterStatusRepository;
	
	@Autowired
	private TbMasterMemberRepository tbMasterMemberRepository;
	
	@Autowired
	private ViewStatusRepository viewStatusRepository;
	
//	@GetMapping("/login/{user}/{pass}")
//	public String getLogin(@PathVariable String user, @PathVariable String pass) {
//		return viewStatusRepository.findAll().toString();
//		//return tbMasterStatusRepository.findByTbmsName("Member Status").toString();
//	}
	
	@GetMapping("/test/{param1}")
	public String get(@PathVariable String param1) {
		//return viewStatusRepository.findAll().toString();
		//return tbMasterStatusRepository.findByTbmsName("Member Status").toString();
		return tbMasterStatusRepository.findByTbmmName(param1).get(0).getTbmsName();
	}
}
