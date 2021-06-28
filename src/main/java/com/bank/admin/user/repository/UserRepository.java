package com.bank.admin.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.admin.user.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>
{
	UserDetails getByUserId(Integer userId);
}
