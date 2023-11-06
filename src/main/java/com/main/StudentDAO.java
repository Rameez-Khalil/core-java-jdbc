package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.*;
public class StudentDAO {
	public static boolean inertStudenttoDB(Student st) {
		//jdbc code: 
		Connection conn = ConnectionProvider.createConnection(); 
		String query = "insert into students(student_id, student_name, student_phone, student_city) values(?, ?, ?)";
		//prepared statements: 
		try {
			PreparedStatement prepared = conn.prepareStatement(query);
			//setting parameter values: 
			prepared.setString(1, st.getStudent_name());
			prepared.setString(2, st.getStudent_city());
			prepared.setString(3, st.getStudent_phone());
			prepared.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
