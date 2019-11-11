package com.cslg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cslg.Bean.LoginBean;
import com.cslg.util.DbUtil;

public class LoginDao {

	public boolean Login(LoginBean loginBean) throws SQLException {
		DbUtil dbUtil = new DbUtil();
		Connection con = dbUtil.getConnection();
		String sql = "select * from user where name =? and password =?";
		PreparedStatement ptmt = con.prepareStatement(sql);
		ptmt.setString(1, loginBean.getUserName());
		ptmt.setString(2, loginBean.getPassword());
		ResultSet rs = ptmt.executeQuery();
		if (rs.next()) {
			rs.close();
			ptmt.close();
			con.close();
			dbUtil.closeConnecction();
			return true;
		}
		rs.close();
		ptmt.close();
		con.close();
		dbUtil.closeConnecction();
		return false;
	}
}
