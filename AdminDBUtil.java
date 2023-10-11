package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class AdminDBUtil {
	private static Statement stmt =null;
	private static Connection con=null;
	private static boolean isSuccess;
	private static ResultSet rs= null;
	
	public static boolean validate(String userName, String Password) {
		try {
			con=DBConnectivity.getConnection();
			stmt = con.createStatement();
			String sql="SELECT * FROM AdminLogin WHERE username='"+userName+"'AND password='"+Password+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			con.close();
		}
		catch(Exception e) {
			System.out.print("Validate query failure");
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	
}
