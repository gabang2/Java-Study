package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); //인스턴스
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "부산 광역시";
		
		studentKim.showStudentInfo();
	}

}
