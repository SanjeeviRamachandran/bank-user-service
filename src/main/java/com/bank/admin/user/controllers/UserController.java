package com.bank.admin.user.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.admin.user.model.UserDetailsRequest;
import com.bank.admin.user.model.UserDetailsResponse;
import com.bank.admin.user.service.UserService;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/admin")
@Slf4j
@RequiredArgsConstructor
public class UserController {
	/**
	 * Creates a new user
	 */
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<UserDetailsResponse<?>>getAllUser(){
		
		List<UserDetailsRequest> userDetails = userService.getAllUsers();
		UserDetailsResponse<List<UserDetailsRequest>> userDetailsRes = new UserDetailsResponse<>(userDetails);
        return ResponseEntity.ok(userDetailsRes);

		
	}

}
