package com.example.management.controller;

import lombok.Data;

@Data
public class PersonForm {

private Integer Number;
	
	private String Name;
	
	public String result;

	
	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
