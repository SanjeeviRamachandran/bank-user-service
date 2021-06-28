package com.bank.admin.user.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationErrorMappingBean {
	private Map<String,String> fieldMappings;

	public ValidationErrorMappingBean(Map<String, String> fieldMappings) {
		super();
		this.fieldMappings = fieldMappings;
	}

	public Map<String,String> getFieldMappings(){
		return fieldMappings;
	}

}
