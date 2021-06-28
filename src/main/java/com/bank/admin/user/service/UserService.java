package com.bank.admin.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.admin.user.entity.UserDetails;
import com.bank.admin.user.model.UserDetailsRequest;
import com.bank.admin.user.repository.UserRepository;


//defining the business logic
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<UserDetailsRequest> getAllUsers() {
		List<UserDetailsRequest> userDetails = new ArrayList<UserDetailsRequest>();

		List<UserDetails> userDetailsList = userRepository.findAll();
		
		userDetailsList.forEach(userDet -> {
			
			UserDetailsRequest userReq = new UserDetailsRequest();
			
			userReq.setUserId(userDet.getUserId());
			userReq.setUserName(userDet.getUserName());
			userReq.setFirstName(userDet.getFirstName());
			userReq.setLastName(userDet.getLastName());
			userReq.setJobTitle(userDet.getJobTitle());
			userDetails.add(userReq);		
			
		});
		
		
		return userDetails;
	}
}