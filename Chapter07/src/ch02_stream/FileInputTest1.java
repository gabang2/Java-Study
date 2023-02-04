package ch02_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace(); // 어디서 에러가 났는지 확인할 수 있음
		}
	}
}
