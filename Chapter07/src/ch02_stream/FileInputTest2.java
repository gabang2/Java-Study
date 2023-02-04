package ch02_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace(); // ��� ������ ������ Ȯ���� �� ����
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
	}
}