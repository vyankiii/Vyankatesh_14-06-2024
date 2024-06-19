package com.deSerializationConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException {

		FileInputStream input = null;
		ObjectInputStream objectInputStream = null;

		try {

			input = new FileInputStream("D:\\Java\\EmployeeObject.txt");
			objectInputStream = new ObjectInputStream(input);

			// Read object from the File
			Employee employee = (Employee) objectInputStream.readObject();
			System.out.println(employee.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			objectInputStream.close();
			input.close();
		}
	}

}
