package com.cslg.action;

import java.sql.SQLException;

import com.cslg.Bean.RegistBean;
import com.cslg.dao.RegistDao;

public class RegistAction {
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

	public String execute() throws SQLException {
		RegistBean rb = new RegistBean(userName, password, confirmpassword);
		RegistDao rsDao = new RegistDao();
		if (rsDao.regist(rb)) {
			return "success";
		}
		return "error";
	}
}
