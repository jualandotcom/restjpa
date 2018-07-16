package com.restjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restjpa.db.TbMasterMemberRepository;
import com.restjpa.db.TbMasterStatusRepository;

@RestController
public class TestController {

	@Autowired
	private TbMasterStatusRepository tbMasterStatusRepository;
	
	@Autowired
	private TbMasterMemberRepository tbMasterMemberRepository;
	
	@GetMapping("/login/{user}/{pass}")
	public String getLogin(@PathVariable String user, @PathVariable String pass) {
		return tbMasterStatusRepository.findByTbmsName("Member Status").toString();
	}
}
