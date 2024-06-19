package com.serializationConcept;

import java.io.Serializable;

// Empolyee -> Serialization -> Deserialization
//step-1: class should implements Serializable interface from java.io package
public class Employee implements Serializable {

	private static final long serialVersionUID = 100L;

	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private transient double employeeSalary;// field will not serialize we use transient keyword..
	// The transient keyword in Java is used to indicate that a field should not be
	// serialized when an object is serialized.

	public Employee() {

	}

	// Parameterized constructor
	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + "]";
	}

}
