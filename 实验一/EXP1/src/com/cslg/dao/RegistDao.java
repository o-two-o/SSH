package com.cslg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cslg.Bean.RegistBean;
import com.cslg.util.DbUtil;

public class RegistDao {
	public boolean regist(RegistBean registBean) throws SQLException {
		DbUtil dbUtil = new DbUtil();
		Connection con = dbUtil.getConnection();
		if (!registBean.getPassword().equals(registBean.getConfirmpassword())) {
			con.close();
			dbUtil.closeConnecction();
			return false;
		}
		String sql = "select * from user where name =? and password =?";
		PreparedStatement ptmt = con.prepareStatement(sql);
		ptmt.setString(1, registBean.getUserName());
		ptmt.setString(2, registBean.getPassword());
		System.out.println(registBean.getUserName());
		System.out.println(registBean.getPassword());
		ResultSet rs = ptmt.executeQuery();

		if (rs.next()) {
			rs.close();
			ptmt.close();
			con.close();
			dbUtil.closeConnecction();
			return false;
		}
		sql = "INSERT INTO user values(?,?)";

		ptmt = con.prepareStatement(sql);
		ptmt.setString(1, registBean.getUserName());
		ptmt.setString(2, registBean.getPassword());
		int result = ptmt.executeUpdate();
		if (result == 1) {
			ptmt.close();
			con.close();
			dbUtil.closeConnecction();
			return true;
		}
		ptmt.close();
		con.close();
		dbUtil.closeConnecction();
		return false;

	}

}
