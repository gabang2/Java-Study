package ch02_stream;

import java.io.Console;

public class consoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine();
		System.out.print("이름 : ");
		System.out.println(name);
		
		char[] password = console.readPassword();
		System.out.print("비밀번호 : ");
		System.out.println(password);
		
	}

}
