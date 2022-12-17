package ch02;

interface PrintString{
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdastr = s -> System.out.println(s);
		lambdastr.showString("test");
		showMyString(lambdastr);
		
		PrintString lambdastr2 = returnString();
		lambdastr2.showString("gayeong");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("test2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}
