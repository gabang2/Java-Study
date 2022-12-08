package ch24;

import java.util.ArrayList;


public class Student {
	
	private int studentId;
	private String studentName;
	private ArrayList<Subject> studentSubjects = new ArrayList<>();
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		studentSubjects.add(new Subject(subjectName, subjectScore));
	}
	
	public void showStudentInfo() {
		System.out.print(studentName+"학생은");
		for (Subject subject:studentSubjects) {
			System.out.print(" " + subject.getSubjectName() + " " + subject.getSubjectScore() + "점,");
		}
		System.out.println("입니다.");
	}
}
