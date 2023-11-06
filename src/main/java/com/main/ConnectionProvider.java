package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static Connection conn; 
	public static Connection createConnection() {
		try {
			//loading the driver: 
			Class.forName("com.mysql.jdbc.Driver");
			//create the connection: 
			String user = "root"; 
			String password = "root"; 
			String url = "jdbc:mysql:://localhost:3306/student_management";
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return conn; 
	}

}
