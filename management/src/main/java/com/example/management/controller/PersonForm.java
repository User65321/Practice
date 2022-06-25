package com.example.management.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class PersonForm {


	   @Size(min = 1, max = 3)
	   private String Number;
	
	   @NotEmpty
	   private String Name;
	
	 public String result;

	
	

	public void setNumber(String Number) {
		this.Number = Number;
	}
	
	public String getNumber() {
		return Number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
}
