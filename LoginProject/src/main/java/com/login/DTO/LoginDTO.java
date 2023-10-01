package com.login.DTO;

import java.io.Serializable;

public class LoginDTO implements Serializable { // Data Transfer Object

	private String userName = "";
	private String userpassword = "";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}
