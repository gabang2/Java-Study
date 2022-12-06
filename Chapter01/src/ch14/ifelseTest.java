package ch14;

public class ifelseTest {

	public static void main(String[] args) {
		
		int age = 7;
		if (age >= 8) { // 한 줄만 쓸 때에는 중괄호를 안해도 상관없음.
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 안다닙니다.");
		}
		System.out.println("어린이 입니다.");
	}
}
