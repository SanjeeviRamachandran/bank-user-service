package com.bank.admin.user.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin/user")
public class HealthCheckController {
	
	@GetMapping("/ruok")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ResponseEntity<String> checkHealth() {		
		
		return ResponseEntity.ok("OK");
	}
	

}
