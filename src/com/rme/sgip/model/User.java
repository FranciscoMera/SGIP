package com.rme.sgip.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private String permition;
	
	public User() {
		
	}

	public User(String name, String password, String permition) {
		super();
		this.name = name;
		this.password = password;
		this.permition = permition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPermition() {
		return permition;
	}

	public void setPermition(String permition) {
		this.permition = permition;
	}
	

}
