package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i=i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 뒤에가 실행되지 않았기 때문에 i는 변하지 않음 - 단락 회로 평가 때문
		
		value = ((num1 = num1 + 10) < 10) || ((i=i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 뒤에가 실행되었기 때문에 i는 변함

	}

}
