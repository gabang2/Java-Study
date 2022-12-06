package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		// for문 중첩반복문
		for( int dan = 2; dan <=9; dan++) {
			for (int count = 1; count<=9; count ++) {
				System.out.println("for문-"+dan+"x"+count+"="+dan*count);
			}
		}
		
		// while문 중첩반복문
		int dan = 2;
		int count = 1;
		while(dan<=9) {
			while(count<=9) {
				System.out.println("while문-"+dan+"x"+count+"="+dan*count);
				count += 1;
			}
			dan += 1;
			count = 1;
		}
	}

}
