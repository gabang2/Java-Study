package ch02_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("outputStream.txt", true)){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
