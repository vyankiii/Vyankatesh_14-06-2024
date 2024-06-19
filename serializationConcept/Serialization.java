package com.serializationConcept;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException 
	{		
		
		BufferedReader br = null;
		
		FileOutputStream output = null;
		ObjectOutputStream objectOutputStream = null;
		
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter employee Id= ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter employee Name= ");
			String name = br.readLine();
			
			System.out.println("Enter employee Role= ");
			String role = br.readLine();
			
			System.out.println("Enter employee Salary= ");
			double salary = Double.parseDouble(br.readLine());
			
			
			//Employee object
			Employee employee = new Employee(id, name, role, salary);
			
			output = new FileOutputStream("D:\\Java\\EmployeeObject.txt");
			objectOutputStream = new ObjectOutputStream(output);			
			objectOutputStream.writeObject(employee);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			br.close();
			objectOutputStream.close();
			output.close();
		}
	}

}
