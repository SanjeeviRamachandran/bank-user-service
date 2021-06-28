package com.bank.admin.user.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UserDetailsRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5804225332428528477L;
	private Integer userId;
	private String userName;
	private String firstName;	
	private String lastName;	
	private String emailAddress;
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
