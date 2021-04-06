package org.studyeasy.beans;

public class User {
//	Fields:
	private String firstName;
	private String lastName;
//	Constructor:
	public User() {
		firstName = "Default First";
		lastName = "Default Last";
	}	
//	Getters an Setters:
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

}
