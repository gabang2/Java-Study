package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		// 클래스는 컴파일 후 클래스파일이 생성됨
		// 이 클래스파일을 로드하는 Class 클래스
		Class c1 = Class.forName("java.lang.String"); //동적 로드
		Class c2 = String.class;
		String s = new String();
		Class c3 = s.getClass(); //Object메서드로, 인스턴스에서 class가져오기
		
		Constructor[] cons = c1.getConstructors();
		for(Constructor co:cons) {
			System.out.println(co);
		}
		
		System.out.println("=====================");
		Method[] m = c1.getMethods();
		for (Method mth:m) {
			System.out.println(mth);
		}
		
		String str = new String("test");
	}
}
