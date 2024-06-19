package com.readingDataFromUser;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter employee Id: ");
		int id = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter employee Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter employee Role: ");
		String role = scanner.nextLine();

		System.out.println("Enter employee Salary: ");
		double salary = scanner.nextDouble();

		scanner.close();

		Employee employee = new Employee(id, name, role, salary);

		System.out.println(employee.toString());

	}

}
