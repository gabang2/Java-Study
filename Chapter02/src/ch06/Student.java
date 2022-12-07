package ch06;

public class Student {
	public int studentNumber; //객체가 만들어질 때 초기화 됨
	public String studentName;
	public int grade;
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고" +  grade + "학년입니다.";
	}
	public Student() {}
	public Student(int studentNumber, String studentName, int grade) { // 생성자
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	
	}
}
