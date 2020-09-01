package com.neuedu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbUtils {
	
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost/test?&useUnicode=true&characterEncoding=utf-8";
	private static final String user = "root";
	private static final String pwd = "root123";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}	
	
	public static Connection getConn() throws SQLException {
		return DriverManager.getConnection(url, user, pwd);
	}	
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println(DbUtils.getConn());
		
	}

}




