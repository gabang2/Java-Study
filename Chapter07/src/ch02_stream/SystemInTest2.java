package ch02_stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.print("�Է� �� ���̶�� �ϼ���: ");
		
		try { // ����Ʈ ������ �ڷḦ ���� ��(System.in) �¸� ���ڷ� ��ȯ���ִ� ��(InputStreamReader)
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '��') { // �ѱ��� �̻��ϰ� �� : �ѱ� 2����Ʈ, i�� 1����Ʈ
				System.out.print((char)i); // in stream�� �� ����Ʈ�� ���� �� �ִ�.
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
