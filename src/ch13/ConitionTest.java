package ch13;

import java.util.Scanner; // 라이브러리 사용

public class ConitionTest {

	public static void main(String[] args) {
		// 조건연산자
		int max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력받아서 더 큰 수를 출력하세요\n");
		System.out.println("입력 1: ");
		int num1 = scanner.nextInt();
		System.out.println("입력 2: ");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1:num2;
		System.out.println(max);
		
	}
	
}
