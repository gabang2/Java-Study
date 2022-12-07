package ch06;

public class StudentTest {

	public static void main(String[] args) { // client쪽 코드
		Student studentLee = new Student(); //default 생성자 사용
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(20192381, "Gayeong", 4); // 생성자 사용(default 사용자는 아님)
		System.out.println(studentKim.showStudentInfo());
	}

}
