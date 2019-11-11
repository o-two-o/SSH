package com.cslg.action;

import java.sql.SQLException;

import com.cslg.Bean.LoginBean;
import com.cslg.dao.LoginDao;

public class LoginAction {
	private String userName;
	private String password;

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws SQLException {
		LoginBean lb = new LoginBean(userName, password);
		LoginDao ld = new LoginDao();
		if (ld.Login(lb)) {
			return "success";
		}
		return "error";
	}
}
