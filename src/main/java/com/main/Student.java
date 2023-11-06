package com.main;

public class Student {
	private int student_id; 
	private String student_name; 
	private String student_phone; 
	private String student_city; 
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_phone="
				+ student_phone + ", student_city=" + student_city + "]";
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(String student_name, String student_phone, String student_city) {
		super();
		this.student_name = student_name;
		this.student_phone = student_phone;
		this.student_city = student_city;
	}


	
	
	
	public Student(int student_id, String student_name, String student_phone, String student_city) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_phone = student_phone;
		this.student_city = student_city;
	}
	
	
	

}
