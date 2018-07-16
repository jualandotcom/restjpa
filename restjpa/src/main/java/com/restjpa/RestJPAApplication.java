package com.restjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restjpa.db.TbMasterStatusRepository;

@SpringBootApplication
public class RestJPAApplication {
	
	@Autowired
	private TbMasterStatusRepository tbMasterStatusRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestJPAApplication.class, args);
	}
}
