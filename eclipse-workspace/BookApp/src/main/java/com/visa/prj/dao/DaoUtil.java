package com.visa.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoUtil {
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/visa_trg_db";
	private static String USER="root";
	private static String PWD="mysqlroot";
	
	static {
		try {
			Class.forName(DRIVER);  //checked exception
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USER,PWD);
	}	
	
	public static void closeConnection(Connection con){ //client has already exited.No need to propagate the error.Handle it here.
		if(con!=null) {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
