package ch02_stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.print("입력 후 끝이라고 하세요: ");
		
		try { // 바이트 단위로 자료를 읽을 때(System.in) 걔를 문자로 변환해주는 것(InputStreamReader)
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') { // 한국어 이상하게 됨 : 한글 2바이트, i는 1바이트
				System.out.print((char)i); // in stream은 한 바이트만 받을 수 있다.
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
