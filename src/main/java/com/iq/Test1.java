package com.iq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class Test1 {
	
	
	private static int j=0;
	private static boolean methodB(int k) {
		j+=k;
		return true;
	}
	
	private static void methodA(int i) {
		boolean b;
		b=i<10|methodB(4);
		b=i<10||methodB(8);
		b=i<10&methodB(8);
		b=i<10&&methodB(8);
	}

	public static void main(String[] args) {
//		String s = new String("1");  
//		s.intern();  
//		String s2 = "1";  
//		System.out.println(s == s2);  
		  
//		String s3 = new String("1") + new String("1");  
//		s3.intern();  
//		String s4 = "11";  
//		System.out.println(s3 == s4);  
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "123456");
			 stmt = conn.createStatement();
			String sql = "select  *  from sales ";
			 rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
			System.out.println("aaaa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
