package com.bank.admin.user.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetailsResponse<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2767229648220953917L;

	/**
	 * 
	 */
	
	private Date timestamp;
	private transient T body;
	private transient List<ValidationErrorMappingBean> errors;
	
	public UserDetailsResponse( T body) {
		super();
		this.timestamp = new Date();
		this.body = body;
		
	}
	
	public UserDetailsResponse(List<ValidationErrorMappingBean> errors ) {
		super();
		this.timestamp = new Date();
		this.errors=errors;
		
	}
	
	public UserDetailsResponse(ValidationErrorMappingBean errors ) {
		super();
		this.timestamp = new Date();
		this.errors=Arrays.asList(errors);
		
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public List<ValidationErrorMappingBean> getErrors() {
		return errors;
	}

	public void setErrors(List<ValidationErrorMappingBean> errors) {
		this.errors = errors;
	}
	
	
	
	
}
