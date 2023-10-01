package com.login.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.login.DB.DBConnection;
import com.login.DTO.LoginDTO;

public class LoginDAO { // DAta Access Object

	public boolean chkLoginStaff(LoginDTO logindto) {
		// TODO Auto-generated method stub
		boolean isvalidstaff = false;
		System.out.println("LoginDAO isvalidstaff Starts");

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = DBConnection.getConnection();
			String loginQuery = "select username, userpassword from app.login where username = ? and userpassword = ?";
			
//			String loginQuery1 = "select username, usrpassword,from app.login where username = ? and userpassword=?"+ logindto.getUsername()+"'"
//					 +" and userpassword='"+logindto.getUserpassword()+"'";

			ps = con.prepareStatement(loginQuery);
			ps.setString(1, logindto.getUserName());
			ps.setString(2, logindto.getUserpassword());
			rs = ps.executeQuery();
			
			
			while (rs.next()) {
				String username = rs.getString("username");
				System.out.println("LoginDAO chkLoginStaff username : " + username);
				if(username != null && !username.isEmpty()) {
					isvalidstaff = true;
				}else {
					isvalidstaff = false;
				}
				String userpassword = rs.getString("userpassword");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LoginDAO chkLoginStaff Exception" + e);

		}
		System.out.println("LoginDAO chkLoginStaff isvalidstaff : "+isvalidstaff);
		System.out.println("LoginDAO chkLoginStaff Ends");

		return isvalidstaff;
	}

}
