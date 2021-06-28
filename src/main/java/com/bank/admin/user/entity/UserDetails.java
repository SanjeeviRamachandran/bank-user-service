package com.bank.admin.user.entity;
import java.awt.event.ActionListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="user_details",schema = "online_bank")
@EntityListeners(ActionListener.class)
@Getter
@Setter
public class UserDetails {
	@Id 
	@Column(name="user_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Integer userId;
	
	@Column(name="user_name",nullable = false,length = 100)
	private String userName;
	
	@Column(name="first_name",nullable = false,length = 100)
	private String firstName;
	
	@Column(name="last_name",nullable = false,length = 100)
	private String lastName;
	
	@Column(name="email_address",nullable = false,length = 100)
	private String emailAddress;
	@Column(name="job_title",nullable = false,length = 100)
	private String jobTitle;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	

}
