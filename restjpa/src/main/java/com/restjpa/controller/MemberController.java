package com.restjpa.controller;

import java.time.Instant;
import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restjpa.db.entity.TbMasterLogin;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class MemberController {
	
	@PostMapping("/login")
	public String getLogin(@RequestBody TbMasterLogin tbMasterLogin) {
		
		
		
//		Jwts.builder()
//		.setSubject("1234567890")
//		.setId("1f6de337-e6e9-4e70-ba79-db6341de98c9")
//		.setIssuedAt(Date.from(Instant.ofEpochSecond(1531393478)))
//		.setExpiration(Date.from(Instant.ofEpochSecond(1531397078)))
//		.claim("user", user)
//		.claim("pass", pass)
//		.signWith(SignatureAlgorithm.HS256, "secret".getBytes("UTF-8"))
//		.compact();
		return tbMasterLogin.toString();
	}
	
	@PostMapping("/logout")
	public String getLogout(@RequestBody TbMasterLogin tbMasterLogin) {
		return tbMasterLogin.toString();
	}
}
