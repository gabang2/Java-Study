package ch02_stream;

import java.io.Console;

public class consoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine();
		System.out.print("�̸� : ");
		System.out.println(name);
		
		char[] password = console.readPassword();
		System.out.print("��й�ȣ : ");
		System.out.println(password);
		
	}

}
