package ch02_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputTest1 {
	public static void main(String[] args) {
		
		try (FileInputStream fis =  new FileInputStream("input2.txt")){
			
			// i = fis.read(bs)���� i�� ����Ǵ� ������ ���, ��ȣ �ȿ� ���ٰ� �ӽ÷� �����Ұ��� ����
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
				for (int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
