package ch02;

import java.util.Objects;

public class Student implements Cloneable{
	
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public String toString() {
		return studentNum + ", " + studentName;
	}

	@Override
	public int hashCode() {
		return studentNum; // 진짜 해쉬코드 값이 없어지지는 않음.
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentName == std.studentName) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	protected 
	Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
