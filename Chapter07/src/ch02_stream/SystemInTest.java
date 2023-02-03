package ch02_stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.print("ют╥б: ");
		try {
			int i = System.in.read();
			System.out.println((char)i);
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
