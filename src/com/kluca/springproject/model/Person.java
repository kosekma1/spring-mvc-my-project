package com.kluca.springproject.model;

import javax.validation.constraints.NotNull;

public class Person {
	
	@NotNull(message="is required")	
	private String firstName;
	
	@NotNull(message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
