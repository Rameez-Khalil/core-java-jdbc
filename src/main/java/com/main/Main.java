package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		System.out.println("Welcome to the application: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 for add: ");
			System.out.println("Press 2 for delete");
			System.out.println("Press 3 for display");
			System.out.println("Press 4 to exit");
			// Getting user input:
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				// add students:
				System.out.println("Enter user name: ");
				String name = br.readLine();

				System.out.println("Enter user phone: ");
				String phone = br.readLine();

				System.out.println("Enter user city: ");
				String city = br.readLine();
				
				Student student = new Student(name, phone,city);
				System.out.println(student);
			} else if (choice == 2) {
				// delete students
			} else if (choice == 3) {
				// display students
			} else if (choice == 4) {
				break;
			} else {

			}

		}
		System.out.println("Thanks for using the application");
	}

}
