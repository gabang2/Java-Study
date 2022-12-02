package ch08;

public class CharacterTest {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //A 출력
		System.out.println((int)ch1); //65출력
		
		char ch2 = 66;
		System.out.println(ch2); //B출력
		System.out.println((char)ch2); //B출력
		
		int ch3 = 67;
		System.out.println(ch3); //67출력
		System.out.println((char)ch3); // C 출력
		
		char han = '한';
		char ch = '\uD55C';
		System.out.println(han); //한 출력
		System.out.println(ch); //한 출력

	}
}
