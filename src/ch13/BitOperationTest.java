package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1 <<= 2); // 값을바꾸고 싶으면 대입연산자 사용하기
		System.out.println(num1 >> 2);
	}

}
