package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fls = null;
		// Stream을 열었으면 반드시 닫아줘야 함
		try {
			fls = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fls.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("end");
	}
}
