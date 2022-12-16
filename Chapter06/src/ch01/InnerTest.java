package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int iNum = 100;
		static int sInNum = 500;
		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("====================");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InstaticClass{ //정적 내부 클래스
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// 내부 정적 클래스에는 외부클래스의 멤버 변수를 사용할 수 없음
			System.out.println("OutClass num = " +iNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("====================");
		}
		
		static void sTest() { // 내부 정적 클래스의 static메서드 안에는 내부 정적클래스의 멤버 변수 (iNum)을 사용할 수 없음.
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("====================");
		}
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
		// 외부 클래스에서 내부 클래스 사용하기(기본)
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		// 내부 클래스
		OutClass.InClass inner = outClass.new InClass();
		inner.inTest();
		
		// 정적 내부 클래스
		OutClass.InstaticClass sInClass = new OutClass.InstaticClass();
		sInClass.inTest();
		
		// 정적 내부 클래스의 정적 메서드
		OutClass.InstaticClass.sTest();
	}

}
