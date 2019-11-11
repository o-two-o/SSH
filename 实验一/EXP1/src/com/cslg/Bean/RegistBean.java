package com.cslg.Bean;

public class RegistBean {
	private String userName;
	private String password;
	private String confirmpassword;

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public RegistBean(String userName, String password, String confirmpassword) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

}
