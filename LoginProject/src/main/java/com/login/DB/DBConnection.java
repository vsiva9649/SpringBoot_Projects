package com.login.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "password");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("DBConnection Exception : " + e);
		}
		return con;
	}

}
