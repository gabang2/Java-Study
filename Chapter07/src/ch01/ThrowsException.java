package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fls = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.text", "java.lang.Sstring");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) { // 여러 개의 catch 블럭이 있을 경우 Exception블럭은 가장 마지막에 위치
			System.out.println(e);
		}
		System.out.println("end");
	}

}
