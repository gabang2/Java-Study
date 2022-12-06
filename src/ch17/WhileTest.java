package ch17;

public class WhileTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum += num; // 지역변수는 자동으로 초기화가 되지 않음.
			num++;
		}
		
		System.out.println(num);
		System.out.println(sum);
	}
	

}
