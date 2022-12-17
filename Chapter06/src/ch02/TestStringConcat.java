package ch02;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("hello", "world");
		
		// 자바에서는 함수가 마치 변수처럼 쓰인다.
		StringConcat concat2 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "World");
	}

}
