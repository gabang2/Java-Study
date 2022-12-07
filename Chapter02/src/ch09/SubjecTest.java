package ch09;

public class SubjecTest {

	public static void main(String[] args) {
		Student studentKim = new Student(100, "Gayeong");
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMathSubject("수학", 80);
		
		studentKim.showScoreInfo();
		
		Student studentLee = new Student(100, "Ayeong");
		studentLee.setKoreaSubject("국어", 80);
		studentLee.setMathSubject("수학", 80);
		
		studentLee.showScoreInfo();
	}

}
