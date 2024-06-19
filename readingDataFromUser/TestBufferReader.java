package com.readingDataFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferReader {

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter employee Id: ");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter employee Name: ");
			String name = br.readLine();

			System.out.println("Enter employee Role: ");
			String role = br.readLine();

			System.out.println("Enter employee Salary: ");
			double salary = Double.parseDouble(br.readLine());

			Employee employee = new Employee(id, name, role, salary);// employee object

			System.out.println(employee.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}

}
