package com.assignments.serialization;

public class UserData {
	
	private String name;
	private String username;
	private String email;
	private Address address;
	
	public UserData(String name, String username, String email, Address address) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
	}
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}