package org.college;

public class Student extends Dept {
	public void studentName() {
	System.out.println("student name : raja");

	}
public void studentDept() {
	System.out.println("student dept : ECE");

}
public void studentId() {
	System.out.println("student id : ECE423");

}
public static void main(String[] args) {
 Student stu = new Student();
 stu.collegeName();
 stu.collegeCode();
 stu.ccollegeRank();
 stu.hostelName();
 stu.deptName();
 stu.studentName();
 stu.studentDept();
 stu.studentId();
}
}
