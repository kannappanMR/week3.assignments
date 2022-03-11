package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("studentName");

	}
	public void studentDepartment() {
		System.out.println("studentDepartment");

	}
	public void studentId() {
		System.out.println("studentId");

	}
	public static void main(String[] args) {
		Student	obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDepartment();
		obj.studentId();
	}
}
