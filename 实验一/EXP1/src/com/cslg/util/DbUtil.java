package com.cslg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private String url = "jdbc:mysql://localhost:3306/user";
	private String user = "root";
	private String password = "wangyiming1123";
	private Connection con = null;

	public DbUtil() {
		try {
			// 1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 获得数据库连接
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return con;
	}
	public void closeConnecction() throws SQLException {
		con.close();
	}
}
